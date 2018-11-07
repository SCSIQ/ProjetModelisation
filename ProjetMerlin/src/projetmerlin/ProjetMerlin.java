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

        int nbSimulations = 1000000; // Entrez ici le nombre de simulations que vous voulez faire

        Simulation simulation = new Simulation(); //Crée une banque de simulations

        //ici, vous pouvez lancer n simulations avec ou sans IHM (pour cela modifiez l'appel de fonction)
        System.out.println("\nPour "+nbSimulations+" simulations, E(x)="+simulation.lancerSansIHM(nbSimulations));

    }

}
