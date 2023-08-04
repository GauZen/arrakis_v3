package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;

import java.util.List;

public interface TradeService {


    public List<Trade> getAllTrades();

    public Trade addTrade(Trade theTrade);

    public boolean removeTrade(long uniqueId);


}
