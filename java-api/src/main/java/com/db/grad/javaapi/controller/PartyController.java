package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Party;
import com.db.grad.javaapi.service.PartyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class PartyController {
    private PartyHandler PartyService;

    @Autowired
    public PartyController(PartyHandler ds)
    {
        PartyService = ds;
    }

    @GetMapping("/Party")
    public List <Party> getAllPartyDetails() {
        return PartyService.getAllParty();
    }

    @GetMapping("/Party/{id}")
    public ResponseEntity <Party> getPartyDetailsByID(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Party Party = PartyService.getPartyById(id);
        return ResponseEntity.ok().body(Party);
    }

    @PostMapping("/Party")
    public Party createParty(@Valid @RequestBody Party Party) {
        return PartyService.addParty(Party);
    }

    @PutMapping("/Party/{id}")
    public ResponseEntity <Party> updateParty(@PathVariable(value = "id") Long id,
                                              @Valid @RequestBody Party Party) throws ResourceNotFoundException {

        final Party updatedParty = PartyService.updatePartyDetails(Party);
        return ResponseEntity.ok(updatedParty);
    }

    @DeleteMapping("/Party/{id}")
    public Map < String, Boolean > deleteBond(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = PartyService.removeParty(id);

        Map < String, Boolean > response = new HashMap <>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }
}
