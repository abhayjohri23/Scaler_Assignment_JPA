package com.springDataJPA.Assignment3.Controllers;

import com.springDataJPA.Assignment3.DTOs.CategoryDTO;
import com.springDataJPA.Assignment3.Services.CategoryServices;
import com.springDataJPA.Assignment3.UserDefinedExceptions.NoRecordFoundException;
import com.springDataJPA.Assignment3.UserDefinedExceptions.UserDefinedProductExceptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryServices categoryServices;
    public CategoryController(CategoryServices categoryServices){
        this.categoryServices = categoryServices;
    }
    @GetMapping("/{id}")
    public CategoryDTO getCategoryByID(@PathVariable("id") Long categoryID) throws NoRecordFoundException {
        return this.categoryServices.getCategoryByID(categoryID);
    }

    @GetMapping("/all")
    public List<CategoryDTO> lisOfCategories(){
        return this.categoryServices.getAllCategories();
    }

    @ExceptionHandler
    private ResponseEntity<String> categoryExceptionHandler(UserDefinedProductExceptions exception){
        return new ResponseEntity(exception.getMessage(),exception.getStatusCode());
    }
}
