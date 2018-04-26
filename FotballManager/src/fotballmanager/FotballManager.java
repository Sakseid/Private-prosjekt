/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

import java.util.Scanner;

/**
 *
 * @author vegar
 */
public class FotballManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Velkommen til FotballManager-");
        System.out.println("------------------------------");
        System.out.println("-Skriv inn et navn for ligaen");
        String navn = scanner.nextLine();
        Liga liga = new Liga(navn);
        Sesong sesong = liga.opprettSesong();
        liga.plussSesongnr();
        sesong.leggTilLag(10);
        
    }
    
}
