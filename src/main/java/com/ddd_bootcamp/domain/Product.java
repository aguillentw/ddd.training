package com.ddd_bootcamp.domain;

public class Product {
    private String name;
    private Price price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public Price getPrice() {
        return price;
    }
}