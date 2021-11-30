package com.ynov.productapi.transformer.Product;

import com.ynov.productapi.model.CommentModel;
import com.ynov.productapi.transformer.Category.CategoryLight;

import java.util.ArrayList;
import java.util.List;

public class ProductFull extends ProductLight {
    private List<CommentModel> comments = new ArrayList<>();
    private List<CategoryLight> categories = new ArrayList<>();

    public List<CommentModel> getComments() {
        return comments;
    }
    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }
    public List<CategoryLight> getCategories() {
        return categories;
    }
    public void setCategories(List<CategoryLight> categories) {
        this.categories = categories;
    }
}
