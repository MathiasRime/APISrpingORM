package com.ynov.productapi.service;


import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.repository.CategoryRepository;
import com.ynov.productapi.transformer.Category.CategoryFull;
import com.ynov.productapi.transformer.Category.CategoryTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryFull> getCategories() {
        Iterable<CategoryModel> categories = categoryRepository.findAll();
        CategoryTransformer transformer = new CategoryTransformer();
        return transformer.transform(categories);
    }
}
