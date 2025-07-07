package dev.vaibhav.productservice.inheritanceexample.singletable;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_mentor")
@DiscriminatorValue(value = "1")
public class Mentor extends User {
    private double avgRating ;
}
