package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeHandler implements TradeService{

    private TradeRepository tradeRepo;

    @Autowired
    public TradeHandler(TradeRepository tradeRep )
    {
        tradeRepo = tradeRep;
    }
    @Override
    public List<Trade> getAllTrades()
    {
        return tradeRepo.findAll();
    }

    @Override
    public Trade addTrade(Trade theTrade)
    {
        return tradeRepo.save(theTrade);
    }


    @Override
    public boolean removeTrade(long uniqueId)
    {
        boolean result = false;

        Optional<Trade> theTrade = tradeRepo.findById(uniqueId);
        if(theTrade.isPresent())
        {
            tradeRepo.delete(theTrade.get());
            result = true;
        }

        return  result;
    }
}