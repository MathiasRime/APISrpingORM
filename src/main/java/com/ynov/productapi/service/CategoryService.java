package com.ynov.productapi.service;


import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.repository.CategoryRepository;
import com.ynov.productapi.transformer.Category.CategoryFull;
import com.ynov.productapi.transformer.Category.CategoryTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryTransformer categoryTransformer;

    public List<CategoryFull> getCategories() {
        return categoryTransformer.transform(categoryRepository.findAll());
    }

    public Optional<CategoryModel> getCategory(Integer idCategory) {
        return categoryRepository.findById(idCategory);
    }

    public CategoryModel saveCategory(CategoryModel category) {
        return categoryRepository.save(category);
    }

}
