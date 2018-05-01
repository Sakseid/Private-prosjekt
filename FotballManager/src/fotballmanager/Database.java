/*
 * Klasse som inneholder diverse navn og verktøy som brukes i spillet
 */
package fotballmanager;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vegar
 */
public class Database {
    private ArrayList<String> fornavn;
    private ArrayList<String> etternavn;
    private ArrayList<String> lagnavn;
    private Random rnd;

    public Database() {
        fornavn = new ArrayList<>();
        etternavn = new ArrayList<>();
        lagnavn = new ArrayList<>();
        fyllFornavn();
        fyllEtternavn();
        fyllLagnavn();
        rnd = new Random();
    }
    
    /**
     * Metode for å fylle arraylista med fornavn
     * 
     * For å unngå duplisering, lagre navn i en kø, evt en arraylist som lagrer brukte navn
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
            fornavn.add("Michael");
            fornavn.add("Karsten");
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
        etternavn.add("Hansen");
        etternavn.add("Torp");
        etternavn.add("Lund");
        etternavn.add("Henriksen");
        etternavn.add("Backstad");
        etternavn.add("Stangeland");
        etternavn.add("Lie Andersen");
        etternavn.add("Andreassen");
        etternavn.add("Axelsen");
        etternavn.add("Haukås");
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
        lagnavn.add("Vestvik Rangers");
        lagnavn.add("FK Lund");
        lagnavn.add("Odderøya FK");
        lagnavn.add("Knebuksekameratene");
        lagnavn.add("Sødal FF");
        lagnavn.add("Lillesand SK");
        lagnavn.add("Grimstadspor");
        lagnavn.add("Nupen Park Rangers");
        lagnavn.add("Oldham");
        lagnavn.add("Høvåg City");
        lagnavn.add("Sporting Lista");
    }
    
    
    /**
     * Returnerer et tilfeldig fornavn
     * @return Et tilfeldig fornavn
     */
    public String getFornavn(){
        int i = fornavn.size()-1;
        int r = getTall(0, i);
        String navn = (String) fornavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig etternavn
     * @return Et tilfeldig etternavn
     */
    public String getEtternavn(){
        int i = etternavn.size()-1;
        int r = getTall(0, i);
        String navn = (String) etternavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig lagnavn
     * @return Et tilfeldig lagnavn
     */
    public String getLagnavn(){
        int i = lagnavn.size()-1;
        int r = getTall(0, i);
        System.out.println(i + " " + r);
        String navn = (String) lagnavn.remove(r);
        return navn;
    }
    
    /**
     * Returnerer et tall fra 0 - t
     * @return Tall fra 0 - t
     */
    public int getTall(int min, int max){
        int i = rnd.nextInt((max - min) + 1) + min;
                return i;
    }
}
