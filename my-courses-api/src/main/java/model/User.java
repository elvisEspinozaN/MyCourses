package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author elvisespinoza
 */

@Data // Lombok @Data handles getters / setters / equals / hashCode methods automatically
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false, length = 250)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "create time", nullable = false)
    private LocalDateTime createTime; // logging purposes

    @Enumerated(EnumType.STRING) // store via String value ( readable :: ordinal '#' is default )
    @Column(name = "role", nullable = false)
    private Role role; // roles

}
