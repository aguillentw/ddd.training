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

    @Test
    public void itShouldAddTwoApplePencils() {
        Product pencil1 = new Product("pencil", "Apple", "1L");
        Product pencil2 = new Product("pencil", "Apple", "2L");
        Cart cart = new Cart();

        cart.add(pencil1);
        cart.add(pencil2);

        List<Product> actual = cart.getProducts();
        assertEquals(2, cart.getProducts().size());
        assertEquals("1L", actual.get(0).getUuid());
        assertEquals("2L", actual.get(1).getUuid());
    }

    // Add 2 quantity of “Apple Pencil” to a Cart.
}