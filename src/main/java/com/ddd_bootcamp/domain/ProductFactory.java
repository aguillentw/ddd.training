package com.ddd_bootcamp.domain;

import java.math.BigDecimal;
import java.util.Map;

public class ProductFactory {

  private Map<String, Price> competitorProducts;

  public ProductFactory (Map<String, Price> competitorProducts) {
    this.competitorProducts = competitorProducts;
  }

  public Product createProduct(String productName) {
    Price competitorPrice = getCompetitorPrice(productName);

    BigDecimal amount = competitorPrice.getAmount();
    BigDecimal newAmount = amount.multiply(BigDecimal.valueOf(0.9));

    Price newPrice = new Price(competitorPrice.getCurrency(), newAmount);

    return new Product(productName, newPrice);
  }

  private Price getCompetitorPrice(String productName) {
    return competitorProducts.get(productName);
  }
}
