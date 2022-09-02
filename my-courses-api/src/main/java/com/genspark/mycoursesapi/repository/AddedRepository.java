package com.genspark.mycoursesapi.repository;

import com.genspark.mycoursesapi.model.Added;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author elvisespinoza
 */

public interface AddedRepository extends JpaRepository<Added, Long> {
    // find the added courses by userId

    

}
