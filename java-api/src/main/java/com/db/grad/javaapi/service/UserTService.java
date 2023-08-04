package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.UserT;


import java.util.List;

public interface UserTService {

    public List<UserT> getAllUserT();

    public UserT addUserT(UserT theUserT);

    public boolean removeUserT(long uniqueId);
}
