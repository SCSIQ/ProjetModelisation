/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmerlin;

public class Chateau implements Lieux {

    static boolean parcheminRecup = false;

    public void PrendreParchemin() {
        parcheminRecup = true;
    }

    public boolean parcheminPris() {
        if(parcheminRecup == false) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Chateaur";
    }

}
