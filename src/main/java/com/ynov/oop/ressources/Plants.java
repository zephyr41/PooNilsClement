package com.ynov.oop.ressources;
import com.ynov.oop.CheckVictoryCondition;

public class Plants extends Ressources implements CheckVictoryCondition {
 
    
    public Plants() {
        super(0,  0);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean isWin(){
        return (this.getValue() == 4);
    }
    
    @Override
    public String toString(){
        return String.format("Plants : %d // +%d Plts/turn", this.getValue(), this.getProduction());
        // Nb 1/
    }
}
