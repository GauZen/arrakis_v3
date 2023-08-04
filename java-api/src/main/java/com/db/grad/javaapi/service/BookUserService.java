package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.BookUser;

import java.util.List;

public interface BookUserService {

    public List<BookUser> getAllBookUsers();

    public BookUser addBookUser(BookUser theBookUser);

    public boolean removeBookUser(long uniqueId);


}
