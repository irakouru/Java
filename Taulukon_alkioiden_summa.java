/*
Kirjoita metodi int summa(int[] luvut), joka laskee ja palauttaa taulukon alkioiden summan.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    int[] taulukko = {1,2,3,4};

    int summa = summa(taulukko);
    System.out.println("Summa: " + summa);
}
Ohjelma tulostaa:
Summa: 10 
*/

import java.util.Random;
import java.util.Arrays;

public class Taulukon_alkioiden_summa {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            
            int pituus = r.nextInt(5) + 5;
            int[] taulu = new int[pituus];
            for (int i=0; i<pituus; i++) {
                taulu[i] = r.nextInt(10) + 1;
            }
            
            System.out.println("Taulukko: " + Arrays.toString(taulu));
            System.out.println("Summa: " + summa(taulu));
            System.out.println("");
        }
    }

    public static int summa(int[] luvut) {
        int summa = 0;
        for (int luku : luvut) {
            summa = summa + luku;
        }
        return summa;
    }

}
