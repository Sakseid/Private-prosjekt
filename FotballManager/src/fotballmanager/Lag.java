package fotballmanager;

import java.util.ArrayList;

/**
 *Klasse for å opprette og adminisrere lag
 * 
 * @author vegar
 */
public class Lag {
    private String lagnavn;
    private ArrayList<Spiller> spillerstall;
    private ArrayList<Spiller> startelver;
    private ArrayList<Spiller> innbyttere;
    private Database db;
    private RndGen rnd;

    public Lag(Database db) {
        spillerstall = new ArrayList<>();
        startelver = new ArrayList<>();
        innbyttere = new ArrayList<>();
        this.db = db;
        rnd = new RndGen();
        opprettLag();
    }
    
    public void addSpillerstall(Spiller spiller){
        spillerstall.add(spiller);
    }
    
    public void addStartelver(Spiller spiller){
        startelver.add(spiller);
    }
    
    public void addInnbytter(Spiller spiller){
        innbyttere.add(spiller);
    }

    public String getLagnavn() {
        return lagnavn;
    }
    
    /**
     * Metode som kjøres når laget opprettes.
     * Legger til 18 spillere til laget; 3 keepere, 6 forsvarere, 6 midtbanespillere, 4 spisser.
     */
    private void opprettLag(){
        lagnavn = db.getLagnavn();
        for(int i=0; i<18; i++){
            if (i<3){
                Keeper keeper = new Keeper("Keeper", rnd.getTall(1, 100), db.getEtternavn(), db.getFornavn(), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100));
                spillerstall.add(keeper);
            }
            else if (i>2&&i<9){
                Utespiller spiller = new Utespiller("Forsvar", rnd.getTall(1, 100), db.getEtternavn(), db.getFornavn(), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100));
                spillerstall.add(spiller);
            }
            else if (i>8&&i<15){
                Utespiller spiller = new Utespiller("Midtbane", rnd.getTall(1, 100), db.getEtternavn(), db.getFornavn(), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100));
                spillerstall.add(spiller);
            }
            else if (i>14&&i<18){
                Utespiller spiller = new Utespiller("Spiss", rnd.getTall(1, 100), db.getEtternavn(), db.getFornavn(), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100), rnd.getTall(1, 100));
                spillerstall.add(spiller);
            }
        }
    }
    
    private void skrivKeepere(){
        System.out.println("Keepere");
        System.out.format("%15s%18s%18s%15s%15s%15s\n", "Nr", "Fornavn", "Etternavn", "Reaksjon", "Feltarbeid", "Aggresjon");
        for (Spiller s : spillerstall){
            if (s.getPosisjon().contains("Keeper")){
                s.skrivInfo();
            }
        }
    }
    
    private void skrivUtespillere(){
        System.out.println("Utespillere");
        System.out.format("%15s%18s%18s%18s%15s%15s%15s%15s%15s%15s\n", "Nr", "Fornavn", "Etternavn", "Posisjon", "Kondisjon", "Takling", "Dribling", "Avslutning", "Kreativitet", "Hurtighet");
        for (Spiller s : spillerstall){
            if (!s.getPosisjon().equalsIgnoreCase("Keeper")){
                s.skrivInfo();
            }
        }
    }
    
    public void skrivSpillere(){
        skrivKeepere();
        skrivUtespillere();
    }

    public ArrayList<Spiller> getStartelver() {
        return startelver;
    }

    public ArrayList<Spiller> getInnbyttere() {
        return innbyttere;
    }
    
    
}

