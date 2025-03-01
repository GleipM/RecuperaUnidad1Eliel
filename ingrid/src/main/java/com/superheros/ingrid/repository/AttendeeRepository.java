package com.superheros.ingrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheros.ingrid.entity.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee,Long>{

    Attendee findByEmail(String email);

}
