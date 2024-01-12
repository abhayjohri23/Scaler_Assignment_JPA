package com.springDataJPA.Assignment3.DTOs;

import com.springDataJPA.Assignment3.ModelsOrEntities.CategoryEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private String title;
    private String description;
    private Double Price;
    private String imageURL;
    private CategoryEntity category;
}
