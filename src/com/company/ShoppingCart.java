package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList;

    public ShoppingCart(){
        this.itemList = new ArrayList<Item>();
    }

    public String addItem(String name){
        Item item = new Item(name);
        this.itemList.add(item);
        System.out.println(name);
        return name;
    }

    public void printShoppingCart(){
        for(Item item : this.itemList){
            System.out.println(item.toString());        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemList=" + itemList +
                '}';
    }
}
