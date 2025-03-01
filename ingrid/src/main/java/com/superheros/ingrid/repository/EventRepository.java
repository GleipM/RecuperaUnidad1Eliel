package com.superheros.ingrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheros.ingrid.entity.Event;

public interface EventRepository extends JpaRepository<Event,Long>{
    
}
