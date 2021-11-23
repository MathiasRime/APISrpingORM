package com.ynov.productapi.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer cost;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Integer getCost() { return cost; }

    public void setCost(Integer cost) { this.cost = cost; }
}
