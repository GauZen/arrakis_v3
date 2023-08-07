package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Party;

import java.util.List;

public interface PartyService
{
    public List<Party> getAllParty();

    public Party addParty(Party theParty);

    public long getNoOfParty();

    public boolean removeParty(long uniqueId);

    public Party getPartyById(long uniqueId);

    public Party getPartyBytype(String Partytype );

    Party getPartyByType(String type);

    public Party updatePartyDetails(Party PartyToUpdate);
}

