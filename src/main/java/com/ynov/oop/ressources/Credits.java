package com.ynov.oop.ressources;

import com.ynov.oop.CheckVictoryCondition;


public class Credits extends Ressources implements CheckVictoryCondition {
 
    
    public Credits() {
        super(2, 1);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean isWin(){
        return (this.getValue() == 4);
    }
    @Override
    public String toString(){
        return String.format("Cretids : %d // +%d Crdts/turn", this.getValue(), this.getProduction());
        
    }
}

