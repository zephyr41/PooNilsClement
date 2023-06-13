package com.ynov.oop.buildings;

import com.ynov.oop.globalParameters.Planet;
import com.ynov.oop.ressources.Cost;


public class Forest  extends Buildings {/* Forest hérite des attributs et des méthodes de buildings */
  
  public static Cost constructionCost = new Cost(0,0,3);
  public Forest(){
    super("SigmaForest");
 }

  /* methodes (action) = Ajoute +1 d'oxygene */
  public void effect(Planet planet) {
    /* Produit +1 */
    planet.getOxygen().increase(1);
  }

  /* Permet de crée une instance (structure / objet) qui s'apelle foret */
  
}
