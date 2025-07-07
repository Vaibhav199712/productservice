package dev.vaibhav.productservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    private  String name ;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> product ;
    //because of ManytoOne, it will get list of product

}
