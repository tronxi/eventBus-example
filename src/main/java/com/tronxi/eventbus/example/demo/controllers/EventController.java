package com.tronxi.eventbus.example.demo.controllers;

import com.tronxi.eventbus.example.demo.usecases.NonTransactionalCollaboratorUseCase;
import com.tronxi.eventbus.example.demo.usecases.TransactionalCollaboratorUseCase;
import com.tronxi.eventbus.example.demo.usecases.EventBusUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

    private final TransactionalCollaboratorUseCase transactionalCollaboratorUseCase;
    private final NonTransactionalCollaboratorUseCase nonTransactionalCollaboratorUseCase;
    private final EventBusUseCase eventBusUseCase;

    @GetMapping("/step/collaborator/transactional")
    public ResponseEntity<Void> transactional() {
        transactionalCollaboratorUseCase.persist();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/step/collaborator/nonTransactional")
    public ResponseEntity<Void> nonTransactional() {
        nonTransactionalCollaboratorUseCase.persist();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/step/bus")
    public ResponseEntity<Void> transactionalEventBus() {
        eventBusUseCase.persist();
        return ResponseEntity.ok().build();
    }
}
