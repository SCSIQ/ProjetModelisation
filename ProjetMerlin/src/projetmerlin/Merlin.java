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

    public boolean isaGagne() {
        return aGagne;
    }

    public boolean isaPerdu() {
        return aPerdu;
    }

    private boolean aGagne;
    private boolean aPerdu;

    public Merlin(Lieux position) {
        this.position = position;
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
                if(((Chateau) this.position).parcheminPris() == false) { nbParchemins++; }
                ((Chateau) this.position).PrendreParchemin();
                break;
            case 2 : this.position = new Clairiere();
                if(((Clairiere) this.position).parcheminPris() == false) { nbParchemins++; }
                ((Clairiere) this.position).PrendreParchemin();
                break;
            case 3 : this.position = new Grotte();
                if(((Grotte) this.position).parcheminPris() == false) { nbParchemins++; }
                ((Grotte) this.position).PrendreParchemin();
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
