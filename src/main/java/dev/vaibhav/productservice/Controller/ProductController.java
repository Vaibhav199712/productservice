package dev.vaibhav.productservice.Controller;


import dev.vaibhav.productservice.DTOs.ExceptionDto;
import dev.vaibhav.productservice.DTOs.GenericProductDto;
import dev.vaibhav.productservice.exceptions.NotFoundException;
import dev.vaibhav.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // Common Part for getALlProducts, createProducts
public class ProductController {

    private ProductService productService ;

    //this is Dependency Injection via constructor
    @Autowired
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService ;
    }

    //same // This is field Dependency
    //@Autowired
    // private ProductService productservice ;

    @GetMapping
    public List<GenericProductDto> getAllproducts() {
        return productService. getAllProducts() ;
    }

    @GetMapping("{id}")
    public GenericProductDto getProductsById(@PathVariable("id") Long id) throws NotFoundException { // it will take the id and give it to us by use of pathvarible
        return productService.getProductById(id) ;

    }
    public void updateProductsById() {

    }

    //@RequestBody is converting json into GenericProductDto object and giving it back to me...
    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {
        return productService.createProduct(genericProductDto) ;
    }
    @DeleteMapping("/id")
    public ResponseEntity<GenericProductDto> deleteProduct(@PathVariable("id") Long id) {
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK) ;
        //return productService.deleteProduct(id) ;
    }


    //This is specfic to controller now its handled in globalExceptionhandler
//    @ExceptionHandler(NotFoundException.class )
//    public ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException) {
//        return new ResponseEntity<>(new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()),
//                HttpStatus.NOT_FOUND) ;
//    }
}
