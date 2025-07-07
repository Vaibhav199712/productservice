package dev.vaibhav.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {


    @Id
    @GeneratedValue(generator = "uuidgenerator")
    @GenericGenerator(name = "uuidgenerator", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "binary(16)", nullable = false, updatable = false)
    //@Column just let it be with the name of id in my sql workbench but here in java use, uuid
    private UUID uuid ;

}
