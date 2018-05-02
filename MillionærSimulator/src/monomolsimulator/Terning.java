/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monomolsimulator;

import java.util.Random;

/**
 *
 * @author vegar
 */
public class Terning {
    private int kast;
    private Random rnd;

    public Terning() {
        rnd = new Random();
    }
    
    public int kastTerning(){
        return rnd.nextInt(6)+1;
    }
}
