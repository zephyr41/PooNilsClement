package com.ynov.oop.globalParameters;

import com.ynov.oop.CheckVictoryCondition;

public class Temperature  implements CheckVictoryCondition{
    private int temperatureValue = -30;

public boolean isWin(){
    return (this.temperatureValue >= 8);
}
    /* this method will be used for calculate the taux of oxygen qui est modifié */

    public  void increase(int increaseTemperature) {
        this.temperatureValue += increaseTemperature;
    }
    public boolean isMaximal(){
       return this.temperatureValue >= 8;
    }
    @Override
    public String toString(){
        return String.format("%d°", this.temperatureValue);
        // Nb 1/
    }
}
