/*
 * Klasse for sjansekortene
 */
package monomolsimulator;

/**
 *
 * @author vegar
 */
public class Kort {
    private boolean fengsel;
    private boolean start;
    private boolean slemdal;
    private boolean baat;
    private boolean slottsplassen;
    private boolean nedreSlottsgate;
    private boolean utAvFengsel;

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

    public boolean isUtAvFengsel() {
        return utAvFengsel;
    }

    public void setUtAvFengsel(boolean utAvFengsel) {
        this.utAvFengsel = utAvFengsel;
    }
    
    
}
