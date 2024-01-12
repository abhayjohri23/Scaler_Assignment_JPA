package com.springDataJPA.Assignment3.Controllers;

import com.springDataJPA.Assignment3.DTOs.ProductDTO;
import com.springDataJPA.Assignment3.Services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductServiceImpl productService;
    public ProductController(ProductServiceImpl productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long productID){
        return "Product ID provided is: "+productID;
    }
    @GetMapping("/all")
    public List<ProductDTO> getAllProducts(){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setTitle("OMRON Blood pressure Machine");
        productDTO.setDescription("Check the blood pressure any moment, with ease!");
        productDTO.setPrice(400.0);

        List<ProductDTO> list = new ArrayList<ProductDTO>();
        list.add(productDTO);
        return list;
    }
    @PostMapping("/add/")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return productDTO;
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> updateProduct(@RequestBody ProductDTO productDTO, @PathVariable("id") Long productID){
        return new ResponseEntity(productDTO.toString() + "\n with productID", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ProductDTO deleteProduct(@PathVariable("id") Long productID){
        return null;
    }

}
