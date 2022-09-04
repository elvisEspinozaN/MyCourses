package com.genspark.mycoursesapi.security;

import com.genspark.mycoursesapi.model.User;
import com.genspark.mycoursesapi.service.UserService;
import com.genspark.mycoursesapi.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author elvisespinoza
 */

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService; // we need userService injection

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // method - find user according to username
        User user= userService.findByUserName(username)
                // if null, return exception :: otherwise authorize according to USER_ROLE
                .orElseThrow(() -> new UsernameNotFoundException(username));

        // authorize according to user ROLE
        // sibling security - provides specific classes to describe authority
        Set<GrantedAuthority> authorities= Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));
        // users can have multiple roles ( designed for that ), thus a set of authorities
        // according to user ROLE ( use conversion in different methods )

        // User Details Service -> User Details -< USER or Custom User.
        // User Details - call it from UserPrinciple
        return UserPrinciple.builder().user(user) // typical builder pattern
                .id(user.getId()).username(user.getUsername())
                .password(user.getPassword()).authorities(authorities)
                .build();
    }
}
