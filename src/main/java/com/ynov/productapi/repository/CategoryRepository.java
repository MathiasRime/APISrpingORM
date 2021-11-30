package com.ynov.productapi.repository;


import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.model.CommentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository
        extends CrudRepository<CategoryModel, Integer> {
}
