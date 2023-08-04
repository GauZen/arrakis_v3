package com.db.grad.javaapi.service;

import ch.qos.logback.core.joran.spi.ElementPath;
import com.db.grad.javaapi.model.Party;
import com.db.grad.javaapi.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyHandler implements PartyService
{
    private PartyRepository itsPartyRepo;

    @Autowired
    public PartyHandler(PartyRepository PartyRepo )
    {
        itsPartyRepo = PartyRepo;
    }

    @Override
    public List<Party> getAllParty()
    {
        return itsPartyRepo.findAll();
    }

    @Override
    public Party addParty(Party theParty)
    {
        return itsPartyRepo.save(theParty);
    }

    @Override
    public long getNoOfParty()
    {
        return itsPartyRepo.count();
    }

    @Override
    public boolean removeParty(long uniqueId)
    {
        boolean result = false;

        Optional<Party> theParty = itsPartyRepo.findById(uniqueId);
        if(theParty.isPresent())
        {
            itsPartyRepo.delete(theParty.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Party getPartyById(long uniqueId)
    {
        return itsPartyRepo.findById(uniqueId).get();
    }

    @Override
    public Party getPartyByTYPE(String TYPE )
    {
        Party PartyToFind = new Party();
        PartyToFind.getTYPE(TYPE);
        List<Party> Party = itsPartyRepo.findByTYPE(PartyToFind);
        Party result = null;

        if( Party.size() == 1)
            result = Party.get(0);

        return result;
    }

    @Override
    public Party updatePartyDetails(Party PartyToUpdate)
    {
        return itsPartyRepo.save(PartyToUpdate);
    }



}

