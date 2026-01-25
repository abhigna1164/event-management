package com.example.project.repository;

import com.example.project.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByEventDateAfter(LocalDate date);

    List<Event> findByEventDateBefore(LocalDate date);

    List<Event> findByStatus(String status);
}
