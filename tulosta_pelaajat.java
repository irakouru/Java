/*Huom! Ohjelmoinititehtävän voi ratkaista myös ilman virtoja - niin kuin itse asiassa kaikki virtoihin liittyvät tehtävät. Tehtävissä ei siis pakoteta käyttämään virtoja - kannattaa kuitenkin yritttää ainakin ensin virtojen avulla.

Ohjelmassa on määritelty luokka Jaakiekkoilija. Tutustu luokan ominaisuuksiin ja kirjoita luokkametodi

public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat)
joka tulostaa virtaa käyttäen listassa olevien pelaajien tiedot tarkalleen alla näkyvän esimerkin mukaisesti. Pisteisiin siis lasketaan mukaan sekä pelaajan syötöt että maalit.

Esimerkkitulostus:

Mikko Kahilainen, 21 pistettä
Matti Gretzky, 50 pistettä
Saku Kamppuri, 5 pistettä 
*/

import java.util.Random;
import java.util.ArrayList;

public class tulosta_pelaajat {
    public static void main(String[] args){
        final Random r = new Random();
        
        String[] en = "Saku Teemu Mikko Jere Valtteri Timo Matti Matias Wayne".split(" ");
        String[] sn = "Koivu Selänne Virta Jutila Lehtinen Kamppuri Kahilainen Gretzky".split(" ");
        
        int maara = r.nextInt(5) + 5;
        ArrayList<Jaakiekkoilija> al = new ArrayList<>();
        for (int i=0; i<maara; i++) {
            Jaakiekkoilija jk = new Jaakiekkoilija(en[r.nextInt(en.length)] + " " + 
                    sn[r.nextInt(sn.length)], r.nextInt(30), r.nextInt(30));
            System.out.println("Lisättiin listaan " + jk);
            al.add(jk);
        }
        System.out.println("");
        System.out.println("Tulostetaan:");
        tulosta(al);
        
        
    }
    
    public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat) {
        pelaajat.stream().forEach(pelaaja -> 
        System.out.println(pelaaja.getNimi() + ", " + (pelaaja.getMaalit() + pelaaja.getSyotot()) + " pistettä"));
    }

}

class Jaakiekkoilija {
    private String nimi;
    private int maalit;
    private int syotot;
    
    public Jaakiekkoilija(String nimi, int maalit, int syotot) {
        this.nimi = nimi;
        this.maalit = maalit;
        this.syotot = syotot;
    }

    public String getNimi() {
        return nimi;
    }

    public int getMaalit() {
        return maalit;
    }

    public int getSyotot() {
        return syotot;
    }
    
    public String toString() {
        return nimi + ", " + maalit + " maalia ja " + syotot + " syöttöä.";
    }
}