package com.ynov.productapi.service;

import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductModel upsert(ProductModel product){
        return productRepository.save(product);
    }

    public Optional<ProductModel> getProduct(Integer id){
        return productRepository.findById(id);
    }

    public Iterable<ProductModel> getProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    public Iterable<ProductModel> getProductByName(String name){
        return productRepository.findByName(name);
    }
}
