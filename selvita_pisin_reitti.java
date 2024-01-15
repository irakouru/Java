//OHJELMA EI TOIMI VSCODESSA

/*Ohjelmassa on määritelty luokka Reitti, joka toteuttaa rajanpinnan Comparable.

Kirjoita metodi

public static Reitti pisinReitti(ArrayList<Reitti> reitit) 
joka palauttaa pisimmän listassa olevan reitin.

Metodilla ei saa olla sivuvaikutuksia - listaa ei siis saa muuttaa! Huomaa myös, että Reitti-luokalla ei ole havainnointimetodeita. 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class selvita_pisin_reitti {
    public static void main(String[] args){
        final Random r = new Random();
        
    
        String[] k1 = "Turku Helsinki Tampere Oulu Lahti Kuopio Kouvola Rauma Pori Vaasa".split(" ");
        String[] k2 = "Muumilaakso Mordor Narnia Tylypahka Gotham Asgard Neverland Kontu Springfield".split(" ");
        
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(k1));
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList(k2));
        
        ArrayList<Integer> m = new ArrayList<>();
        int matka = r.nextInt(50) + 10;
        for (int i=0; i<9; i++) {
            m.add(matka);
            matka += r.nextInt(50) + 1;
        }
        
        ArrayList<Reitti> reitit = new ArrayList<>();
        for (int i=0; i<8; i++) {
            String kaupunki1 = a1.remove(r.nextInt(a1.size()));
            String kaupunki2 = a2.remove(r.nextInt(a2.size()));
            reitit.add(new Reitti(kaupunki1, kaupunki2, m.remove(r.nextInt(m.size()))));
        }
        
        System.out.println("Kaikki reitit: ");
        reitit.stream().forEach(re -> System.out.println("" + re));
        System.out.println("Pisin reitti: ");
        System.out.println(pisinReitti(reitit));
        System.out.println("Lista nyt:");
        reitit.stream().forEach(re -> System.out.println(re));
    }

    public static Reitti pisinReitti(ArrayList<Reitti> reitit) {
        Reitti pisin = Collections.max(reitit);
        //Reitti pisin = reitit.get(reitit.size() - 1);
        return pisin;
    }
}

class Reitti implements Comparable<Reitti>{
    private String lahtopiste;
    private String paatepiste;
    private int matka;

    public Reitti(String lahtopiste, String paatepiste, int matka) {
        this.lahtopiste = lahtopiste;
        this.paatepiste = paatepiste;
        this.matka = matka;
    }
    
    @Override
    public int compareTo(Reitti o) {
        return this.matka - o.matka;
    }
    
    @Override
    public String toString() {
        return lahtopiste + " - " + paatepiste + ": " + matka + " km.";          
    } 
}
