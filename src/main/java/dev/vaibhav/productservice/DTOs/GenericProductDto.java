package dev.vaibhav.productservice.DTOs;

import dev.vaibhav.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private Long id ;
    private String title;
    private String description;
    private String image ;
    private String category ;
    private double price ;
}
