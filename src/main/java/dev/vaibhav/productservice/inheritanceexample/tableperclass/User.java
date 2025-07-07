package dev.vaibhav.productservice.inheritanceexample.tableperclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(
        name = "userType" ,
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")

public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String name ;
    private String email ;
}
