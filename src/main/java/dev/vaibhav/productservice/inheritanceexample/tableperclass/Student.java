package dev.vaibhav.productservice.inheritanceexample.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_student")//msc = mappedSuperClass
@DiscriminatorValue(value = "2")
public class Student extends User {
    private double psp ;
    private String batch ;

}
