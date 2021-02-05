package com.tronxi.eventbus.example.demo.handlers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tronxi.eventbus.example.demo.events.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class EventHandler {

    private final EventBus eventBus;

    @PostConstruct
    public void register() {
        eventBus.register(this);
    }

    @Subscribe
    public void handler(Event event) {
        System.out.println("Event handler: " + event);
        throw new RuntimeException();
    }
}
