package com.ddd_bootcamp.domain;

import java.util.List;

public class Order {

  private List<Product> orderedProducts;

  public Order (List<Product> orderedProducts) {
    this.orderedProducts = orderedProducts;
  }

  public List<Product> getProducts() {
    return orderedProducts;
  }

}