package dev.vaibhav.productservice.services;

import dev.vaibhav.productservice.DTOs.GenericProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{
    @Override
    public GenericProductDto deleteProduct(Long id) {
        return null;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return null;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        System.out.println("Calling from selfProductServiceImpl") ;
        return null;
    }
}
