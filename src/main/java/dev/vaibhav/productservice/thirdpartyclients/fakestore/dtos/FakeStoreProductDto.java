package dev.vaibhav.productservice.thirdpartyclients.fakestore.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {
    private Long id ;
    private String title;
    private String category ;
    private double price ;
    private String description ;
    private String image ;
}
