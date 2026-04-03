package com.et.EnabledAfricaPlatform.repository.events;

import com.et.EnabledAfricaPlatform.models.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}