/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monomolsimulator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vegar
 */
public class Brett {
    private ArrayList<Felt> brett;
    private HashMap<Integer,  String> gatenavn;

    public Brett() {
        brett = new ArrayList<>();
        gatenavn = new HashMap<>();
        fyllGatenavn();
        lagBrett();
    }
    
    private void fyllGatenavn(){
        gatenavn.put(1, "Start");
        gatenavn.put(2, "Parkveien");
        gatenavn.put(3, "Prøv Lykken");
        gatenavn.put(4, "Kirkeveien");
        gatenavn.put(5, "Skatt");
        gatenavn.put(6, "N.A.L.");
        gatenavn.put(7, "Kronprinsens Gate");
        gatenavn.put(8, "Prøv Lykken");
        gatenavn.put(9, "Dronningens Gate");
        gatenavn.put(10, "Kongens Gate");
        gatenavn.put(11, "Fengsel");
        gatenavn.put(12, "Nedre Slottsgate");
        gatenavn.put(13, "SAS");
        gatenavn.put(14, "Grensen");
        gatenavn.put(15, "Tordenskjolds Gate");
        gatenavn.put(16, "B.D.S.");
        gatenavn.put(17, "Trondheimsveien");
        gatenavn.put(18, "Prøv Lykken");
        gatenavn.put(19, "Mosseveien");
        gatenavn.put(20, "Drammensveien");
        gatenavn.put(21, "Trafikkfyr");
        gatenavn.put(22, "Bygdøy");
        gatenavn.put(23, "Prøv Lykken");
        gatenavn.put(24, "Holmenkollen");
        gatenavn.put(25, "Slemdal");
        gatenavn.put(26, "KOSMOS");
        gatenavn.put(27, "Karl Johans Gate");
        gatenavn.put(28, "Studenterlunden");
        gatenavn.put(29, "Braathens SAFE");
        gatenavn.put(30, "Stortingsgaten");
        gatenavn.put(31, "Gå direkte i fengsel");
        gatenavn.put(32, "Lambertseter");
        gatenavn.put(33, "Vålerengen");
        gatenavn.put(34, "Prøv Lykken");
        gatenavn.put(35, "Sinsen");
        gatenavn.put(36, "Bastøyfergen");
        gatenavn.put(37, "Prøv Lykken");
        gatenavn.put(38, "Ullevål Hageby");
        gatenavn.put(39, "Ekstra skatt");
        gatenavn.put(40, "Slottsparken");
    }
    
    private void lagBrett(){
        for (int i = 1 ; i < 41 ; i++){
            Felt f = new Felt(gatenavn.get(i), i);
            brett.add(f);
        }
    }

    public ArrayList getBrett() {
        return brett;
    }
    
    
}