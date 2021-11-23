package com.ynov.productapi.service;


import com.ynov.productapi.repository.CommentRepository;
import com.ynov.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void deleteComment(Integer id){ commentRepository.deleteById(id); }
}
