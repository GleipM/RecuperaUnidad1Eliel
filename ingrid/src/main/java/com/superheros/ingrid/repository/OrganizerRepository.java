package com.superheros.ingrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheros.ingrid.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer,Long>{

    Organizer findByName(String name);
    
}
