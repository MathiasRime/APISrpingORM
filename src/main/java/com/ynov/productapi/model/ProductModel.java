package com.ynov.productapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer cost;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @JoinColumn(name = "id_product")
    private List<CommentModel> comments = new ArrayList<>();



    @ManyToMany(
            mappedBy = "products"
    )
    private List<CategoryModel> categories = new ArrayList<>();



    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Integer getCost() { return cost; }

    public void setCost(Integer cost) { this.cost = cost; }

    public List<CommentModel> getComments() { return comments;}

    public List<CategoryModel> getCategories() { return categories; }

    public void setCategories(List<CategoryModel> categories) { this.categories = categories; }

    public void setComments(List<CommentModel> comments) { this.comments = comments;}
}
