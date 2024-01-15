/*
Ohjelmassa on valmiiksi alustettu listamuuttuja luvut, joka osoittaa kokonaislukutyyppiseen listaan.

Tehtäväsi on laskea kuinka monta negatiivista ja kuinka monta positiivista alkiota listassa on. Tulosta tulos alla olevan esimerkin mukaisesti:

Esimerkkitulostus:

Positiivisia: 10
Negatiivisia: 6 
*/

import java.util.Random;
import java.util.ArrayList;

public class laske_positiiviset_ja_negatiiviset_alkiot {
    public static void main(String[] args){
        final Random rnd = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi numero " + testi);
            ArrayList<Integer> luvut = new ArrayList<>();
            
            int pituus = 10 + rnd.nextInt(15);
            for (int i=0; i<pituus; i++) {
                luvut.add(15 - rnd.nextInt(30));
            }
            
            System.out.println("Lista: " + luvut);
            int positiiviset = 0;

            int negatiiviset = 0;
            for (int luku : luvut) {
                if (luku < 0) {
                    negatiiviset = negatiiviset + 1;
                } else if (luku  > 0) {
                    positiiviset = positiiviset + 1;
                }
            }
            System.out.println("Positiivisia: " + positiiviset);
            System.out.println("Negatiivisia: " + negatiiviset); 
        }

    System.out.println("");

    }
}

