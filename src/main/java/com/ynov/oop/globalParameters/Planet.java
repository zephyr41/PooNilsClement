package com.ynov.oop.globalParameters;

import com.ynov.oop.CheckVictoryCondition;

public class Planet implements CheckVictoryCondition, HaveGlobalParameter {
    /* Variable de type classe */
    private Temperature temperature;
    private Oxygen oxygen;

    @Override
    public boolean isWin(){
       return(this.oxygen.isWin() && this.temperature.isWin()); // dit : si Oxygen && Température sont vrai alors il y a la condition de victoire
    }
    /*Constructeur pour attribuer  */
    public Planet (Temperature t, Oxygen o){
        this.temperature = t;
        this.oxygen = o;

    }
     /*at the end of the turn the warehouse will produce for each of it's ressource */
   
     /* Permet de récupérer la température */
     @Override
     public Temperature getTemperature(){
        return this.temperature;
     }
     /*Permet de récupéré l'oxygen */
     @Override
     public Oxygen getOxygen(){
        return this.oxygen;
     }
     @Override
     public String toString(){
         return String.format(" Your Oxygen is : %s \n Your Temperature is : %s", this.oxygen, this.temperature);
         // Nb 1/
     }
 }


/* Problème : la température doit être modifié une seule fois au début ou on ajoute la température du début, ensuite contenu dans une var et tempancienne += tempfindutour */