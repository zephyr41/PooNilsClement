package com.ynov.oop;

import java.util.Scanner;


import com.ynov.oop.buildings.Builder;
import com.ynov.oop.globalParameters.Oxygen;
import com.ynov.oop.globalParameters.Planet;
import com.ynov.oop.globalParameters.Temperature;
import com.ynov.oop.ressources.Credits;
import com.ynov.oop.ressources.Plants;
import com.ynov.oop.ressources.Steel;
import com.ynov.oop.ressources.Warehouse;

public class Main {
    public static void main(String[] args) { System.out.println("\n \n \n ================================ Bienvenue dans ConquistadorTerraformer ============================================= \n"); 
    Credits credits = new Credits();
    Plants plants = new Plants();
    Steel steel = new Steel();

    Warehouse warehouse = new Warehouse(credits, plants, steel);
    Oxygen oxygen = new Oxygen();
    Temperature temperature = new Temperature();
    Planet planet = new Planet(temperature, oxygen);
    Builder builder = new Builder();

    GameLoop game = new GameLoop(warehouse, planet, builder);
    Scanner scanner = new Scanner(System.in);
    Terminal terminal = new Terminal(game, scanner);
    terminal.execute();
    
}             
}        

