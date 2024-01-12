package com.springDataJPA.Assignment3.ModelsOrEntities;
import jakarta.persistence.*;


@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entityId", nullable = false)
    private Long id;
}
