package com.ynov.oop.buildings;

import com.ynov.oop.ressources.Cost;
import com.ynov.oop.ressources.ResourceStockpile;


public class Greenhouse extends Buildings{ /* Greenhouse hérite des attributs et des méthodes de buildings */

    public static Cost constructionCost = new Cost(0,2,0);
    /* methodes (action) = Ajoute +1 production biomateriel */
    public void effect(ResourceStockpile resourceStockpile) {
        resourceStockpile.getPlants().increaseProduction(1);
    }
    public Greenhouse(){
        super("TchadGreenhouse");
     }
  
}