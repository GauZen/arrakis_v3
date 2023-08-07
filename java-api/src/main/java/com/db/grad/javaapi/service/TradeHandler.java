package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeHandler implements TradeService
{
    private TradeRepository itsTradeRepo;

    @Autowired
    public TradeHandler(TradeRepository TradeRepo )
    {
        itsTradeRepo = TradeRepo;
    }

    @Override
    public List<Trade> getAllTrade()
    {
        return itsTradeRepo.findAll();
    }

    @Override
    public Trade addTrade(Trade theTrade)
    {
        return itsTradeRepo.save(theTrade);
    }

    @Override
    public long getNoOfTrade()
    {
        return itsTradeRepo.count();
    }

    @Override
    public boolean removeTrade(long uniqueId)
    {
        boolean result = false;

        Optional<Trade> theTrade = itsTradeRepo.findById(uniqueId);
        if(theTrade.isPresent())
        {
            itsTradeRepo.delete(theTrade.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Trade getTradeById(long uniqueId)
    {
        return itsTradeRepo.findById(uniqueId).get();
    }

    @Override
    public Trade getTradeByTRADE_DATE(String TRADE_DATE )
    {
        Trade TradeToFind = new Trade();
        TradeToFind.getTRADE_DATE(TRADE_DATE);
        List<Trade> Trade = itsTradeRepo.findByTRADE_DATE(TradeToFind);
        Trade result = null;

        if( Trade.size() == 1)
            result = Trade.get(0);

        return result;
    }

    @Override
    public Trade updateTrade(Trade TradeToUpdate)
    {
        return itsTradeRepo.save(TradeToUpdate);
    }



}

