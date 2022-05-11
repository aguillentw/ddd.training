package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone");
        Item headphoneItem = new Item(headphone,1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil");
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);

        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();
        System.out.println("--------------------------------------------------------");
        System.out.println("items = " + items);
        System.out.println("--------------------------------------------------------");

        cart.remove(applePencilItem);
        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        items = cart.getItems();
        System.out.println("--------------------------------------------------------");
        System.out.println("items = " + items);
        System.out.println("--------------------------------------------------------");
    }

    /*
    * Code Problem 9

Create Order(with Products) when Cart is checked out. Also, Mark Cart as checked out .
 --
 Note –
While Creating Order please do not use Item class but use Product class. Flatten out products in Item, that means, if Cart has  Item with Product “Apple Pencil” and Quantity two, then create two Product objects for “Apple Pencil” and add them to Order’s product list.
 Order order = new Order( List<Product> products)
 * */
}
