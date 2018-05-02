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
public class Kort {
    boolean fengsel;
    boolean start;
    boolean slemdal;
    boolean baat;
    boolean slottsplassen;
    boolean nedreSlottsgate;

    public Kort() {
    }

    public boolean isFengsel() {
        return fengsel;
    }

    public void setFengsel(boolean fengsel) {
        this.fengsel = fengsel;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isSlemdal() {
        return slemdal;
    }

    public void setSlemdal(boolean slemdal) {
        this.slemdal = slemdal;
    }

    public boolean isBaat() {
        return baat;
    }

    public void setBaat(boolean baat) {
        this.baat = baat;
    }

    public boolean isSlottsplassen() {
        return slottsplassen;
    }

    public void setSlottsplassen(boolean slottsplassen) {
        this.slottsplassen = slottsplassen;
    }

    public boolean isNedreSlottsgate() {
        return nedreSlottsgate;
    }

    public void setNedreSlottsgate(boolean nedreSlottsgate) {
        this.nedreSlottsgate = nedreSlottsgate;
    }
    
    
}
