package com.ddd_bootcamp.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ddd_bootcamp.domain.service.OrderService;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

  @Test
  public void itShouldHaveCheckedOutOrder() {
    Cart cart = new Cart();
    OrderService orderService = new OrderService();

    orderService.checkOut(cart);

    assertEquals("checked-out", cart.getState());
  }
}