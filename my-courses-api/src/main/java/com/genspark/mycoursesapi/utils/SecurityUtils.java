package com.genspark.mycoursesapi.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author elvisespinoza
 */

public class SecurityUtils {
    // util method to use on security classes / methods
    public static final String ROLE_PREFIX= "ROLE_";

    // convert from USER_ROLE to authority
    public static SimpleGrantedAuthority convertToAuthority(String role) {
        // add ROLE_PREFIX to authority if it doesn't exist
        String formattedRole= role.startsWith(ROLE_PREFIX)? role: ROLE_PREFIX+ role;
        // create from formattedRole
        return new SimpleGrantedAuthority(formattedRole);
    }
}
