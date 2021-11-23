package com.ynov.productapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private Integer id_product;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public Integer getId_product() { return id_product; }

    public void setId_product(Integer id_product) { this.id_product = id_product; }
}
