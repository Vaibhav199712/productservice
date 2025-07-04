package dev.vaibhav.productservice.services;

import dev.vaibhav.productservice.DTOs.GenericProductDto;
import dev.vaibhav.productservice.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    // should return product and controller will call this function, but controller will return DTO,
    // so directly return DTO from service
    public GenericProductDto getProductById(Long id) throws NotFoundException;

    public GenericProductDto createProduct(GenericProductDto genericProductDto) ;

    public List<GenericProductDto>  getAllProducts() ;

    public GenericProductDto deleteProduct(Long id) ;
}
