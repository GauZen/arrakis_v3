package com.db.grad.javaapi.controller;


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
@RequestMapping("/api/v1")
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

        Map < String, Boolean > response = new HashMap<>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }





}