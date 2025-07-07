package dev.vaibhav.productservice.inheritanceexample.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_student")//msc = mappedSuperClass
@DiscriminatorValue(value = "2")
public class Student extends User {
    private double psp ;
    private String batch ;

}
