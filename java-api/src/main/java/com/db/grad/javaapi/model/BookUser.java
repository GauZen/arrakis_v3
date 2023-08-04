package com.db.grad.javaapi.model;


import javax.persistence.*;

@Entity
@Table(name = "book_user")
public class BookUser {
    private long book_ID;
    private long user_ID;

    public long getBook_ID() {
        return book_ID;
    }
    @Column(name = "book_ID", nullable = false)
    public void setBook_ID(long book_ID) {
        this.book_ID = book_ID;
    }
    @Column(name = "user_ID", nullable = false)
    public long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }
}
