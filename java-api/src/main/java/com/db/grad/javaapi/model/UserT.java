package com.db.grad.javaapi.model;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UserT")
public class UserT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name ="USERT_ROLE", joinColumns = @JoinColumn (name="USERT_ID"), inverseJoinColumns = @JoinColumn (name="ROLE_ID"))
    private Set<Role> roles=new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "BOOK_USER",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID")
    )
    private Set<Bond> bonds = new HashSet<>();



    public Set<Bond> getBonds() {
        return bonds;
    }

//    public void setBonds(Set<Bond> bonds) {
//        this.bonds = bonds;
//    }

    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String NAME) {
        this.name = name;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String EMAIL) {
        this.email = EMAIL;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String PASSWORD) {
        this.password = PASSWORD;
    }


    public UserT() {
    }
}
