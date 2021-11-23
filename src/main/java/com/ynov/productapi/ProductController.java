package com.ynov.productapi;

import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.repository.ProductRepository;
import com.ynov.productapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@RestController
public class ProductController {

       @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<ProductModel> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Integer id){
        Optional<ProductModel> p =productService.getProduct(id);
        if(p.isPresent()) {
            return new ResponseEntity<ProductModel>(p.get(),HttpStatus.OK);
        }
        return new ResponseEntity<ProductModel>(
                HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ProductModel addProduct(@RequestBody ProductModel product){
        return  productService.upsert(product);
    }

    @DeleteMapping("/product/{id}")
    public void DeleteProductById(@PathVariable Integer id){
        productService.deleteProduct(id);
    }

    @PutMapping("/product")
    public ProductModel replaceProduct(@RequestBody ProductModel product){
        return productService.upsert(product);
    }

}
