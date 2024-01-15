/*
Kirjoita metodi

char keskimerkki(String jono)

...joka palauttaa merkkijonon keskimmäisen merkin. 

Jos merkkijonossa kuitenkin on parillinen määrä merkkejä (eli keskimmäistä merkkiä ei ole), metodi palauttaa tyhjän viivan (eli miinusmerkin).

Esimerkki metodin kutsumisesta:

public static void main(String[] args) {
    System.out.println(keskimerkki("abcde"));
    System.out.println(keskimerkki("123"));
    System.out.println(keskimerkki("wxyz"));
}
Ohjelma tulostaa:

c
2
- 
*/

import java.util.Random;

public class keskimerkki_tai_ei_mitaan {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] s = "eka toka kolmonen neljä vekara testi aapinen kekkuli ohjelmointiopas tsukutsuku".split(" ");
        for (String pa : s) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Keskimerkki: " + keskimerkki(pa));
            System.out.println("");
        }
    }

    public static char keskimerkki(String jono) {
        char palaute = '0';
        int lkm = jono.length();
    
        if (lkm % 2 == 0) {
            palaute ='-' ;
        } else {
            int middle = lkm/2;
            char kirjain = jono.charAt(middle);
            //String kirjaimeksi = Character.toString(kirjain);
            //System.out.println(kirjaimeksi);
            palaute = kirjain;
        }
        return palaute;
    }
}
