package projetmerlin;

import java.util.ArrayList;

public class Simulation {

    private int nbVictoires = 0;
    private Merlin merlin = new Merlin();

    public Simulation() {}

    public double lancerSansIHM(int nbSimulations) {

        for(int nb=0 ; nb<nbSimulations ; nb++) {

            //Initialisation
            this.merlin = new Merlin();

            //Déroulement d'une simulation
            int i = 0;
            //System.out.println("\n0 // "+this.merlin.toString());
            while ((this.merlin.isaGagne() == false) && (this.merlin.isaPerdu() == false)) {
                this.merlin.seDeplacer();
                //System.out.println((i+1)+" // "+this.merlin.toString());
                i++;
            }

            //Vérification des résultats de la simulation
            if(this.merlin.isaGagne() == true) {
                //System.out.println("\nMerlin a gagné !");
                nbVictoires++;
            }else{
                //System.out.println("\nMerlin a perdu");
            }
        }

        return ((double) nbVictoires / (double) nbSimulations);
    }

    public double lancerAvecIHM(int nbSimulations) {

        for(int nb=0 ; nb<nbSimulations ; nb++) {

            //Initialisation
            this.merlin = new Merlin();

            //Déroulement d'une simulation
            int i = 0;
            System.out.println("\n0 // "+this.merlin.toString());
            while ((this.merlin.isaGagne() == false) && (this.merlin.isaPerdu() == false)) {
                this.merlin.seDeplacer();
                System.out.println((i+1)+" // "+this.merlin.toString());
                i++;
            }

            //Vérification des résultats de la simulation
            if(this.merlin.isaGagne() == true) {
                System.out.println("\nMerlin a gagné !");
                nbVictoires++;
            }else{
                System.out.println("\nMerlin a perdu");
            }
        }

        System.out.println("\n----------------------------------------------------------------------");

        return ((double) nbVictoires / (double) nbSimulations);
    }
}
