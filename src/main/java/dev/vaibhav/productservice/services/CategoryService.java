package dev.vaibhav.productservice.services;

import dev.vaibhav.productservice.Repositories.CategoryRepository;
import dev.vaibhav.productservice.models.Category;
import dev.vaibhav.productservice.models.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository ;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository ;
    }


    @Transactional
    public void getCategory(String uuid) {
        Optional<Category> categoryOptional = categoryRepository.
                findById(UUID.fromString(uuid))  ;
        Category category = categoryOptional.get() ;
        System.out.println(category);

        List<Product> products = category.getProduct() ;
        System.out.println(products);


    }
}
