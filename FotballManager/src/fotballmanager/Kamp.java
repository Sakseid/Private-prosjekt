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
    private int overtid1;
    private RndGen rnd;
    private int overtid2;

    public Kamp(Lag hjemme, Lag borte) {
        this.hjemme = hjemme;
        this.borte = borte;
        rnd = new RndGen();
        overtid1 = rnd.getTall(0, 2);
        overtid2 = rnd.getTall(0, 4);
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
    
    /**
     * Metode for å simulere kamp.
     * Skal hente spillerstats fra startelverne og generere en kamp basert på
     * disse og tilfeldige tall hentet fra RndGenerator. 
     */
    public void spillKamp(){
        int omgang1 = 45+overtid1;
        int omgang2 = 45+overtid2;
        
        for (int tid = 0; tid<omgang1; tid++) {
            
            System.out.println(tid);
        }
    }
}
