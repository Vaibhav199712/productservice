package dev.vaibhav.productservice.services;

import dev.vaibhav.productservice.thirdpartyclients.fakestore.FakeStoreProductClient;
import dev.vaibhav.productservice.thirdpartyclients.fakestore.dtos.FakeStoreProductDto;
import dev.vaibhav.productservice.DTOs.GenericProductDto;

import dev.vaibhav.productservice.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService ")
public class FakeStoreProductService  implements ProductService{

    //First level Optimization
    private FakeStoreProductClient fakeStoreProductClient ;

    @Autowired
    public FakeStoreProductService(FakeStoreProductClient fakeStoreProductClient) {
        this.fakeStoreProductClient = fakeStoreProductClient;
    }


    public GenericProductDto convertFakeStoreDtoToGenericProductDto(FakeStoreProductDto fakeStoreProductDto) {
        GenericProductDto genericProductDto = new GenericProductDto() ;
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setCategory(fakeStoreProductDto.getCategory());

        return genericProductDto ;
    }



    @Override
    public List<GenericProductDto> getAllProducts() {


        List<FakeStoreProductDto> fakeStoreProductDtos = fakeStoreProductClient.getAllProducts() ;

        List<GenericProductDto> genericProductDtos = new ArrayList<>() ;
        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos){
            GenericProductDto genericProductDto = convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto) ;

            genericProductDtos.add(genericProductDto) ;
        }


        return genericProductDtos ;
    }
    //List<FakeStoreProductDto>.class this is not working because of type erasure so use array because
    //java and type erasure dosen't touch it.

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return convertFakeStoreDtoToGenericProductDto(
                fakeStoreProductClient.createProduct(product)) ;
    }

    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {
       return convertFakeStoreDtoToGenericProductDto(
               fakeStoreProductClient.getProductById(id)) ;


    }

    @Override
    public GenericProductDto deleteProduct(Long id) {
       return convertFakeStoreDtoToGenericProductDto(
               fakeStoreProductClient.deleteProduct(id)) ;

    }
    //delete method is not returning anything, so use exchange method, another method is Execute()
    // and both uses each other execute and exchange
}
