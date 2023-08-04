package com.db.grad.javaapi.service;



import com.db.grad.javaapi.model.UserT;
import com.db.grad.javaapi.repository.UserTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserTHandler implements UserTService{

    private UserTRepository userTRepo;

    @Autowired
    public UserTHandler(UserTRepository userTRep )
    {
        userTRepo = userTRep;
    }
    @Override
    public List<UserT> getAllUserT()
    {
        return userTRepo.findAll();
    }

    @Override
    public UserT addUserT(UserT theUserT)
    {
        return userTRepo.save(theUserT);
    }


    @Override
    public boolean removeUserT(long uniqueId)
    {
        boolean result = false;

        Optional<UserT> theUserT = userTRepo.findById(uniqueId);
        if(theUserT.isPresent())
        {
            userTRepo.delete(theUserT.get());
            result = true;
        }

        return  result;
    }




}
