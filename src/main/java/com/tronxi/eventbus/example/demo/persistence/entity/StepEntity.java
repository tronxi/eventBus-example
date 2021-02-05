package com.tronxi.eventbus.example.demo.persistence.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "step")
public class StepEntity {

    public StepEntity(String step) {
        this.step = step;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String step;
}
