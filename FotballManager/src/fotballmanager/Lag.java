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

    public Lag(Database db) {
        spillerstall = new ArrayList<>();
        startelver = new ArrayList<>();
        innbyttere = new ArrayList<>();
        this.db = db;
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
                Keeper keeper = new Keeper("Keeper", db.getTall(1, 100), db.getEtternavn(), db.getFornavn(), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100));
                spillerstall.add(keeper);
            }
            else if (i>2&&i<9){
                Utespiller spiller = new Utespiller("Forsvar", db.getTall(1, 100), db.getEtternavn(), db.getFornavn(), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100));
                spillerstall.add(spiller);
            }
            else if (i>8&&i<15){
                Utespiller spiller = new Utespiller("Midtbane", db.getTall(1, 100), db.getEtternavn(), db.getFornavn(), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100));
                spillerstall.add(spiller);
            }
            else if (i>14&&i<18){
                Utespiller spiller = new Utespiller("Spiss", db.getTall(1, 100), db.getEtternavn(), db.getFornavn(), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100), db.getTall(1, 100));
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
}

