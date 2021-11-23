package com.ynov.productapi.repository;


import com.ynov.productapi.model.CommentModel;
import com.ynov.productapi.model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository
        extends CrudRepository<CommentModel, Integer> {
}
