package com.db.grad.javaapi.controller;


import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.UserT;
import com.db.grad.javaapi.service.UserTHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "http://localhost:3000")
public class UserTController {

        private UserTHandler userTService;

        @Autowired
        public UserTController(UserTHandler ut){
            userTService = ut;
        }

        @GetMapping("/userT")
        public List<UserT> getAllUserT(){
            return userTService.getAllUserT();
        }
        @PostMapping("/userT")
        public UserT createUserT(@Valid@ RequestBody UserT userT){
            return userTService.addUserT(userT);
        }

        @DeleteMapping("/userT/{id}")
        public Map< String, Boolean > deleteUserT(@PathVariable(value = "id") Long id)
                throws ResourceNotFoundException {
            boolean removed = userTService.removeUserT(id);

            Map < String, Boolean > response = new HashMap<>();
            if( removed )
                response.put("deleted", Boolean.TRUE);
            else
                response.put("deleted", Boolean.FALSE);

            return response;
        }





}
