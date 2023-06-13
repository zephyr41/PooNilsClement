package com.ynov.oop.globalParameters;

import com.ynov.oop.CheckVictoryCondition;

public class Oxygen implements CheckVictoryCondition {
    private int oxygenRate = 0;
    
    
     @Override
    public boolean isWin(){
        return (this.oxygenRate >= 14);
        
    }
    /* this method will be used for calculate the taux of oxygene qui est modifié */

    public void increase(int produceOxygen){
        this.oxygenRate += produceOxygen;
    }
    @Override
    public String toString(){
        return String.format("%d%%", this.oxygenRate);
        
    }
}