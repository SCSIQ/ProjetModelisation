/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmerlin;

public class ProjetMerlin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Entrez ici le nombre de simulations que vous voulez faire
        int nbSimulations = 1;

        //Crée une banque de simulations
        Simulation simulation = new Simulation();

        //ici, vous pouvez lancer n simulations avec ou sans IHM (pour cela modifiez l'appel de fonction)
        System.out.println("\nPour "+nbSimulations+" simulations, E(x)="+simulation.lancerAvecIHM(nbSimulations));

    }

}
