/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmerlin;
import java.util.Random;

public class Merlin {

    private Lieux position;
    private int nbParchemins;

    public Merlin(Lieux position) {
        this.position = position;
        nbParchemins = 0;
    }

    public void seDeplacer() {
        Random rand = new Random();
        int n = rand.nextInt(4); //random entre 0 et 4
    }

    @Override
    public String toString() {
        return "Lieux actuel : "+position.toString();
    }

    public int getNbParchemins() {
        return nbParchemins;
    }
}
