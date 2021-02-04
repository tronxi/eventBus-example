package com.tronxi.eventbus.example.demo.handlers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tronxi.eventbus.example.demo.events.EventType2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class EventType2Handler {

    private final EventBus eventBus;

    @PostConstruct
    public void register() {
        eventBus.register(this);
    }

    @Subscribe
    public void handler(EventType2 event) {
        System.out.println("EventType2 handler: " + event);
    }
}
