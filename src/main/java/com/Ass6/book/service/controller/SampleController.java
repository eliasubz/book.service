package com.Ass6.book.service.controller;

import com.Ass6.book.service.controller.model.ProductID;
import com.Ass6.book.service.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SampleController {


    @PostMapping("/")
    public String createProduct(@RequestBody final Product product) {
        System.out.println("product: " + product);
        ProductID result = new ProductID(UUID.randomUUID().toString());
        return "Hello world";
        /*ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
                */
    }

}
