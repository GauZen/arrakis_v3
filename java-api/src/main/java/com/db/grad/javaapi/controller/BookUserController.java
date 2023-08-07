package com.db.grad.javaapi.controller;

<<<<<<< HEAD

=======
>>>>>>> livbranch2
import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.service.BookUserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/v2")
@CrossOrigin(origins = "http://localhost:3000")
public class BookUserController {

    private BookUserHandler BookUserService;

    @Autowired
    public BookUserController(BookUserHandler bu){
        BookUserService = bu;
    }

    @GetMapping("/BookUser")
    public List<BookUser> getAllBookUser(){
        return BookUserService.getAllBookUser();
    }
    @PostMapping("/BookUser")
    public BookUser createBookUser(@Valid@ RequestBody BookUser BookUser){

        return BookUserService.addBookUser(BookUser);
    }

    @DeleteMapping("/BookUser/{id}")
    public Map< String, Boolean > deleteBookUserT(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = BookUserService.removeBookUser(id);
=======
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class BookUserController {
    private BookUserHandler bookUserService;

    @Autowired
    public BookUserController(BookUserHandler bu)
    {
        bookUserService = bu;
    }

    @GetMapping("/bookuser")
    public List<BookUser> getAllBookUsers() {
        return bookUserService.getAllBookUsers();
    }

    @PostMapping("/bookuser")
    public BookUser createBookUser(@Valid @RequestBody BookUser bookUser) {
        return bookUserService.addBookUser(bookUser);
    }
    @DeleteMapping("/bookuser/{id}")
    public Map< String, Boolean > deleteBookUser(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = bookUserService.removeBookUser(id);
>>>>>>> livbranch2

        Map < String, Boolean > response = new HashMap<>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }
<<<<<<< HEAD





=======
>>>>>>> livbranch2
}