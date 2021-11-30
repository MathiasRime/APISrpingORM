package com.ynov.productapi.transformer.Product;

import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.transformer.Category.CategoryLight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductTransformer {

    public ProductFull transform(ProductModel product) {
        ProductFull productFull = new ProductFull();
        productFull.setId(product.getId());
        productFull.setName(product.getName());
        productFull.setDescription(product.getDescription());
        productFull.setCost(product.getCost());

        for(CategoryModel category : product.getCategories()) {
            CategoryLight categoryLight = new CategoryLight();
            categoryLight.setCategoryId(category.getCategory_id());
            categoryLight.setName(category.getName());
            productFull.getCategories().add(categoryLight);
        }

        productFull.setComments(product.getComments());

        return productFull;
    }

    public List<ProductFull> transform(Iterable<ProductModel> products) {
        List<ProductFull> productsFull = new ArrayList<>();
        for(ProductModel product : products) {
            productsFull.add(transform(product));
        }
        return productsFull;
    }
}
