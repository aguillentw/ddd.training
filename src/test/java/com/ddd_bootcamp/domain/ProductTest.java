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

//    Code Problem 8
//
//    As a Business User, I would like to price my product 10% below competitor price (competitor price is available for product) .
//        --
//    Note – Assume that HashMap/Dictionary of Competitor Product Name and price is available. Competitor Product name matches 1 to 1 with our Product Name.
//    Please do not create pricing discount logic inside Product class. Pass discounted price while creating Product.
//        new Product( ”Apple Pencil", Price(discountedPrice, Currency.getInstance("USD")));
//        new Product( ”Apple Pencil", Price(125, Currency.getInstance("USD"))) – 125 is already discount price
}