package com.company;

import java.util.List;

public interface Cart {

    Item addItem(String name);
    List<Item> getItemList();
    String deleteItem(String name);

}
