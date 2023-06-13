package com.ynov.oop;

import com.ynov.oop.buildings.*;
import com.ynov.oop.globalParameters.Planet;
import com.ynov.oop.ressources.Warehouse;

public class GameLoop implements EndTurnAction, CheckVictoryCondition {
    private Warehouse warehouse;
    private Planet planet;
    private Builder builder;
    private int currentgeneration; // Nb tours

    public GameLoop(Warehouse warehouse, Planet planet, Builder builder) {
        this.warehouse = warehouse;
        this.planet = planet;
        this.builder = builder;
    }

    @Override
    public void endTurnAction() {
    this.warehouse.endTurnAction();
        currentgeneration += 1;
    
    }
    @Override
    public String toString(){
        return String.format("In your Warehouse you have: %s\nYour are on %d' turns \n \n", this.warehouse, this.currentgeneration);
    }

    @Override
    public boolean isWin() {
    return (this.planet.isWin() && this.warehouse.isWin());
    }

    public void createBuilding(String buildingTobuild){
        switch(buildingTobuild){
            case "city":
            City city = this.builder.createCity(warehouse);
            if (city != null){
                System.out.println(String.format("\n\n ================ You create a %s", city.getName() + " =================== \n"));
            }
            else if (city == null){
                System.out.println("\n \n ============= You can't build a city  =========== \n \n");
            }
            break;

            case "forest":
            Forest forest = this.builder.createForest((warehouse), planet);
            if (forest != null){
                System.out.println(String.format("\n\n ================ You create a %s", forest.getName() + " =================== \n"));
            }
            else if (forest == null){
                System.out.println("\n \n ============= You can't build a forest  =========== \n \n");
            }
            break;

            case "mine":
            Mine mine =this.builder.createMine(warehouse);
            if (mine != null){
                System.out.println(String.format("\n\n ================ You create a %s", mine.getName() + " =================== \n"));
            }
            else if (mine == null){
                System.out.println("\n \n ============= You can't build a mine  =========== \n \n");
            }
            break;

            case "nuclearPlant":
            NuclearPlant nuclearPlant = this.builder.createNuclearPlant(warehouse, planet);
            if (nuclearPlant != null){
                System.out.println(String.format("\n\n ================ You create a %s", nuclearPlant.getName() + " =================== \n"));
            }
            else if (nuclearPlant == null){
                System.out.println("\n \n ============= You can't build a nuclearPlant  =========== \n \n");
            }
            break;

            case "greenHouse":
            Greenhouse greenhouse = this.builder.createGreenhouse(warehouse);
            if (greenhouse != null){
                System.out.println(String.format("\n\n ================ You create a %s", greenhouse.getName() + " =================== \n"));
            }
            else if (greenhouse == null){
                System.out.println("\n \n ============= You can't build a greenhouse =========== \n \n");
            }
            break;
            
            default: 
            System.out.println("Cannot building batiment");
            break;
        }
    }
    // continue le jeu
}
