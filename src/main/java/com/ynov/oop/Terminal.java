package com.ynov.oop;

import java.util.Scanner;


public class Terminal {
    private GameLoop game;
    // définie est une variable de type gameloop
    private Scanner scanner;
    public Terminal(GameLoop game, Scanner scanner) {
        // associe une valeur a la variable gameloop
        this.game = game;
        this.scanner = scanner;

    }

    public void playerInteraction(){
        int actionPlayer = -1;
        do{

            System.out.println(this.game); // corespond au to.Sring de gameLoop
            System.out.println("\n \n \n Possible Action : ");
            System.out.println("1/ Build a City [1 Steel]");
            System.out.println("2/ Plant a Forest [3 Plants]");
            System.out.println("3/ Create a Mine [1 Credit]");
            System.out.println("4/ Constructor Nuclear [4 steel] [2 Credits]");
            System.out.println("5/ Prepare a Greenhouse [2 Credits]");
            System.out.println("6/ next turn");
            
            
           System.out.printf("enter a Int : ");
           actionPlayer = this.scanner.nextInt();
           System.out.print("\033[H\033[2J");  
            switch (actionPlayer){
                case 1:
                this.game.createBuilding("city");
                break;
                case 2:
                this.game.createBuilding("forest");
                break;
                case 3:
                this.game.createBuilding("mine");
                break;
                case 4:
                this.game.createBuilding("nuclearPlant");
                break;
                case 5: 
                this.game.createBuilding("greenHouse");
                case 6: 
                System.out.println("===================== NextTurn ====================");
                break;
                default:
                System.out.println("This is not an action \n\n\n ");
            }
            
        }
        while(actionPlayer != 6);
        
    }

    public void execute(){
        do{
            this.playerInteraction();
            
            game.endTurnAction();
        }
        while (game.isWin() == false);
        System.out.println("Bravo, vous avez Terraformer la planète");
    }
}