package com.tronxi.eventbus.example.demo.events;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EventType2 {
    String message;

    public EventType2() {
        message = "event type 2";
    }
}
