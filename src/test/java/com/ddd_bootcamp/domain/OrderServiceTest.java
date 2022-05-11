package com.ddd_bootcamp.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ddd_bootcamp.domain.service.OrderService;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

  @Test
  public void itShouldHaveCheckedOutOrder() {
    Cart cart = new Cart();
    Product applePencil = new Product("Apple Pencil");
    Item applePencilItem = new Item(applePencil, 1);
    cart.add(applePencilItem);
    Product headphone = new Product("Sony Wireless headphone");
    Item headphoneItem = new Item(headphone,1);
    cart.add(headphoneItem);

    OrderService orderService = new OrderService();

    Order order = orderService.checkOut(cart);

    assertEquals(2, order.getProducts().size());
    assertEquals("checked-out", cart.getState());
  }
}