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
    private boolean aGagne;
    private boolean aPerdu;
    private Fraction probaGagner = new Fraction(0);
    private Fraction probaPerdre = new Fraction(1,5);

    public boolean isaGagne() {
        return aGagne;
    }

    public boolean isaPerdu() {
        return aPerdu;
    }

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
        majProbas();
    }

    public void majProbas() {
        if(this.nbParchemins == 3) {
            this.probaGagner = new Fraction(1);
            this.probaPerdre = new Fraction(0);
        }else if(this.nbParchemins == 2){
            this.probaGagner = new Fraction(0).Mult(new Fraction(2,5));
        }else if(this.nbParchemins == 1){
            this.probaGagner = new Fraction(0).Mult(new Fraction(2,5));
            this.probaGagner = this.probaGagner.Mult(new Fraction(1,5));
        }else if(this.nbParchemins == 0){
            this.probaGagner = new Fraction(0).Mult(new Fraction(3,5));
            this.probaGagner = this.probaGagner.Mult(new Fraction(2,5));
            this.probaGagner = this.probaGagner.Mult(new Fraction(1,5));
        }
    }

    @Override
    public String toString() {

        String toReturn = "";

        toReturn += "Lieux actuel : "+position.toString()+" | nombre de parchemins : "+nbParchemins;

        if(this.position.toString() == "Lac") {
            if(this.aGagne) {
                toReturn += "\n\nMerlin a gagné";
            }else{
                toReturn += "\n\nMerlin a perdu";
            }
        }else{
            toReturn += "\n   Probabilité de gagner : "+this.probaGagner.toString();
            toReturn += "\n   Probabilité de perdre : "+this.probaPerdre.toString()+"\n";
        }

        return toReturn;
    }

    public int getNbParchemins() {
        return nbParchemins;
    }
}
