package com.tronxi.eventbus.example.demo.collaborators;

import com.tronxi.eventbus.example.demo.events.Event;
import org.springframework.stereotype.Component;

@Component
public class Collaborator {

    public void perform(Event event) {
        System.out.println("process: " + event);
        throw new RuntimeException();
    }
}
