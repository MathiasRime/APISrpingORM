package com.ynov.productapi.repository;

import com.ynov.productapi.model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends CrudRepository<ProductModel, Integer> {
}
