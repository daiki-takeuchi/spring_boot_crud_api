package jp.co.gaban.spring_boot_crud_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by takeuchidaiki on 2024/06/30
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mail", unique = true, nullable = false)
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "job")
    private String job;

    @Column(name = "self_introduction")
    private String selfIntroduction;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_user", nullable = false)
    private String createdUser;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "updated_user", nullable = false)
    private String updatedUser;
}
