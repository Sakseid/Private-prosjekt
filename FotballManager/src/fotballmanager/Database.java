/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vegar
 */
public class Database {
    private ArrayList fornavn;
    private ArrayList etternavn;
    private ArrayList lagnavn;
    private Random rnd;

    public Database() {
        fornavn = new ArrayList<String>();
        etternavn = new ArrayList<String>();
        lagnavn = new ArrayList<String>();
        fyllFornavn();
        fyllEtternavn();
        fyllLagnavn();
        rnd = new Random();
    }
    
    /**
     * Metode for å fylle arraylista med fornavn
     */
    private void fyllFornavn(){
            fornavn.add("Håvard");
            fornavn.add("Egil");
            fornavn.add("Bengt");
            fornavn.add("Kåre");
            fornavn.add("Åge");
            fornavn.add("Peder");
            fornavn.add("Hans");
            fornavn.add("Petter");
            fornavn.add("Tor Egil");
            fornavn.add("Frans");
            fornavn.add("Leif");
            fornavn.add("Kristian");
            fornavn.add("Åke");
            fornavn.add("Alexander");
            fornavn.add("Carl");
            fornavn.add("Nils");
            fornavn.add("Tore");
            fornavn.add("Richard");
            fornavn.add("Jan");
            fornavn.add("Martin");
            fornavn.add("Sander");
            fornavn.add("Ottar");
            fornavn.add("Roger");
            fornavn.add("Yngve");
            fornavn.add("William");
            fornavn.add("Erik");
            fornavn.add("Anton");
            fornavn.add("Per Terje");
            fornavn.add("Øystein");
            fornavn.add("Magne");
            fornavn.add("Torgeir");
    }
    
    /**
     * Metode for å fylle arraylista med etternavn
     */
    private void fyllEtternavn(){
        etternavn.add("Lie");
        etternavn.add("Pedersen");
        etternavn.add("Henriksen");
        etternavn.add("Augestad");
        etternavn.add("Sakseid");
        etternavn.add("Tolo");
        etternavn.add("Hansen");
        etternavn.add("Johansen");
        etternavn.add("Berg");
        etternavn.add("Lie Hansen");
        etternavn.add("Robertson");
        etternavn.add("Søderlund");
        etternavn.add("Velde");
        etternavn.add("Stueland");
        etternavn.add("Mo");
        etternavn.add("Johnsen");
        etternavn.add("Olsen");
        etternavn.add("Lillehavn");
        etternavn.add("Eide");
        etternavn.add("Andersen");
        etternavn.add("Lande");
        etternavn.add("Storberg");
        etternavn.add("Hauge");
        etternavn.add("Roen");
        etternavn.add("Svindal");
        etternavn.add("Nordlie");
        etternavn.add("Thomassen");
        etternavn.add("Stølen");
        etternavn.add("Endresen");
        etternavn.add("Opdal");
        etternavn.add("Knudsen");
    }
    
    /**
     * Metode for å fylle arraylista med lagnavn
     */
    private void fyllLagnavn(){
        lagnavn.add("Dynamo Auklandshamn");
        lagnavn.add("Lokomotiv Ålefjær");
        lagnavn.add("Sporting Gimlekollen");
        lagnavn.add("Real Mandal");
        lagnavn.add("Søm United");
        lagnavn.add("Søgne Wednesday");
        lagnavn.add("Vestvik");
        lagnavn.add("FK Lund");
        lagnavn.add("Odderøya FK");
        lagnavn.add("Knebuksekameratene");
        lagnavn.add("Sødal FF");
        lagnavn.add("Lillesand SK");
        lagnavn.add("Grimstadspor");
        lagnavn.add("Nupen Park Rangers");
        lagnavn.add("Oldham");
        lagnavn.add("Høvåg City");
    }
    
    
    /**
     * Returnerer et tilfeldig fornavn
     * @return Et tilfeldig fornavn
     */
    public String getFornavn(){
        int i = fornavn.size();
        int r = getTall(i);
        String navn = (String) fornavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig etternavn
     * @return Et tilfeldig etternavn
     */
    public String getEtternavn(){
        int i = etternavn.size();
        int r = getTall(i);
        String navn = (String) etternavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig lagnavn
     * @return Et tilfeldig lagnavn
     */
    public String getLagnavn(){
        int i = lagnavn.size();
        int r = getTall(i);
        String navn = (String) lagnavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tall fra 0 -99
     * @return Tall fra 0-99
     */
    public int getTall(int t){
        int i = rnd.nextInt(t);
                return i;
    }
}
