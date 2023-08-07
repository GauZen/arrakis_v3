package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;

import java.util.List;

public interface TradeService {
    List<Trade> getAllTrade();

    Trade addTrade(Trade theTrade);

    long getNoOfTrade();

    boolean removeTrade(long uniqueId);

    Trade getTradeById(long uniqueId);

    Trade getTradeByTRADE_DATE(String TRADE_DATE);

    Trade updateTrade(Trade TradeToUpdate);
}
