package com.company;

import java.util.List;

import static com.company.GenericItem.count;

public class Main {

    public static void main(String[] args) {

        Cart cart = new ShoppingCartImpl();

        cart.addItem();
        cart.addItem();

        cart.addItem("only name 1");
        cart.addItem("only name 2");

        cart.addItem("both 1", 1111L);
        cart.addItem("both 2", 9999L);


        List<Item> list = cart.getItemList();
        printList(list);

    }

    public static void printList(List<Item> list){
        for (Item item: list) {
            System.out.println(item.toString());
        }
        System.out.println("count: " + count);

    }

}
