package com.tronxi.eventbus.example.demo.handlers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tronxi.eventbus.example.demo.events.EventType1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class EventType1Handler {

    private final EventBus eventBus;

    @PostConstruct
    public void register() {
        eventBus.register(this);
    }

    @Subscribe
    public void handler(EventType1 event) {
        for(int i = 0; i < 20; i++)
            System.out.println("EventType1 handler: " + event);
    }

    @Subscribe
    public void otherHandler(EventType1 event) {
        for(int i = 0; i < 20; i++)
            System.out.println("other EventType1 handler: " + event);
    }
}
