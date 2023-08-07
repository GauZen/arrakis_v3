package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.TradeHandler;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
=======
>>>>>>> livbranch2
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeController {
<<<<<<< HEAD
    private TradeHandler TradeService;

    @Autowired
    public TradeController(TradeHandler ds)
    {
        TradeService = ds;
    }

    @GetMapping("/Trade")
    public List <Trade> getAllTrade() {
        return TradeService.getAllTrade();
    }

    @GetMapping("/Trade/{id}")
    public ResponseEntity <Trade> getTradeByID(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Trade Trade = TradeService.getTradeById(id);
        return ResponseEntity.ok().body(Trade);
    }

    @PutMapping("/Trade/{id}")
    public ResponseEntity <Trade> updateTrade(@PathVariable(value = "id") Long id,
                                                    @Valid @RequestBody Trade Trade) throws ResourceNotFoundException {

        final Trade updatedTrade = TradeService.updateTrade(Trade);
        return ResponseEntity.ok(updatedTrade);
    }

    @PostMapping("/Trade")
    public Trade createTrade(@Valid @RequestBody Trade Trade) {

        return TradeService.addTrade(Trade);
    }

    @DeleteMapping("/Trade/{id}")
    public Map < String, Boolean > deleteTrade(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = TradeService.removeTrade(id);

        Map < String, Boolean > response = new HashMap <>();
=======

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
>>>>>>> livbranch2
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }
<<<<<<< HEAD
=======


>>>>>>> livbranch2
}
