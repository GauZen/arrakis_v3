package com.db.grad.javaapi.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "UserT")
public class UserT {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String NAME;
    private String EMAIL;
    private String ROLE;
    private String PASSWORD;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "Name", nullable = false)
    public String getName() {
        return NAME;
    }

    public void setName(String NAME) {
        this.NAME = NAME;
    }

    @Column(name = "Email", nullable = false)
    public String getEmail() {
        return EMAIL;
    }

    public void setEmail(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    @Column(name = "Role", nullable = false)
    public String getRole() {
        return ROLE;
    }

    public void setRole(String ROLE) {
        this.ROLE = ROLE;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return PASSWORD;
    }

    public void setPassword(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

}
