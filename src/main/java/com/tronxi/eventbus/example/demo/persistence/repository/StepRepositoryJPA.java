package com.tronxi.eventbus.example.demo.persistence.repository;

import com.tronxi.eventbus.example.demo.persistence.entity.StepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepositoryJPA extends JpaRepository<StepEntity, Integer> {
}
