package com.company;

public class Item extends GenericItem {

    private String name;

    public Item(){

    }

    public Item(String name){
        super();
        this.name = name;
    }

    public Item(String name, Long id){
        super(id);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}
