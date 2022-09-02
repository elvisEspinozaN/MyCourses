package com.genspark.mycoursesapi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author elvisespinoza
 */

@Data // lombok
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "creator", nullable = false)
    private String creator;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "length", nullable = false)
    private Double length;

    @Column(name = "create time", nullable = false)
    private LocalDateTime createTime; // logging purposes

}
