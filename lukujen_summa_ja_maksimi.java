/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaislukuja. Kun käyttäjä syöttää luvun -1, ohjelman suoritus päättyy ja ohjelma tulostaa kaikkien (ennen -1:tä) syötettyjen lukujen summan ja suurimman syötetyn luvun.

Esimerkkisuoritus:

Anna luku: 1
Anna luku: 2
Anna luku: 3
Anna luku: -1
Summa: 6
Suurin: 3
*/

import java.util.Random;
import java.util.Scanner;

public class lukujen_summa_ja_maksimi {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        int suurin = 0;
        int summa = 0;

        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == -1) {
                break;
            }
            
            summa = summa + luku;

            if (luku > suurin) {
                suurin = luku;
            }
        }  

        System.out.println("Summa: " + summa);
        System.out.println("Suurin: " + suurin);
    }
}
