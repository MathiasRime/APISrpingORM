package com.ynov.productapi.controller;


import com.ynov.productapi.service.CategoryService;
import com.ynov.productapi.transformer.Category.CategoryFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping ("/categories")
    public List<CategoryFull> getCategories(){  return categoryService.getCategories();  }
}
