package com.ynov.oop.buildings;


import com.ynov.oop.ressources.Cost;

import com.ynov.oop.ressources.ResourceStockpile;
import com.ynov.oop.globalParameters.Planet;

public class Builder {

    /*
     * ========================== Methodes pour le fichiers builder
     * =========================
     * 1. Vérifier qu'il y ai plus de Credits dans le warehouse que pour le cout du
     * batiment
     * 2. Vérifier qu'il y ai plus de Plantes dans le warehouse que pour le cout du
     * batiment
     * 3. Vérifier qu'il y ai plus de Steels dans le warehouse que pour le cout du
     * batiment
     * 4. Si toutes les conditions sont bonnes renvoyer true sinon renvoyer false
     * 
     * /* methodes pour savoir si on peut crée un batiment
     */

    // Entreport Nom var Cost Nom var
    public boolean canBuild(ResourceStockpile resourceStockpile, Cost constructionCost) {
        // si tu n'a pas assez de credits, de plantes, ou de plantes, tu
        return // retourne vrai ou faux avec une condition
       resourceStockpile.getCredits().getValue() >= constructionCost.credit
                && resourceStockpile.getPlants().getValue() >= constructionCost.plant
                && resourceStockpile.getSteels().getValue() >= constructionCost.steel;
        /*
         * pareil que :
         * return true :
         * }
         * return false
         */
    }

    public City createCity(ResourceStockpile resourceStockpile) {
        if (this.canBuild(resourceStockpile, City.constructionCost)) {
            this.useConstructionCost(resourceStockpile, City.constructionCost);
            City newCity = new City();
            newCity.effect(resourceStockpile);
            return newCity;
        }
        return null;
    }

    private void useConstructionCost(ResourceStockpile resourceStockpile, Cost constructionCost) {
        // ici on va chercher le nombre de fer qu'on a: use permet de décrémenter, elle
        // prend en - le paramètre
        // prix du fer, c'est pareil pour tout
        resourceStockpile.getSteels().use(constructionCost.steel);
        resourceStockpile.getPlants().use(constructionCost.plant);
        resourceStockpile.getCredits().use(constructionCost.credit);

    }

    /*
     * methodes pour crée une foret d'allez chercher les ressources et les modifiés
     */
    public Forest createForest(ResourceStockpile resourceStockpile, Planet planet) {
        if (this.canBuild(resourceStockpile, Forest.constructionCost)) {
           //
            this.useConstructionCost(resourceStockpile, Forest.constructionCost); 
            Forest newForest = new Forest();
            newForest.effect(planet);
            return newForest;
        }
        return null;
    }

    /*
     * methodes pour crée une serre d'allez chercher les ressources et les modifiés
     */
    public Greenhouse createGreenhouse(ResourceStockpile resourceStockpile) {

        if (this.canBuild(resourceStockpile, Greenhouse.constructionCost)) {
            // elle achète le batiment donc diminue nos ressources
            this.useConstructionCost(resourceStockpile, Greenhouse.constructionCost);
            // permet de la crée
            Greenhouse newGreenhouse = new Greenhouse();
            // permet de lui ajouter l'effet
            newGreenhouse.effect(resourceStockpile);
            return newGreenhouse;
        }
        return null;
    }


    /*
     * methodes pour crée une mine d'allez chercher les ressources et les modifiés
     */
    public Mine createMine(ResourceStockpile resourceStockpile) {


        if (this.canBuild(resourceStockpile, Mine.constructionCost)){
          
            this.useConstructionCost(resourceStockpile, Mine.constructionCost);
            Mine newMine = new Mine();
            newMine.effect(resourceStockpile);
            return newMine;
        }
        return null;
    }

    /*
     * methodes pour crée une centrale nucléaire et d'allez chercher les ressources
     * et les modifiés
     */
    public NuclearPlant createNuclearPlant(ResourceStockpile resourceStockpile, Planet planet) {
        if(this.canBuild(resourceStockpile, NuclearPlant.constructionCost)){
            NuclearPlant newNuclearPlant = new NuclearPlant();
            newNuclearPlant.effect(planet);
            return newNuclearPlant;
        }
        return null;
    }
    
}
