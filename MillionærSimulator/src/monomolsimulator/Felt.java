/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monomolsimulator;


/**
 *
 * @author vegar
 */
public class Felt {
    private String navn;
    private int nr;
    private int besok;

    public Felt(String navn, int nr) {
        this.navn = navn;
        this.nr = nr;
        if (this.navn == "Start"){
            besok++;
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getBesok() {
        return besok;
    }

    public void setBesok() {
        besok++;
    }
    
    public void skrivBesok(){
        System.out.format("%25s%10d\n", getNavn(), getBesok());
    }
}
