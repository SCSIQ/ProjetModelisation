/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmerlin;

public class Lac implements Lieux {

    @Override
    public String toString() {
        return "Lac";
    }

    public boolean aGagne(Merlin merlin) {
        boolean gagne = false;
        if(merlin.getNbParchemins()==3) {gagne = true;}
        return gagne;
    }
}
