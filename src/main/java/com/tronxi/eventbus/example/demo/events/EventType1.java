package com.tronxi.eventbus.example.demo.events;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EventType1 {
    String message;

    public EventType1() {
        message = "Event type 1";
    }
}
