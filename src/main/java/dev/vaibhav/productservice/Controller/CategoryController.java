package dev.vaibhav.productservice.Controller;

import dev.vaibhav.productservice.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")

public class CategoryController {
    private CategoryService categoryService ;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService ;
    }


    @GetMapping("/{uuid}")
    public void getCategory(@PathVariable("uuid") String uuid) {
        categoryService.getCategory(uuid);

    }
}
