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

        Fraction f = new Fraction(4,5);

        f.Mult(new Fraction(4,5));
        f.Mult(new Fraction(4,5));
        f.Mult(new Fraction(1,5));

        System.out.println("f : "+f.toString());

        //initialisation
        Oree oree = new Oree();
        Merlin merlin = new Merlin(oree);

        //simulation et affichage
        int i = 0;
        merlin.majProbas();
        System.out.println("\n0 // "+merlin.toString());
        while ((merlin.isaGagne() == false) && (merlin.isaPerdu() == false)) {
            merlin.seDeplacer();
            System.out.println((i+1)+" // "+merlin.toString());
            i++;
        }

    }

}
