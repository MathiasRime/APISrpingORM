package com.ynov.productapi.controller;


import com.ynov.productapi.model.CommentModel;
import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.service.CommentService;
import com.ynov.productapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentaireController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/commentaire/{id}")
    public ProductModel addCommentaire(@PathVariable("id") Integer id, @RequestBody CommentModel comment){
        ProductModel existingProduct = productService.getProduct(id).get();

        existingProduct.getComments().add(comment);

        return productService.upsert(existingProduct);
    }

    @DeleteMapping("/commentaire/{id}")
    public void deleteCommentaire(@PathVariable("id") Integer id){
        commentService.deleteComment(id);
    }

}
