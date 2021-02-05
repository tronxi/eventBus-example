package com.tronxi.eventbus.example.demo.usecases;

import com.tronxi.eventbus.example.demo.collaborators.Collaborator;
import com.tronxi.eventbus.example.demo.events.Event;
import com.tronxi.eventbus.example.demo.persistence.entity.StepEntity;
import com.tronxi.eventbus.example.demo.persistence.repository.StepRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionalCollaboratorUseCase {

    private final StepRepositoryJPA stepRepository;
    private final Collaborator collaborator;

    public void persist() {
        StepEntity step1 = new StepEntity("transactional collaborator step1");
        stepRepository.save(step1);
        collaborator.perform(new Event());
        StepEntity step2 = new StepEntity("transactional collaborator step2");
        stepRepository.save(step2);
    }
}
