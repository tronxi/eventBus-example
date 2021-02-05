package com.tronxi.eventbus.example.demo.usecases;

import com.google.common.eventbus.EventBus;
import com.tronxi.eventbus.example.demo.events.Event;
import com.tronxi.eventbus.example.demo.persistence.entity.StepEntity;
import com.tronxi.eventbus.example.demo.persistence.repository.StepRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class EventBusUseCase {

    private final StepRepositoryJPA stepRepository;
    private final EventBus eventBus;

    public void persist() {
        StepEntity step1 = new StepEntity("eventBus step1");
        stepRepository.save(step1);
        eventBus.post(new Event());
        StepEntity step2 = new StepEntity("eventBus step2");
        stepRepository.save(step2);
    }
}
