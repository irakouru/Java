/*
Kirjoita luokka Merkkijonoapuri, jolla on seuraavat staattiset metodit:

int laskeVokaalit(String jono), joka palauttaa parametrina annetun merkkijonon vokaalien määrän ja
int laskeMuut(String jono), joka palauttaa parametrina annetun merkkijono kaikkien muiden merkkien paitsi vokaalien määrän
Voit olettaa, että kaikissa käsiteltävissä  merkkijonoissa on vain pieniä kirjaimia.
*/

import java.util.Random;

public class luokka_Merkkijonoapuri {
    public static void main(String[] args){
        final Random r = new Random();
    
        String[] sanat = ("kalle aakkoset halitulijallaa heipparallaa moi" +
                "apea aaaaeeeeiiii grrrrr").split(" ");
        for (String sana : sanat) {
            System.out.println("Testataan sanalla " + sana);
            System.out.println("Vokaaleja: " + Merkkijonoapuri.laskeVokaalit(sana));
            System.out.println("Muita: " + Merkkijonoapuri.laskeMuut(sana));
        }  
    }
}

class Merkkijonoapuri {
    public static int laskeVokaalit(String jono) {
        String vokaalit = "aeiouyäö";
        int vokaalienMaara = 0;
        for (int i=0; i < jono.length(); i++) {
            if (vokaalit.contains(Character.toString(jono.charAt(i)))) {
                vokaalienMaara += 1;
            }
        }
        return vokaalienMaara;
    }
    
    public static int laskeMuut(String jono) {
        String vokaalit = "aeiouyäö";
        int muutKirjaimet = 0;
        for (int i=0; i < jono.length(); i++) {
            if (! vokaalit.contains(Character.toString(jono.charAt(i)))) {
                muutKirjaimet += 1;
            }
        }
        return muutKirjaimet;
    }
}
