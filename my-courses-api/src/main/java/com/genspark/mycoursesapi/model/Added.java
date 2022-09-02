package com.genspark.mycoursesapi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author elvisespinoza
 */

@Data
@Entity
@Table(name = "added")
public class Added {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long useerId;

    @ManyToOne(fetch = FetchType.LAZY) // don't specify user, doesn't fetch user table
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false) // use this relation to create foreign key
    private User user;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @ManyToOne(fetch= FetchType.LAZY) // for performance ( courses could be related to multiple additions )
    @JoinColumn(name = "course_id", referencedColumnName = "id", insertable = false, updatable = false)
    // object relation b/w course and added ~ foreign key
    private Course course;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "added_time")
    private LocalDateTime addedTime;
}
