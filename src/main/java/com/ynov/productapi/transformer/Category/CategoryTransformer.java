package com.ynov.productapi.transformer.Category;

import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.model.ProductModel;
import com.ynov.productapi.transformer.Product.ProductLight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryTransformer {

    public CategoryFull transform(CategoryModel category){
        CategoryFull categoryFull = new CategoryFull();
        categoryFull.setCategoryId(category.getCategory_id());
        categoryFull.setName(category.getName());

        for(ProductModel product : category.getProducts()){
            ProductLight productLight = new ProductLight();
            productLight.setId(product.getId());
            productLight.setName(product.getName());
            productLight.setCost(product.getId());
            productLight.setDescription(product.getDescription());

            categoryFull.getProducts().add(productLight);
        }

        return categoryFull;
    }

    public List<CategoryFull> transform(Iterable<CategoryModel> categories) {
        List<CategoryFull> categoriesFull = new ArrayList<>();
        for(CategoryModel category : categories) {
            categoriesFull.add(transform(category));
        }
        return categoriesFull;
    }
}
