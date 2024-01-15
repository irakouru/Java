/*
Kirjoita ohjelma, joka kysyy käyttäjältä kokonaislukuja. Kun käyttäjä syöttää nollan, ohjelma tulostaa yhteensä syötettyjen positiivisten ja negatiivisten lukujen määrän. Tämän jälkeen ohjelman suoritus päättyy.

Esimerkki suorituksesta:

Anna luku: 2
Anna luku: -3
Anna luku: -4
Anna luku: 5
Anna luku: -1
Anna luku: 0
Positiivisia: 2
Negatiivisia: 3 
*/

import java.util.Random;
import java.util.Scanner;

public class positiivisia_ja_negatiivisia {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);

        int posCounter = 0;
        int negCounter = 0;

        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            else if (luku > 0) {
                posCounter++;
            }
            else if (luku < 0) {
                negCounter++;
            }
        }

        System.out.println("Positiivisia: " + posCounter);
        System.out.println("Negatiivisia: " + negCounter);
        
    }
}
