package com.ynov.productapi;

import com.ynov.productapi.model.CategoryModel;
import com.ynov.productapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootApplication
public class ProductapiApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductapiApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		Optional<CategoryModel> optCategory = categoryRepository.findById(1);
		CategoryModel categoryId1 = optCategory.get();

		System.out.println(categoryId1.getName());

		categoryId1.getProducts().forEach(
				product -> System.out.println(product.getName())
		);
	}

}
