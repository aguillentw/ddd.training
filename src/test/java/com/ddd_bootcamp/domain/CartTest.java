package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    public void itShouldGetRemoveList() {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone");
        Item headphoneItem = new Item(headphone, 1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil");
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);

        cart.remove(applePencilItem);
        assertEquals(cart.getRemovedProducts().get(0).getName(), applePencil.getName());
    }

    @Test
    public void itShouldReturnTrueWhenCartsAreNotEqual() {
        Cart cart1 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);

        cart1.add(item1);

        assertTrue(cart1.equals(cart1));
    }
}