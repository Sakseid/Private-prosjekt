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
public class Keeper extends Spiller{
    
    private int reaksjon;
    private int feltarbeid;
    private int aggresjon;

    public Keeper(String posisjon, int spillernr, String etternavn, String fornavn, int reaksjon, int feltarbeid, int aggresjon) {
        super(posisjon, spillernr, etternavn, fornavn);
        this.reaksjon = reaksjon;
        this.feltarbeid = feltarbeid;
        this.aggresjon = aggresjon;
    }

    public String getFornavn() {
        return super.getFornavn();
    }

    public void setFornavn(String fornavn) {
        super.setFornavn(fornavn);
    }

    public String getEtternavn() {
        return super.getEtternavn();
    }

    public void setEtternavn(String etternavn) {
        super.setEtternavn(etternavn);
    }

    public int getSpillernr() {
        return super.getSpillernr();
    }

    public void setSpillernr(int spillernr) {
        super.setSpillernr(spillernr);
    }

    public int getReaksjon() {
        return reaksjon;
    }

    public void setReaksjon(int reaksjon) {
        this.reaksjon = reaksjon;
    }

    public int getFeltarbeid() {
        return feltarbeid;
    }

    public void setFeltarbeid(int feltarbeid) {
        this.feltarbeid = feltarbeid;
    }

    public int getAggresjon() {
        return aggresjon;
    }

    public void setAggresjon(int aggresjon) {
        this.aggresjon = aggresjon;
    }

    @Override
    public void skrivInfo() {
        super.skrivInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
