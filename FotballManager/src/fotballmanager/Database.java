/*
 * Klasse som inneholder diverse navn og verktøy som brukes i spillet
 */
package fotballmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author vegar
 */
public class Database {
    private ArrayList<String> fornavn;
    private ArrayList<String> etternavn;
    private ArrayList<String> lagnavnArray;
    private LinkedList<String> lagnavn;
    private RndGen rnd;

    public Database() {
        fornavn = new ArrayList<>();
        etternavn = new ArrayList<>();
        lagnavnArray = new ArrayList<>();
        lagnavn = new LinkedList<>();
        fyllFornavn();
        fyllEtternavn();
        fyllLagnavnArray();
        Collections.shuffle(lagnavnArray);
        fyllLagnavn();
        rnd = new RndGen();
    }
    
    /**
     * Metode for å fylle arraylista med fornavn
     * 
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
     * Metode for å fylle arraylista med lagnavnArray
 
 Duplisering av navn, lagre navnene i en kø!
     */
    private void fyllLagnavnArray(){
        lagnavnArray.add("Dynamo Auklandshamn");
        lagnavnArray.add("Lokomotiv Ålefjær");
        lagnavnArray.add("Sporting Gimlekollen");
        lagnavnArray.add("Real Mandal");
        lagnavnArray.add("Søm United");
        lagnavnArray.add("Søgne Wednesday");
        lagnavnArray.add("Vestvik Rangers");
        lagnavnArray.add("FK Lund");
        lagnavnArray.add("Odderøya FK");
        lagnavnArray.add("Knebuksekameratene");
        lagnavnArray.add("Sødal FF");
        lagnavnArray.add("Lillesand SK");
        lagnavnArray.add("Grimstadspor");
        lagnavnArray.add("Nupen Park Rangers");
        lagnavnArray.add("Oldham");
        lagnavnArray.add("Høvåg City");
        lagnavnArray.add("Sporting Lista");
    }
    
    /**
     * Metode for å fylle køen med lagnavn
     */
    private void fyllLagnavn(){
        for (String s : lagnavnArray){
            lagnavn.add(s);
        }
    }
    
    
    /**
     * Returnerer et tilfeldig fornavn
     * @return Et tilfeldig fornavn
     */
    public String getFornavn(){
        int i = fornavn.size()-1;
        int r = rnd.getTall(0, i);
        String navn = (String) fornavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig etternavn
     * @return Et tilfeldig etternavn
     */
    public String getEtternavn(){
        int i = etternavn.size()-1;
        int r = rnd.getTall(0, i);
        String navn = (String) etternavn.get(r);
        return navn;
    }
    
    /**
     * Returnerer et tilfeldig lagnavnArray
     * @return Et tilfeldig lagnavnArray
     */
    public String getLagnavn(){
        System.out.println(lagnavn.size());
        return lagnavn.poll();
    }
}
