package com.db.grad.javaapi.model;


import javax.persistence.*;
@Entity
@Table(name = " BookUser")
public class BookUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long Book_ID;
    private long User_ID;

    public long getBook_ID(){return Book_ID;}
    public long getUser_ID(){return User_ID;}


//    @OneToOne
//    @JoinColumn(name = "book_user")
//    private UserT usert_id;
    @Column(name = "Book_ID",nullable = false)
    public void setBook_ID(long Book_ID){this.Book_ID = Book_ID;}
    @Column(name = "UserID", nullable = false)
    public void setUser_ID(long User_ID){this.User_ID = User_ID;}
}
