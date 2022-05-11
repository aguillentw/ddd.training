package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {

  private UUID id;
  private List<Item> items = new ArrayList<>();
  private List<Product> removedProducts = new ArrayList<>();
  private String state = "in-progress";

  public Cart() {
    this.id = UUID.randomUUID();
  }

  public void add(Item item) {
    items.add(item);
  }

  public List<Item> getItems() {
    return items;
  }

  public void remove(Item item) {
    Product product = item.getProduct();

    items.removeIf(i -> i.getProduct().getName().equals(product.getName()));

    removedProducts.add(product);
  }

  public List<Product> getRemovedProducts() {
    return removedProducts;
  }

    public String getState() {
        return this.state;
    }

  public void checkOut() {
    this.state = "checked-out";
  }

  @Override
  public String toString() {
    return "Cart{" +
        "items=" + items +
        '}';
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Cart)) {
      return false;
    }

    Cart anotherCart = (Cart) object;
    return anotherCart.id.equals(this.id);
  }

  @Override
  public int hashCode() {
    return this.id.hashCode();
  }
}