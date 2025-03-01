package com.superheros.ingrid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.entity.Organizer;
import com.superheros.ingrid.services.OrganizerService;

@RestController
@RequestMapping("/api/organizer")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public Organizer saveOrganizer(@RequestBody Organizer organizer) {
        return organizerService.saveOrganizer(organizer);
    }
    
    @GetMapping("/{name}")
    public Organizer getOrganizerByName(@PathVariable String name) {
        return organizerService.getOrganizerByName(name);
    }
}
