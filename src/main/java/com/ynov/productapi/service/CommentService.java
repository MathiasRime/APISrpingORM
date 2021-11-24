package com.ynov.productapi.service;


import com.ynov.productapi.model.CommentModel;
import com.ynov.productapi.repository.CommentRepository;
import com.ynov.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void deleteComment(Integer id){ commentRepository.deleteById(id); }

    public Optional<CommentModel> getComment(Integer id){ return commentRepository.findById(id);}
}
