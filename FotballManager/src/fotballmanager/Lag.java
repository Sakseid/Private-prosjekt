/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

import java.util.ArrayList;

/**
 *
 * @author vegar
 */
public class Lag {
    private String lagnavn;
    private ArrayList<Spiller> spillerstall;
    private ArrayList<Spiller> startelver;
    private ArrayList<Spiller> innbyttere;
    private Database db;

    public Lag() {
        spillerstall = new ArrayList<>();
        startelver = new ArrayList<>();
        innbyttere = new ArrayList<>();
        db = new Database();
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
                Keeper keeper = new Keeper("Keeper", db.getTall(100), db.getEtternavn(), db.getFornavn(), db.getTall(100), db.getTall(100), db.getTall(100));
                spillerstall.add(keeper);
            }
            else if (i>2&&i<9){
                Utespiller spiller = new Utespiller("Forsvar", db.getTall(100), db.getEtternavn(), db.getFornavn(), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100));
                spillerstall.add(spiller);
            }
            else if (i>8&&i<15){
                Utespiller spiller = new Utespiller("Midtbane", db.getTall(100), db.getEtternavn(), db.getFornavn(), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100));
                spillerstall.add(spiller);
            }
            else if (i>14&&i<18){
                Utespiller spiller = new Utespiller("Spiss", db.getTall(100), db.getEtternavn(), db.getFornavn(), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100), db.getTall(100));
                spillerstall.add(spiller);
            }
        }
    }
    
    public void skrivSpillere(){
        for(Spiller s : spillerstall){
            s.skrivInfo();
        }
    }
}
