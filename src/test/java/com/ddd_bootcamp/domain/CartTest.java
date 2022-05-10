package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    public void itShouldAddAnApplePencilToCart() {
        Product product = new Product("pencil", "Apple");
        Cart cart = new Cart();

        cart.add(product);

        List<Product> actual = cart.getProducts();
        assertEquals(1, cart.getProducts().size());
        assertEquals("Apple pencil", actual.get(0).getName());
    }

    @Test
    public void itShouldAddSonyWirelessHeadphone() {
        Product product = new Product("Wireless headphone", "Sony");
        Cart cart = new Cart();

        cart.add(product);

        List<Product> actual = cart.getProducts();
        assertEquals(1, cart.getProducts().size());
        assertEquals("Sony Wireless headphone", actual.get(0).getName());
    }
}