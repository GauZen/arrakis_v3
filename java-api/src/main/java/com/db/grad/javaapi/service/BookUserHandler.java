package com.db.grad.javaapi.service;



import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookUserHandler implements BookUserService{

    private BookUserRepository BookUserRepo;

    @Autowired
    public BookUserHandler(BookUserRepository BookUserRepo )
    {
        BookUserRepo =BookUserRepo;
    }
    @Override
    public List<BookUser> getAllBookUser()
    {
        return BookUserRepo.findAll();
    }

    @Override
    public BookUser addBookUser(BookUser theBookUser)
    {
        return BookUserRepo.save(theBookUser);
    }


    @Override
    public boolean removeBookUser(long uniqueId)
    {
        boolean result = false;

        Optional<BookUser> theBookUser = BookUserRepo.findById(uniqueId);
        if(theBookUser.isPresent())
        {
            BookUserRepo.delete(theBookUser.get());
            result = true;
        }

        return  result;
    }




}

