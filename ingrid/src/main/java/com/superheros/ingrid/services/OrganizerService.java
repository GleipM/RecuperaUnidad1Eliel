package com.superheros.ingrid.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.entity.Organizer;
import com.superheros.ingrid.repository.OrganizerRepository;

@Service
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer saveOrganizer(Organizer organizer){
        return organizerRepository.save(organizer);
    }

    public Organizer getOrganizerByName(String name){
        return organizerRepository.findByName(name);
    }
}
