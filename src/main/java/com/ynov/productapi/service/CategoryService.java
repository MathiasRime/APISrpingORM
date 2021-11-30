package com.ynov.productapi.service;


import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<CategoryModel> getCategories() { return categoryRepository.findAll(); }
}
