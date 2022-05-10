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

    @Test
    public void itShouldReturnFalseWhenCartsAreNotEqual() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
        Item item2 = new Item(new Product("Sony Wireless headphone"), 1);

        cart1.add(item1);
        cart2.add(item2);

        assertFalse(cart1.equals(cart2));
    }

    /*Code Problem 6

    As a business User, I would like to differentiate between two Carts, even if they contain same Item ( both carts have Product “Sony Wireless headphone” with 1 quantity)
 --
    Note –
    Two carts where items are same, equality on Carts should return false
    Cart cart1 = Cart();
    Cart cart2 = Cart();
    Item item1 = new Item(new Product(”Sony Wireless headphone"), 1);
            Item item2 = new Item(new Product(”Sony Wireless headphone"), 1);
            cart1.add(item1);
 cart2.add(item2);
 cart1.equals(cart2)  =>  should return false*/

}