package com.genspark.mycoursesapi.repository;

import com.genspark.mycoursesapi.model.Role;
import com.genspark.mycoursesapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author elvisespinoza
 */

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying // to describe it
    @Query("update User set role = :role where username= :username") // HQL update query ( ':' specifying the params )
    void updateUserRole(@Param("username") String username, @Param("role") Role role); // we expect username and role params
}
