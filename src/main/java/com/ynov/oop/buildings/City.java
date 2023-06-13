package com.ynov.oop.buildings;

import com.ynov.oop.ressources.Cost;
import com.ynov.oop.ressources.ResourceStockpile;



public class City extends Buildings { /* City hérite des attributs et des méthodes de buildings */

   public static Cost constructionCost = new Cost(1, 0, 0);

   public City(){
      super("SigmaCity");
   }

   public void effect(ResourceStockpile resourceStockpile) {

      resourceStockpile.getCredits().increaseProduction(1);

   }
}


