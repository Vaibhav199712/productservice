package dev.vaibhav.productservice.inheritanceexample.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_TA")


public class TA extends User {
    private String startTime ;
    private String endtime ;
}
