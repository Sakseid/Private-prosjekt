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
public class Utespiller extends Spiller {
    private int kondisjon;
    private int takling;
    private int dribling;
    private int avslutning;
    private int kreativitet;
    private int hurtighet;

    public Utespiller(String posisjon, int spillernr, String etternavn, String fornavn, int kondisjon, int takling, int dribling, int avslutning, int kreativitet, int hurtighet) {
        super(posisjon, spillernr, etternavn, fornavn);
        this.kondisjon = kondisjon;
        this.takling = takling;
        this.dribling = dribling;
        this.avslutning = avslutning;
        this.kreativitet = kreativitet;
        this.hurtighet = hurtighet;
    }

    @Override
    public void setPosisjon(String posisjon) {
        super.setPosisjon(posisjon); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisjon() {
        return super.getPosisjon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSpillernr(int spillernr) {
        super.setSpillernr(spillernr); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSpillernr() {
        return super.getSpillernr(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEtternavn(String etternavn) {
        super.setEtternavn(etternavn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEtternavn() {
        return super.getEtternavn(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFornavn(String fornavn) {
        super.setFornavn(fornavn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFornavn() {
        return super.getFornavn(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getKondisjon() {
        return kondisjon;
    }

    public void setKondisjon(int kondisjon) {
        this.kondisjon = kondisjon;
    }

    public int getTakling() {
        return takling;
    }

    public void setTakling(int takling) {
        this.takling = takling;
    }

    public int getDribling() {
        return dribling;
    }

    public void setDribling(int dribling) {
        this.dribling = dribling;
    }

    public int getAvslutning() {
        return avslutning;
    }

    public void setAvslutning(int avslutning) {
        this.avslutning = avslutning;
    }

    public int getKreativitet() {
        return kreativitet;
    }

    public void setKreativitet(int kreativitet) {
        this.kreativitet = kreativitet;
    }

    public int getHurtighet() {
        return hurtighet;
    }

    public void setHurtighet(int hurtighet) {
        this.hurtighet = hurtighet;
    }

    @Override
    public void skrivInfo() {
        System.out.format("%15d%18s%18s%18s%15s%15s%15s%15s%15s%15s\n", super.getSpillernr(), super.getFornavn(), super.getEtternavn(), super.getPosisjon(), kondisjon, takling, dribling, avslutning, kreativitet, hurtighet);
    }
    
    
}
