package com.company;

import java.util.Random;

public abstract class GenericItem {

    private Long id;
    public static int count;

    public GenericItem(){
        setId(generateId());
        System.out.println("constructor with generated ID");
        count++;
    }

    public GenericItem(Long id){
        System.out.println("constructor with given ID");
        this.setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long generateId(){
        Random random = new Random();
        return random.nextLong()*100;
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "id=" + id +
                '}';
    }
}
