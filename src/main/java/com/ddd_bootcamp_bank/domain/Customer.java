package com.ddd_bootcamp_bank.domain;

import java.util.List;

public class Customer {
    private List<Account> accounts;
    private Address address;

    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach(
                account -> account.updateAddress(address)
        );
    }
}
