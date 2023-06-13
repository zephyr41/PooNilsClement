package com.ynov.oop.buildings;

import com.ynov.oop.ressources.Cost;
import com.ynov.oop.ressources.ResourceStockpile;


public class Mine extends Buildings {

    public static Cost constructionCost = new Cost(0, 1, 0);

    /* Methode (action) ajoute +1 a la production : */
    public void effect(ResourceStockpile resourceStockpile) {
        resourceStockpile.getSteels().increaseProduction(1);
    }
    public Mine(){
        super("MineTchad");
     }
   
}
    