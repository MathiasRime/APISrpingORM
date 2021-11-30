package com.ynov.productapi.controller;


import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.service.CategoryService;
import com.ynov.productapi.transformer.Category.CategoryFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping ("/categories")
    public List<CategoryFull> getCategories(){  return categoryService.getCategories();  }

    @PostMapping("/category/{idCategory}/{idProduct}")
    public void addProductToCategory(
            @PathVariable(name = "idCategory") Integer idCategory,
            @PathVariable(name ="idProduct")Integer idProduct
            ){
        CategoryModel category = categoryService.getCategory(idCategory).get();

    }
}
