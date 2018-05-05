/*
 * Klasse for å lage sjansekort.
 */
package monomolsimulator;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author vegar
 */
public class Kortbunke {
    private Stack<Kort> bunke;

    public Kortbunke() {
        bunke = new Stack();
        lagBunke();
    }
    
    private void lagBunke(){
        for (int i = 0 ; i <32 ; i++){
            Kort k = new Kort();
            if (i<4){
                k.setFengsel(true);
            }
            if (i>3&&i<5){
                    k.setStart(true);
                    }
            if (i>4&&i<6){
                    k.setNedreSlottsgate(true);
                    }
            if (i>5&&i<7){
                    k.setSlottsplassen(true);
                    }
            if (i>6&&i<9){
                    k.setUtAvFengsel(true);
                    }
            if (i>8&&i<10){
                    k.setSlemdal(true);
                    }
            bunke.add(k);
        }
    }
    
    public void stokkBunke(){
        Collections.shuffle(bunke);
    }

    public Stack<Kort> getBunke() {
        return bunke;
    }
    
    
}
