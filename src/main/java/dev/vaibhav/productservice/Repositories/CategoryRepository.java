package dev.vaibhav.productservice.Repositories;

import dev.vaibhav.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
