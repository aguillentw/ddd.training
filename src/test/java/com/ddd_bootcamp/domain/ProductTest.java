package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void itShouldReturnFalseWhenCartsAreNotEqual() {
        BigDecimal amount = BigDecimal.valueOf(1000);
        Product product = new Product("Sony Wireless headphone", new Price(Currency.getInstance("USD"), amount));
        assertEquals(product.getPrice().getCurrency().getCurrencyCode(), "USD");
        assertEquals(product.getPrice().getAmount(), amount);
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