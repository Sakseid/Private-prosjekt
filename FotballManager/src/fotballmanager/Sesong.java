/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

import java.util.ArrayList;

/**
 *
 * @author vegar
 */
public class Sesong {
    private int sesong;
    private ArrayList lagene;

    public Sesong(int sesong) {
        this.sesong = sesong;
        lagene = new ArrayList<Lag>();
    }
    
    public void addLag(Lag lag){
        lagene.add(lag);
    }
    
    public void leggTilLag(int ant){
        for (int i = 0; i<ant ; i++){
            Lag lag = new Lag();
            lagene.add(lag);
            System.out.println("--------------------------------------------");
            System.out.println(lag.getLagnavn() + " ble lagt til");
            lag.skrivSpillere();
        }
    }
}
