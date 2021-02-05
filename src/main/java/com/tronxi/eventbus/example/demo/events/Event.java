package com.tronxi.eventbus.example.demo.events;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Event {
    String message;

    public Event() {
        message = "Event message";
    }
}
