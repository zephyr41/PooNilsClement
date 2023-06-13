package com.ynov.oop.ressources;



public class Steel extends Ressources{
   
    public Steel() {
        super(1, 0);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString(){
        return String.format("\n Steels : %d // +%d Steel/turn", this.getValue(), this.getProduction());
        // Nb 1/
    }
}
