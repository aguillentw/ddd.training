package com.ddd_bootcamp.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ProductFactoryTest {

  @Test
  public void itShouldMatchCompetitorsPriceBy10Percent() {
    // GIVEN
    ProductFactory productFactory = new ProductFactory(
        Map.of("Apple pencil", new Price(Currency.getInstance("USD"), BigDecimal.valueOf(100)),
            "Sony Wireless Headphones",
            new Price(Currency.getInstance("USD"), BigDecimal.valueOf(1))));

    // WHEN
    Product p = productFactory.createProduct("Apple pencil");

    // THEN
    assertEquals(0, BigDecimal.valueOf(90).compareTo(p.getPrice().getAmount()));
  }
}