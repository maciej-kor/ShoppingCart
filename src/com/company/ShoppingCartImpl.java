package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl implements Cart{

    List<Item> itemList;

    public ShoppingCartImpl(){
        this.itemList = new ArrayList<>();
    }

    @Override
    public Item addItem() {
        Item item = new Item();
        itemList.add(item);
        return item;
    }

    @Override
    public Item addItem(String name) {
        Item item = new Item(name);
        itemList.add(item);
        return item;
    }

    @Override
    public Item addItem(String name, Long id) {
        Item item = new Item(name, id);
        itemList.add(item);
        return item;
    }

    @Override
    public List<Item> getItemList() {
        return this.itemList;
    }

    @Override
    public String deleteItem(String name) {
        for (Item item : itemList) {
            if (item.getName().equals(name)){
                itemList.remove(item);
            }
        }
        return null;
    }
}
