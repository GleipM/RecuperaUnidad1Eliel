package com.superheros.ingrid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.services.AttendeeService;

@RestController
@RequestMapping("/api/attendee")
public class AttendeeController {
    @Autowired
    private AttendeeService attendeeService;

    @GetMapping
    public List<Attendee> getAllAttendees(){
        return attendeeService.getAllAttendees();
    }

    @GetMapping("/{email}")
    public Attendee getAttendeeByEmail(@PathVariable String email){
        return attendeeService.getAttendeeByEmail(email);
    }

    @PostMapping
    public Attendee saveAttendee(@RequestBody Attendee attendee){
        return attendeeService.saveAttendee(attendee);
    }

}
