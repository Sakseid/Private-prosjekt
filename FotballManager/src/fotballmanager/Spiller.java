/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

/**
 *
 * @author vegar
 */
public abstract class Spiller {

    private String posisjon;
    private int spillernr;
    private String etternavn;
    private String fornavn;

    public Spiller(String posisjon, int spillernr, String etternavn, String fornavn) {
        this.posisjon = posisjon;
        this.spillernr = spillernr;
        this.etternavn = etternavn;
        this.fornavn = fornavn;
    }
    
    

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getSpillernr() {
        return spillernr;
    }

    public void setSpillernr(int spillernr) {
        this.spillernr = spillernr;
    }

    public String getPosisjon() {
        return posisjon;
    }

    public void setPosisjon(String posisjon) {
        this.posisjon = posisjon;
    }
    
    public void skrivInfo(){
        System.out.println(getSpillernr() + ": " + getFornavn() + " " + getEtternavn() + " " + getPosisjon());
    }
}
