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

    public Security getSecurityByTradetype(String Tradetype );

    Security getSecurityBytradetype(String tradeType);

    public Security updateSecurity(Security SecurityToUpdate);
}


