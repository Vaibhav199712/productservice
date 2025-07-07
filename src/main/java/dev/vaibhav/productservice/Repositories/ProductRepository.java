package dev.vaibhav.productservice.Repositories;

import dev.vaibhav.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository


public interface ProductRepository extends JpaRepository<Product, UUID> {

    //we can write the method name like this and ORM will run the query for me and exceute it,
//    Product findByTitleAndPrice_currency(String title, String  currency);
//
//    //Like this we can run our own query and run it by our own.
//    @Query(value = "select * from product where title = ;title", nativeQuery = true)
//    Product abc(String title) ;



}
