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
        Kort k;
        for (int i = 0 ; i < runder ; i++){
            int t = kastTerning();
            if (!fengsel){
                for (int j = 0; j < t ; j++){
                    posisjon++;
                    if (posisjon==40){
                        posisjon = 0;
                    }
                }
                if (posisjon == 30){
                    posisjon = 10;
                    fengsel = true;
                }
                felter.get(posisjon).setBesok();
                if (felter.get(posisjon).getNavn().equalsIgnoreCase("Prøv lykken")){
                    k = kortbunke.getBunke().pop();
                    if (kortbunke.getBunke().size()==0){
                        kortbunke = new Kortbunke();
                    }
                    sjekkKort(k);
                }
                if (toLike){
                    if (!fengsel){
                    i--;
                    }
                    toLike = false;
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
    
    private void sjekkKort(Kort k){
        if (k.isBaat()){
            if (posisjon>5||posisjon>35){
                posisjon = 5;
            }
            if (posisjon>15&&posisjon>5){
                posisjon = 15;
            }
            if (posisjon>15&&posisjon>25){
                posisjon = 25;
            }
            if (posisjon>25&&posisjon>35){
                posisjon = 35;
            }
        }
        if (k.isFengsel()){
            posisjon = 10;
        }
        if (k.isNedreSlottsgate()){
            posisjon = 12;
        }
        if (k.isSlemdal()){
            posisjon = 24;
        }
        if (k.isSlottsplassen()){
            posisjon = 39;
        }
        if (k.isStart()){
            posisjon = 0;
        }
    }
    
    
}
