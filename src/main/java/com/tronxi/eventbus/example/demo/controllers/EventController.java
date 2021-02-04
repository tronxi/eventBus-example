package com.tronxi.eventbus.example.demo.controllers;

import com.google.common.eventbus.EventBus;
import com.tronxi.eventbus.example.demo.events.EventType1;
import com.tronxi.eventbus.example.demo.events.EventType2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

    private final EventBus eventBus;

    @GetMapping("/event/1")
    public ResponseEntity<Void> sendEventType1() {
        EventType1 eventType1 = new EventType1();
        eventBus.post(eventType1);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/event/2")
    public ResponseEntity<Void> sendEventType2() {
        EventType2 eventType2 = new EventType2();
        eventBus.post(eventType2);
        return ResponseEntity.ok().build();
    }
}
