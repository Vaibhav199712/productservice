package dev.vaibhav.productservice.inheritanceexample.joinedtable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_mentor")
public class Mentor extends User {
    private double avgRating ;
}
