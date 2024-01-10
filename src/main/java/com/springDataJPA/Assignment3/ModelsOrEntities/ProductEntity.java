package com.springDataJPA.Assignment3.ModelsOrEntities;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductEntity extends BaseEntity{
    private String title;
    private String description;
    private Double Price;
}
