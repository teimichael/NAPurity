package stu.napls.napurity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "privilege")
    private String privilege;

    @ManyToOne
    @JoinColumn(name="loginId")
    private Login login;
}
