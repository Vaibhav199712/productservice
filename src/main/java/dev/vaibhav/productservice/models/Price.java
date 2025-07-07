package dev.vaibhav.productservice.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor // because java don't put default constructor
public class Price extends BaseModel{

    private String currency ;
    private double price ;
}
