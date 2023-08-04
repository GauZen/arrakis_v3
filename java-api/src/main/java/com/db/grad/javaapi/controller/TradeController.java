package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.TradeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v3")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeController {

    private TradeHandler tradeService;

    @Autowired
    public TradeController(TradeHandler th){
        tradeService = th;
    }

    @GetMapping("/trade")
    public List<Trade> getAllTrades(){
        return tradeService.getAllTrades();
    }
    @PostMapping("/trade")
    public Trade createTrade(@Valid  @RequestBody Trade trade){
        return tradeService.addTrade(trade);
    }

    @DeleteMapping("/trade/{id}")
    public Map< String, Boolean > deleteTrade(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = tradeService.removeTrade(id);

        Map < String, Boolean > response = new HashMap<>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }


}
