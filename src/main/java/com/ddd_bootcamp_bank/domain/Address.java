package com.ddd_bootcamp_bank.domain;

public class Address {

    private String city;

    /*
    Code Problem 10:
 Customer and Bank Account. ( Not related to e-commerce domain)
 When Customer’s Address is updated, update all her Bank Accounts addresses as well. ( This is invariant, or business rules or consistency rule given by business)
 --
 Note –
 Customer is Entity.  Account is Entity.
 Customer has List of bank accounts.
 Customer has Address.  Account has Address
 Address has one attribute called city.
 Address is Value Object
  --  customer.updateAddress(new Address(“Mumbai”))
     */
}
