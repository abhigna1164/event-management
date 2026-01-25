package com.example.project.controller;

import com.example.project.model.Event;
import com.example.project.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id,
                             @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    @DeleteMapping("/{id}")
    public String cancelEvent(@PathVariable Long id) {
        eventService.cancelEvent(id);
        return "Event cancelled successfully";
    }

    @GetMapping("/upcoming")
    public List<Event> upcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @GetMapping("/past")
    public List<Event> pastEvents() {
        return eventService.getPastEvents();
    }
}

