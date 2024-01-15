import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class Luokka_kirjainjoukko {
    public static void main(String[] args){
        System.out.println("Testataan luokkaa Kirjainjoukko");
        
        Kirjainjoukko joukko = new Kirjainjoukko();
        
        System.out.println("Olio luotu!");
        
        String kir = "abcxy";
        for (int i=0; i<kir.length(); i++) {
            char c = kir.charAt(i);
            System.out.println("Lisätään kirjain: " + c);
            joukko.lisaaKirjain(c);
            System.out.println("Joukko nyt: " + joukko.kaikkiKirjaimet());
        }
        
        System.out.println("");
        System.out.println("Yritetään lisätä kirjaimia, jotka ovat jo joukossa");
        
        kir = "acx";
        for (int i=0; i<kir.length(); i++) {
            char c = kir.charAt(i);
            System.out.println("Lisätään kirjain: " + c);
            joukko.lisaaKirjain(c);
            System.out.println("Joukko nyt: " + joukko.kaikkiKirjaimet());
        }
        
        System.out.println("");
        System.out.println("Lisätään useita uusia kirjaimia kerralla");
        
        String[] tau = {"def", "gr", "hsz"};
        for (String k : tau) {
            System.out.println("Lisätään merkkijono: " + k);
            joukko.lisaaKirjaimet(k);
            System.out.println("Joukko nyt: " + joukko.kaikkiKirjaimet());
        }
        
        System.out.println("");
        System.out.println("Lisätään useita kirjaimia, osa jo joukossa");
        
        tau = new String[] {"abc", "hij", "prst"};
        for (String k : tau) {
            System.out.println("Lisätään merkkijono: " + k);
            joukko.lisaaKirjaimet(k);
            System.out.println("Joukko nyt: " + joukko.kaikkiKirjaimet());
        }
        
    }
}
    class Kirjainjoukko {
    private ArrayList<Character> kirjainLista;
        
    public Kirjainjoukko() {
        this.kirjainLista = new ArrayList<>();
    }
        
    public void lisaaKirjain(char kirjain) {
        if (kirjainLista.contains(kirjain) == false) {
            kirjainLista.add(kirjain);
        }
        Collections.sort(kirjainLista);       
    }
        
    public void lisaaKirjaimet(String kirjaimet) {
        for (int i=0; i<kirjaimet.length();i++) {
            char character = kirjaimet.charAt(i);
            lisaaKirjain(character);
        }            
            
    }
        
    public String kaikkiKirjaimet() {
        String tuloste = "";
        for (char kirjain : kirjainLista) {
            tuloste = tuloste + kirjain;
        }
        return tuloste;      
    }
}
