package com.superheros.ingrid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.repository.AttendeeRepository;

@Service
public class AttendeeService {
    @Autowired
    private AttendeeRepository attendeeRepository;

    public List<Attendee> getAllAttendees(){
        return attendeeRepository.findAll();
    }

    public Attendee saveAttendee(Attendee attendee){
        
        return attendeeRepository.save(attendee);
    }

    public Attendee getAttendeeByEmail(String email){
        return attendeeRepository.findByEmail(email);
    }
}
