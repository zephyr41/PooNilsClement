package com.ynov.oop.buildings;

import com.ynov.oop.globalParameters.Planet;
import com.ynov.oop.ressources.Cost;


public class NuclearPlant extends Buildings{ /*  hérite des attributs et des méthodes de buildings */
    public static Cost constructionCost = new Cost(4,2,0);
    public void effect(Planet planet) {
        /* Produit */
        planet.getTemperature().increase(2);
        
    }

   public NuclearPlant(){
    super("NuclearSygma");
 }

}
