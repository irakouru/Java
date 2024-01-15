/*
Ohjelmassa on annettu valmiina seuraava metodimäärittely:

ArrayList<Integer> lottonumerot(Random arpoja)

Kirjoita metodille toteutus, jossa metodi palauttaa listassa lottonumerot. Numeroita on seitsemän, ja ne ovat väliltä [1, 39]. Sama numero ei voi esiintyä listassa kahta kertaa.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    Random arpoja = new Random();
    System.out.println(lottonumerot(arpoja));
    System.out.println(lottonumerot(arpoja));
}
Esimerkkituloste:

[37, 14, 32, 20, 28, 21, 25]
[20, 6, 23, 30, 13, 11, 26] 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

public class Arvo_lottonumerot {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan...");
        
        ArrayList<Integer> nrot1 = lottonumerot(r);
        ArrayList<Integer> nrot2 = lottonumerot(r);
        
        System.out.println("Numerot: " + nrot1);
        System.out.println("");
        
        System.out.print("Listassa 7 numeroa: ");
        System.out.println(nrot1.size() == 7 ? "Ok" : "Ei");
        
        boolean limit = true;
        for (int nro : nrot1) {
            if (nro < 1 || nro > 39) limit = false;
        }
        System.out.print("Numerot 1 ja 39 välillä: ");
        System.out.println(limit ? "Ok" : "Ei");
        
        HashSet<Integer> hs = new HashSet<>(nrot1);
        boolean same = hs.size() == 7;
        System.out.print("Kaikki numerot uniikkeja: ");
        System.out.println(same ? "Ok" : "Ei");
        
        boolean diff = !(nrot1.equals(nrot2));
        System.out.print("Satunnaiset numerot: ");
        System.out.println(diff ? "Ok" : "Ei");
    }
    
    public static ArrayList<Integer> lottonumerot(Random r) {
        //Random arpoja = new Random();
        ArrayList<Integer> lottonumerot = new ArrayList<>();
        while (lottonumerot.size() < 7) {       
            int uusiNumero = r.nextInt(40);
            if (uusiNumero == 0) {
                continue;
            } else if (lottonumerot.contains(uusiNumero)) {
                continue;
            } else {
                lottonumerot.add(uusiNumero);
            }  
        }
        return lottonumerot;
    }
}


