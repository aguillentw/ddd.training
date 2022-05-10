package com.ddd_bootcamp.domain;

public class Product {
    private String name;
    private String brand;
    private String uuid;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Product(String name, String brand, String uuid) {
        this.name = name;
        this.brand = brand;
        this.uuid = uuid;
    }

    public String getName() {
        return brand + " " +name;
    }

    public String getUuid(){
        return uuid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}