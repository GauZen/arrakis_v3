package com.db.grad.javaapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UserT")
public class UserT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NAME;
    private String EMAIL;
    private String PASSWORD;

//    @ManyToMany
//    @JoinTable(
//            name = "usert_role",
//            joinColumns = @JoinColumn(name = "usert_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    public Set<Role> roles = new HashSet<>();

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return NAME;
    }

    public void setName(String NAME) {
        this.NAME = NAME;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return EMAIL;
    }

    public void setEmail(String EMAIL) {
        this.EMAIL = EMAIL;
    }


//    @Column(name = "role", nullable = false)
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return PASSWORD;
    }

    public void setPassword(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public UserT( String NAME, String EMAIL, String PASSWORD, Set<Role> ROLES) {
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
      //  this.roles = ROLES;
    }

    public UserT() {
    }
}
