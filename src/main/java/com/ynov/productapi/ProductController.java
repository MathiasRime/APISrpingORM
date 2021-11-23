package com.ynov.productapi;

import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public Iterable<ProductModel> getProducts(){
        return productRepository.findAll();
    }
}
