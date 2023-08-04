package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookUserHandler implements BookUserService{

    private BookUserRepository bookUserRepo;

    @Autowired
    public BookUserHandler(BookUserRepository bookUserRep )
    {
        bookUserRepo = bookUserRep;
    }
    @Override
    public List<BookUser> getAllBookUsers()
    {
        return bookUserRepo.findAll();
    }

    @Override
    public BookUser addBookUser(BookUser theBookUser)
    {
        return bookUserRepo.save(theBookUser);
    }


    @Override
    public boolean removeBookUser(long uniqueId)
    {
        boolean result = false;

        Optional<BookUser> theBookUser = bookUserRepo.findById(uniqueId);
        if(theBookUser.isPresent())
        {
            bookUserRepo.delete(theBookUser.get());
            result = true;
        }

        return  result;
    }
}