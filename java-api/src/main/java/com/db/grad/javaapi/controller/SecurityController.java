package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.SecurityHandler;
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
public class SecurityController {
    private SecurityHandler SecurityService;

    @Autowired
    public SecurityController(SecurityHandler ds)
    {
        SecurityService = ds;
    }

    @GetMapping("/Security")
    public List <Security> getAllSecurity() {
        return SecurityService.getAllSecurity();
    }

    @GetMapping("/Security/{id}")
    public ResponseEntity <Security> getSecurityByID(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Security Security = SecurityService.getSecurityById(id);
        return ResponseEntity.ok().body(Security);
    }

    @PostMapping("/Security")
    public Security createSecurity(@Valid @RequestBody Security Security) {

        return SecurityService.addSecurity(Security);
    }

    @PutMapping("/Security/{id}")
    public ResponseEntity <Security> updateSecurity(@PathVariable(value = "id") Long id,
                                              @Valid @RequestBody Security Security) throws ResourceNotFoundException {

        final Security updatedSecurity = SecurityService.updateSecurity(Security);
        return ResponseEntity.ok(updatedSecurity);
    }

    @DeleteMapping("/Security/{id}")
    public Map < String, Boolean > deleteBond(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        boolean removed = SecurityService.removeSecurity(id);

        Map < String, Boolean > response = new HashMap <>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }
}
