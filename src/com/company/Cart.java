package com.company;

import java.util.List;

public interface Cart {

    Item addItem(String name);
    Item addItem();
    Item addItem(String name, Long id);
    List<Item> getItemList();
    String deleteItem(String name);

}
