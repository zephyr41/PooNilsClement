package com.ynov.oop.ressources;



public class Steel extends Ressources{
   
    public Steel() {
        super(1, 0);

    }

    @Override
    public String toString(){
        return String.format("\n Steels : %d // +%d Steel/turn", this.getValue(), this.getProduction());
        
    }
}
