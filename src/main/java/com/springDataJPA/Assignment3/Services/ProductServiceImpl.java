package com.springDataJPA.Assignment3.Services;

import com.springDataJPA.Assignment3.ModelsOrEntities.ProductEntity;
import com.springDataJPA.Assignment3.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("productService")
public class ProductServiceImpl implements BaseServiceImpl {
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public ProductEntity getProductById(Long productID) {
        return null;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return null;
    }

    @Override
    public ProductEntity addProduct(ProductEntity productEntity) {
        return null;
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity) {
        return null;
    }

    @Override
    public ProductEntity deleteProductByID(Long productId) {
        return null;
    }
}
