package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//    @ManyToMany(mappedBy = "roles")
//    private Set<UserT> userTS = new HashSet<>();

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<UserT> getUserTS() {
//        return userTS;
//    }
//
//    public void setUserTS(Set<UserT> userTS) {
//        this.userTS = userTS;
//    }

    public Role(String name) {
        this.name = name;
    }
}
