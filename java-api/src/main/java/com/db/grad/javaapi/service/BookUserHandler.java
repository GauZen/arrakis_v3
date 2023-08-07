package com.db.grad.javaapi.service;

<<<<<<< HEAD


=======
>>>>>>> livbranch2
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookUserHandler implements BookUserService{

<<<<<<< HEAD
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
=======
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
>>>>>>> livbranch2
    }

    @Override
    public BookUser addBookUser(BookUser theBookUser)
    {
<<<<<<< HEAD
        return BookUserRepo.save(theBookUser);
=======
        return bookUserRepo.save(theBookUser);
>>>>>>> livbranch2
    }


    @Override
    public boolean removeBookUser(long uniqueId)
    {
        boolean result = false;

<<<<<<< HEAD
        Optional<BookUser> theBookUser = BookUserRepo.findById(uniqueId);
        if(theBookUser.isPresent())
        {
            BookUserRepo.delete(theBookUser.get());
=======
        Optional<BookUser> theBookUser = bookUserRepo.findById(uniqueId);
        if(theBookUser.isPresent())
        {
            bookUserRepo.delete(theBookUser.get());
>>>>>>> livbranch2
            result = true;
        }

        return  result;
    }
<<<<<<< HEAD




}

=======
}
>>>>>>> livbranch2
