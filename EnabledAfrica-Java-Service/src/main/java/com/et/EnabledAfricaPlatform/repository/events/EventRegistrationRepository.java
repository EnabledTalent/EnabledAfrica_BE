package com.et.EnabledAfricaPlatform.repository.events;

import com.et.EnabledAfricaPlatform.models.events.Event;
import com.et.EnabledAfricaPlatform.models.events.EventRegistration;

import com.et.EnabledAfricaPlatform.models.events.UserEvent;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRegistrationRepository
        extends JpaRepository<EventRegistration, Long> {

    boolean existsByEventAndUser(Event event, UserEvent user);
}