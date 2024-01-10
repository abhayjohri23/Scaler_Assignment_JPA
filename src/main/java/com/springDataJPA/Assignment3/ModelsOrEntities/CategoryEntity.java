package com.springDataJPA.Assignment3.ModelsOrEntities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CategoryEntity extends BaseEntity {
    private String categoryName;
}
