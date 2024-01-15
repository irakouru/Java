/*
Kirjoita metodi

int laskeLyhyemmat(ArrayList<String> jonot, int pituus)

joka laskee kuinka monta sellaista merkkijonoa listassa jonot on, joissa on vähemmän kuin pituus merkkiä.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    ArrayList<String> testi = new ArrayList<>();
    testi.add("Huu");
    testi.add("Haa");
    testi.add("Huhuu");
    testi.add("Hohoo");

    int lyhyempiaKuin4 = laskeLyhyemmat(testi, 4);
    System.out.println(lyhyempiaKuin4);
}
Ohjelma tulostaa:
2 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class laske_lyhyemmat_merkkijonot {
    public static void main(String[] args){
        final Random r = new Random();
        
        testaa(new String[] {"eka", "toka", "kolmas", "neljäs", "viis", "kuusi", "7"}, 5);
        testaa("karhu kettu kani pupu orava kirahvi karhu tiikeri marsu gorilla sinivalas".split(" "), 6);
        testaa("a ab abc abcd xyz xy x z".split(" "), 2);
    }
    
    public static void testaa(String[] l, int pituus) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(l));
        System.out.println("Testataan listalla " + lista);
        System.out.print("Merkkijonoja, joissa on alle " + pituus + " merkkiä: ");
        System.out.println(laskeLyhyemmat(lista, pituus));
        System.out.println("");
    }

    public static int laskeLyhyemmat(ArrayList<String> jonot, int pituus) {
        int lukumaara = 0;
        for (String sana : jonot) {
            int sananPituus = sana.length();
            if (sananPituus < pituus) {
                lukumaara = lukumaara + 1;
            }
        }
        return lukumaara;
    }
}
