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

        Oree oree = new Oree();
        Merlin merlin = new Merlin(oree);
        System.out.println("\n0 // "+merlin.toString());

        int i = 0;
        while ((merlin.isaGagne() == false) && (merlin.isaPerdu() == false)) {
            merlin.seDeplacer();
            System.out.println((i+1)+" // "+merlin.toString());
            i++;
        }

        if(merlin.isaGagne() == true) {
            System.out.println("\nMerlin a gagné !");
        }else{
            System.out.println("\nMerlin a perdu");
        }

    }

}
