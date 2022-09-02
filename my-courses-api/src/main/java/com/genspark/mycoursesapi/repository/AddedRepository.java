package com.genspark.mycoursesapi.repository;

import com.genspark.mycoursesapi.model.Added;
import com.genspark.mycoursesapi.repository.projection.AddedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author elvisespinoza
 */

public interface AddedRepository extends JpaRepository<Added, Long> {
    // find the added courses by userId
    // use projections to include table joins

    @Query("select "+
            "cour.name as name, add.quantity as quantity, add.addedTime as addedTime"
            + "from Added add left join Course cour on cour.id = add.courseId"+
            "where add.userId= :userId")
    List<AddedItem> findAllCoursesOfUser(@Param("userId") Long userId);
}
