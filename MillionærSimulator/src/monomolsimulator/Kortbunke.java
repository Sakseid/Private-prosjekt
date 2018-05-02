/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monomolsimulator;

import java.util.Stack;

/**
 *
 * @author vegar
 */
public class Kortbunke {
    private Stack<Kort> bunke;

    public Kortbunke() {
        bunke = new Stack();
    }
    
    private void lagBunke(){
        for (int i = 0 ; i <32 ; i++){
            Kort k = new Kort();
            bunke.add(k);
        }
    }
}
