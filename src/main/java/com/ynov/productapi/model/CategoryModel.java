package com.ynov.productapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer category_id;
    private String name;


    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {
                        CascadeType.PERSIST,
                        CascadeType.MERGE })

    @JoinTable(
            name = "category_product",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<ProductModel> products = new ArrayList<>();


    public Integer getCategory_id() { return category_id; }

    public void setCategory_id(Integer category_id) { this.category_id = category_id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<ProductModel> getProducts() { return products; }

    public void setProducts(List<ProductModel> products) { this.products = products; }
}
