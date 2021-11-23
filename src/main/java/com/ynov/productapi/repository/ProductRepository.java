package com.ynov.productapi.repository;

import com.ynov.productapi.model.ProductModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends CrudRepository<ProductModel, Integer> {
    // derived Query
    public Iterable<ProductModel> findByName(String Name);

    @Query(value = "SELECT * FROM products WHERE name = :name", nativeQuery = true)
    public Iterable<ProductModel> findByNameNative(@Param("name") String name);
}
