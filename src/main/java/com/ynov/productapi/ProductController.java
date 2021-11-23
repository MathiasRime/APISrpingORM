package com.ynov.productapi;

import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public Iterable<ProductModel> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Integer id){
        Optional<ProductModel> p =productRepository.findById(id);
        if(p.isPresent()) {
            return new ResponseEntity<ProductModel>(p.get(),HttpStatus.OK);
        }
        return new ResponseEntity<ProductModel>(
                HttpStatus.NOT_FOUND);
    }
}
