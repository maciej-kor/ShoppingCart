package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cart cart = new ShoppingCartImpl();
        cart.addItem("i1");
        cart.addItem("i2");
        cart.addItem("i3");

        List<Item> list = cart.getItemList();
        printList(list);

        cart.deleteItem("i2");
        printList(list);
    }

    public static void printList(List<Item> list){
        for (Item item: list) {
            System.out.println(item.toString());
        }
    }

}
