package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.BookUser;

import java.util.List;

public interface BookUserService {
    List<BookUser> getAllBookUser();

    BookUser addBookUser(BookUser theBookUser);

    boolean removeBookUser(long uniqueId);
}
