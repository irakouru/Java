/*KOODI EI TOIMI VSCODESSA */

/*
Kirjoita rajapintaluokka Laskin. Luokalla on seuraavat ominaisuudet:

Metodit lisaa, vahenna, kerro ja jaa. Kaikki metodit ovat void-tyyppisiä ja jokainen saa parametriksi yhden kokonaisluvun.
Metodi annaTulos, jolla ei ole parametreja. Metodi palauttaa double-tyyppisen liukuluvun. 
*/

import java.util.Random;

public class kirjoita_rajapintaluokka_Laskin {
    public static void main(String[] args){
        final Random r = new Random();
        
        System.out.println("Testataan rajapintaa laskin...");
        
        Laskin l = new LaskinTesti();
        
        l.lisaa(1);
        System.out.println("lisaa(int luku) ok");
        
        l.vahenna(1);
        System.out.println("vahenna(int luku) ok");

        l.kerro(1);
        System.out.println("kerro(int luku) ok");
        
        l.jaa(1);
        System.out.println("jaa(int luku) ok");
        
        double d = l.annaTulos();
        System.out.println("annaTulos() ok");

    }
}

interface Laskin {
    void lisaa(int luku);
    void vahenna(int luku);
    void kerro(int luku);
    void jaa(int luku);
    double annaTulos();

}
