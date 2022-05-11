package com.ddd_bootcamp.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
    private Currency currency;
    private BigDecimal amount;

    public Price(Currency currency, BigDecimal price) {
        this.currency = currency;
        this.amount = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
