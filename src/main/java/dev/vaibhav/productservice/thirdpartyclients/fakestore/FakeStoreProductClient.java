package dev.vaibhav.productservice.thirdpartyclients.fakestore;

import org.springframework.stereotype.Component;
import dev.vaibhav.productservice.thirdpartyclients.fakestore.dtos.FakeStoreProductDto;
import dev.vaibhav.productservice.DTOs.GenericProductDto;
import dev.vaibhav.productservice.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Component
public class FakeStoreProductClient {

    //First level Optimization
    private String productURL = "https://fakestoreapi.in/api/products/{id}" ;

    private String ProductRequestURL = "https://fakestoreapi.com/products" ;

    private RestTemplateBuilder restTemplateBuilder ;

    @Autowired
    public FakeStoreProductClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    public List<FakeStoreProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build() ;
        ResponseEntity<FakeStoreProductDto[]> response = restTemplate
                .getForEntity(ProductRequestURL,FakeStoreProductDto[].class) ;

        FakeStoreProductDto[] fakeStoreProductDtos = response.getBody() ;



        return Arrays.asList(fakeStoreProductDtos) ;
    }
    //List<FakeStoreProductDto>.class this is not working because of type erasure so use array because
    //java and type erasure dosen't touch it.


    public FakeStoreProductDto createProduct(GenericProductDto product) {
        RestTemplate restTemplate = restTemplateBuilder.build() ;
        ResponseEntity<FakeStoreProductDto> response = restTemplate.postForEntity(ProductRequestURL
                ,product,
                FakeStoreProductDto.class) ;

        FakeStoreProductDto fakeStoreProductDto = response.getBody() ;


        return fakeStoreProductDto;
    }


    public FakeStoreProductDto getProductById(Long id) throws NotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(
                productURL,
                FakeStoreProductDto.class, id) ;
        //ResponseEntity<T> it should return this with FakeStoreProductDto.
        //getForEntity(String url, Class<T> responseType , Object... uriVariables)
        // class with responseType is same as of the json which fakestoreapi  is providing with extact same data,

        FakeStoreProductDto fakeStoreProductDto = response.getBody() ;

        if (fakeStoreProductDto == null || fakeStoreProductDto.getId() == null) {
            throw new NotFoundException("Product with id " + id + " not found");
        }




        return fakeStoreProductDto ;


    }

    public FakeStoreProductDto deleteProduct(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build() ;
        ResponseEntity<FakeStoreProductDto> response = restTemplate
                .exchange(productURL, HttpMethod.DELETE, null, FakeStoreProductDto.class, id);

        FakeStoreProductDto fakeStoreProductDto = response.getBody() ;


        return fakeStoreProductDto ;
    }
    //delete method is not returning anything, so use exchange method, another method is Execute()
    // and both uses each other execute and exchange
}
