package com.db.grad.javaapi.service;

import ch.qos.logback.core.joran.spi.ElementPath;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecurityHandler implements SecurityService
{
    private SecurityRepository itsSecurityRepo;

    @Autowired
    public SecurityHandler(SecurityRepository SecurityRepo )
    {
        itsSecurityRepo = SecurityRepo;
    }

    @Override
    public List<Security> getAllSecurity()
    {
        return itsSecurityRepo.findAll();
    }

    @Override
    public Security addSecurity(Security theSecurity)
    {
        return itsSecurityRepo.save(theSecurity);
    }

    @Override
    public long getNoOfSecurity()
    {
        return itsSecurityRepo.count();
    }

    @Override
    public boolean removeSecurity(long uniqueId)
    {
        boolean result = false;

        Optional<Security> theSecurity = itsSecurityRepo.findById(uniqueId);
        if(theSecurity.isPresent())
        {
            itsSecurityRepo.delete(theSecurity.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Security getSecurityById(long uniqueId)
    {
        return itsSecurityRepo.findById(uniqueId).get();
    }

    @Override
    public Security getSecurityByTRADE_TYPE(String TRADE_TYPE )
    {
        Security SecurityToFind = new Security();
        SecurityToFind.getTRADE_TYPE(TRADE_TYPE);
        List<Security> Security = itsSecurityRepo.findByTRADE_TYPE(SecurityToFind);
        Security result = null;

        if( Security.size() == 1)
            result = Security.get(0);

        return result;
    }

    @Override
    public Security updateSecurity(Security SecurityToUpdate)
    {
        return itsSecurityRepo.save(SecurityToUpdate);
    }



}


