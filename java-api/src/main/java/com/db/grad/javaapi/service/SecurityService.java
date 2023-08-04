package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;

import java.util.List;

public interface SecurityService
{
    public List<Security> getAllSecurity();

    public Security addSecurity(Security theSecurity);

    public long getNoOfSecurity();

    public boolean removeSecurity(long uniqueId);

    public Security getSecurityById(long uniqueId);

    public Security getSecurityByTRADE_TYPE(String TRADE_TYPE );

    public Security updateSecurity(Security SecurityToUpdate);
}


