package com.springDataJPA.Assignment3.ModelsOrEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class CategoryEntity extends BaseEntity {
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> listOfProducts;

    public CategoryEntity(String categoryName, List<ProductEntity> listOfProducts) {
        this.categoryName = categoryName;
        this.listOfProducts = listOfProducts;
    }

    public CategoryEntity() {
    }
}
