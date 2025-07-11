package dev.vaibhav.productservice.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private String image ;

    @ManyToOne
    private Category category ;
    @OneToOne(cascade = {CascadeType.REMOVE})
    private Price price ;

}
