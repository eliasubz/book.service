package com.Ass6.book.service.model;

import java.math.BigDecimal;

public class Product {
    private final String id;
    private final String descriptionn;
    private final BigDecimal price;


    public Product(String id, String descriptionn, BigDecimal price) {
        this.id = id;
        this.descriptionn = descriptionn;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public String getDescriptionn() {
        return descriptionn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", descriptionn='" + descriptionn + '\'' +
                ", price=" + price +
                '}';
    }
}
