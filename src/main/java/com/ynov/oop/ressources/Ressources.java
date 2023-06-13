package com.ynov.oop.ressources;
import com.ynov.oop.EndTurnAction;

public class Ressources implements EndTurnAction {
    private int value ;
    private int production ;

    public void increaseProduction(int production){
        this.production += production;
    }

    public int getValue() {
        return this.value;
    }


    public int getProduction() {
        return this.production;
    }
    public void use(int resource_used) {
        this.value = this.value - resource_used;
    }
    protected Ressources(int value, int production ) { /*il est protégé */
        this.value = value;
        this.production = production;
    }
    @Override // mot clé pour dire que cela vient d'une interface
    public void endTurnAction() {
        this.value += this.production;
    }
}
