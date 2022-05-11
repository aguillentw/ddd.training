package com.ddd_bootcamp.domain.service;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Order;
import com.ddd_bootcamp.domain.Product;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

  public Order checkOut(Cart cart) {
    List<Product> cartProducts = cart.getItems().stream().map(i -> i.getProduct()).collect(Collectors.toList());

    Order o = new Order(cartProducts);

    cart.checkOut();

    return o;
  }

}
