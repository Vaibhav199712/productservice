package dev.vaibhav.productservice.inheritanceexample.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_TA")
@DiscriminatorValue(value = "3")


public class TA extends User {
    private String startTime ;
    private String endtime ;
}
