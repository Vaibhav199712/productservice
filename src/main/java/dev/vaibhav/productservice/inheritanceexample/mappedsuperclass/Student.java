package dev.vaibhav.productservice.inheritanceexample.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_student") //msc = mappedSuperClass
public class Student extends User{
    private double psp ;
    private String batch ;

}
