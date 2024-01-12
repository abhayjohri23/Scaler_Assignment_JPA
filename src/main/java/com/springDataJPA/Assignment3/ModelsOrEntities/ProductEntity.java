package com.springDataJPA.Assignment3.ModelsOrEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String imageURL;
    @ManyToOne
    @JoinColumn(name = "category_ref")
    private CategoryEntity category;
}
