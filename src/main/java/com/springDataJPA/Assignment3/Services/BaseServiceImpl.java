package com.springDataJPA.Assignment3.Services;

import com.springDataJPA.Assignment3.ModelsOrEntities.ProductEntity;
import java.util.List;

public interface BaseServiceImpl {
    ProductEntity getProductById(Long productID);
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity productEntity);
    ProductEntity deleteProductByID(Long productId);
}
