package model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author elvisespinoza
 */

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create time", nullable = false)
    private LocalDateTime createTime; // logging purposes

    // roles
}
