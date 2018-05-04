/*
 * Simulator for å finne de mest besøkte feltene i monopol/millionær
 */
package monomolsimulator;

import java.util.Scanner;

/**
 *
 * @author vegar
 */
public class MonomolSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor mange simuleringer?");
        int antall = Integer.parseInt(sc.nextLine());
        System.out.println("Hvor mange kast per spill?");
        int kast = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < antall ; i++){
            Simulator sim = new Simulator(kast);
        }
    }
    
}
