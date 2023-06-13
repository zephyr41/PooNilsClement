package com.ynov.oop.ressources;
import com.ynov.oop.CheckVictoryCondition;
import com.ynov.oop.EndTurnAction;

public class Warehouse implements EndTurnAction, CheckVictoryCondition, ResourceStockpile{
    // Stockage + production,
    private Credits credit;
    private Plants plants;
    private Steel steel;

  
    // le overide permet c'est une interface
    @Override
    public void endTurnAction() { // produit les actions de fin de tour et les productions
        this.credit.endTurnAction();
        this.plants.endTurnAction();
        this.steel.endTurnAction();

    }

    @Override
    public boolean isWin() {
        return this.credit.isWin() && this.plants.isWin();
    }
    
    public Warehouse(Credits credits, Plants plants, Steel steel) {
        this.credit = credits;
        this.plants = plants;
        this.steel = steel;
    }

    //le overide permet c'est une interface
    /* Sert à récupérer les valeurs de Credit */
    @Override
    public Credits getCredits() {
        return this.credit;
    }
    @Override
    /* Sert à récupérer les valeurs de Plants */
    public Plants getPlants() {
        return this.plants;
    }
    @Override
    /* Sert à récupérer les valeurs de Steel */
    public Steel getSteels() {
        return this.steel;
    }
    @Override
    public String toString(){
        return String.format("%s\n%s\n%s", this.steel, this.credit, this.plants);
       
    }
}
