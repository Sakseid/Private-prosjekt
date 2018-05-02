/*
 * Klasse som skal simulere en kamp mellom to lag. 
 */
package fotballmanager;

/**
 *
 * @author vegar
 */
public class Kamp {
    private Lag hjemme;
    private Lag borte;
    private int hjemmeMaal;
    private int borteMaal;

    public Kamp(Lag hjemme, Lag borte) {
        this.hjemme = hjemme;
        this.borte = borte;
    }

    public int getHjemmeMaal() {
        return hjemmeMaal;
    }

    public void setHjemmeMaal(int hjemmeMaal) {
        this.hjemmeMaal = hjemmeMaal;
    }

    public int getBorteMaal() {
        return borteMaal;
    }

    public void setBorteMaal(int borteMaal) {
        this.borteMaal = borteMaal;
    }
    
    public void spillKamp(){
        int tid = 0;
        
    }
}
