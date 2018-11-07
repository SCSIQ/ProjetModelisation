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
    private boolean parcheminChateauPris = false;
    private boolean parcheminGrottePris = false;
    private boolean parcheminClairierePris = false;

    public boolean isaGagne() {
        return aGagne;
    }

    public boolean isaPerdu() {
        return aPerdu;
    }

    private boolean aGagne;
    private boolean aPerdu;

    public Merlin() {
        this.position = new Oree();
        nbParchemins = 0;
        aGagne = false;
        aPerdu = false;
    }

    public void seDeplacer() {
        Random rand = new Random();
        int n = rand.nextInt(5); //random entre 0 et 4
        switch (n) {
            case 0 : this.position = new Oree();
                break;
            case 1 : this.position = new Chateau();
                if(this.parcheminChateauPris == false) { nbParchemins++; }
                this.parcheminChateauPris = true;
                break;
            case 2 : this.position = new Clairiere();
                if(this.parcheminClairierePris == false) { nbParchemins++; }
                this.parcheminClairierePris = true;
                break;
            case 3 : this.position = new Grotte();
                if(this.parcheminGrottePris == false) { nbParchemins++; }
                this.parcheminGrottePris = true;
                break;
            case 4 : this.position = new Lac();

                if(((Lac) this.position).aGagne(this) == true) {
                    this.aGagne = true;
                }else{
                    this.aPerdu = true;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "Lieux actuel : "+position.toString()+" | nombre de parchemins : "+nbParchemins;
    }

    public int getNbParchemins() {
        return nbParchemins;
    }
}
