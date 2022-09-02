package com.genspark.mycoursesapi.service;

import com.genspark.mycoursesapi.model.Role;
import com.genspark.mycoursesapi.model.User;

import java.util.Optional;

public interface UserService {
    void changeRole(Role newRole, String username);

    Optional<User> findByUserName(String username);

    User saveUser(User user);
}
