/*
Oheisessa ohjelmassa on alustettu muuttuja eka ja toka satunnaisilla alkuarvoilla. Muuttujat ovat kokonaislukutyyppisiä.

Tehtäväsi on tulostaa allekkain lukujen summa, tulo ja osamäärä (eli eka jaettuna luvulla toka).

Tulosta jokainen luku omalle rivilleen. 
*/

import java.util.Random;

public class laske_summa_tulo_ja_osamaara {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        
        int eka = 5;
        int toka = 2;
            
        System.out.println("Testataan arvoilla:");
        System.out.println("eka == " + eka);
        System.out.println("toka == " + toka);
        System.out.println(eka+toka);
        System.out.println(eka*toka);
        System.out.println(eka*1.0/toka);
        System.out.println("");
    }
}
