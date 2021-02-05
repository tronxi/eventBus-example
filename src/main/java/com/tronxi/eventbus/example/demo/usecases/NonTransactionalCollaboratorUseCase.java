package com.tronxi.eventbus.example.demo.usecases;

import com.tronxi.eventbus.example.demo.collaborators.Collaborator;
import com.tronxi.eventbus.example.demo.events.Event;
import com.tronxi.eventbus.example.demo.persistence.entity.StepEntity;
import com.tronxi.eventbus.example.demo.persistence.repository.StepRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NonTransactionalCollaboratorUseCase {

    private final StepRepositoryJPA stepRepository;
    private final Collaborator collaborator;

    public void persist() {
        StepEntity step1 = new StepEntity("non transactional collaborator step1");
        stepRepository.save(step1);
        collaborator.perform(new Event());
        StepEntity step2 = new StepEntity("non transactional collaborator step2");
        stepRepository.save(step2);
    }
}
