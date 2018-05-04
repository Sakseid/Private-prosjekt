/*
 *
 */
package monomolsimulator;

import java.util.ArrayList;

/**
 *
 * @author vegar
 */
public class Simulator {
    private Brett brett;
    private Kortbunke kortbunke;
    private Terning terning1;
    private Terning terning2;
    private int runder;
    private boolean toLike;
    private boolean fengsel;
    private int posisjon;
    private int forsok;
    private int kast;

    public Simulator(int runder) {
        brett = new Brett();
        kortbunke = new Kortbunke();
        terning1 = new Terning();
        terning2 = new Terning();
        this.runder = runder;
        toLike = false;
        fengsel = false;
        posisjon = 0;
        forsok = 0;
        kast = 0;
        spill();
    }
    
    private void spill(){
        ArrayList<Felt> felter = brett.getBrett();
        for (int i = 0 ; i < runder ; i++){
            int t = kastTerning();
            if (!fengsel){
                for (int k = 0; k < t ; k++){
                    posisjon++;
                    if (posisjon==40){
                        posisjon = 0;
                    }
                }
                felter.get(posisjon).setBesok();
                if (toLike){
                    i--;
                    toLike = false;
                }
                if (posisjon == 30){
                    fengsel = true;
                    }
            }
            else {
                int f = 0;
                while (fengsel || f < 3){
                    kastTerning();
                    f++;
                }
                kast++;
                felter.get(10).setBesok();
                if (kast==3){
                    kast=0;
                    fengsel = false;
                }
            }
        }
        System.out.println("Fordelinger");
        for (Felt f : felter){
            f.skrivBesok();
        }
    }
    
    private int kastTerning(){
        int t1 = terning1.kastTerning();
        int t2 = terning2.kastTerning();
        if (t1 == t2){
            fengsel = false;
            toLike = true;
            forsok++;
        }
        if (forsok==3){
            fengsel = true;
            posisjon = 10;
            forsok=0;
        }
        return t1+t2;
    }
    
    
}
