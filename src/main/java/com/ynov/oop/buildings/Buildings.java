package com.ynov.oop.buildings;

public class Buildings {

    private String name;
    
    protected Buildings(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
}

 