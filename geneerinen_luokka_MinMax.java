/*
Kirjoita geneerinen luokka 

class MinMax<T extends Comparable<T>>

...jonka toteuttavan tyypin pitää siis toteuttaa rajapinta Comparable.

Luokalla on seuraavat ominaisuudet:

Konstruktori, joka saa parametrikseen listan. Lista sisältää alkioita, joiden tyyppi on T.
Metodi public T pienin(), joka palauttaa listan pienimmän alkion
Metodi public T suurin(), joka palauttaa listan suurimman alkion
Listan alkioiden vertailuun käytetään Comparable-rajapinnan tarjoamia palveluita.

Vinkki; tutustu luokan Collections API-kuvaukseen - sieltä löytyy pari käyttökelpoista operaatiota suurimman tai pienimmän alkio löytämiseen...
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class geneerinen_luokka_MinMax {
    public static void main(String[] args){
        final Random r = new Random();
        
        System.out.println("Testataan luokkaa MinMax...");
        
        System.out.println("Testataan kokonaisluvuilla");
        int n = -r.nextInt(200);
        ArrayList<Integer> luvut = new ArrayList<>();
        
        int maara = r.nextInt(10) + 10;
        for (int i=0; i<maara; i++) {
            luvut.add(n);
            n += r.nextInt(40);
        }
        
        Collections.shuffle(luvut, r);
        
        System.out.println("Lista:" + luvut);
        System.out.println("Luodaan olio...");
        
        MinMax<Integer> mm = new MinMax<>(luvut);
        System.out.println("Olio luotu!");
        
        System.out.println("Pienin: " + mm.pienin());
        System.out.println("Suurin: " + mm.suurin());
        
        System.out.println("");
        
        System.out.println("Testataan liukuluvuilla");
        double n2 = -r.nextInt(240);
        ArrayList<Double> luvut2 = new ArrayList<>();
        
        Double[] d = {0.0, 0.25, 0.5, 0.75};
        
        maara = r.nextInt(10) + 10;
        for (int i=0; i<maara; i++) {
            n2 += r.nextInt(40) + d[r.nextInt(d.length)];
            luvut2.add(n2);
        }
        
        Collections.shuffle(luvut2, r);
        
        System.out.println("Lista:" + luvut2);
        System.out.println("Luodaan olio...");
        
        MinMax<Double> mm2 = new MinMax<>(luvut2);
        System.out.println("Olio luotu!");
        
        System.out.println("Pienin: " + mm2.pienin());
        System.out.println("Suurin:" + mm2.suurin());
        
    }
}

class MinMax<T extends Comparable<T>> {
    private ArrayList<T> lista;   
    
    public MinMax(ArrayList<T> lista) {
        //this.lista = new ArrayList<>();
        this.lista = lista;
    }
    
    public T pienin() {
        T pienin = lista.get(0);
        //sort(ArrayList<T> lista)
        for (T alkio : lista) {
            if (alkio.compareTo(pienin) < 0) {
                pienin = alkio;
            }
                
        }
        //Comparable<C> min = Collections.min(T lista);
        return pienin;
    }
    
    public T suurin() {
        T suurin = lista.get(0);
        //sort(ArrayList<T> lista)
        for (T alkio : lista) {
            if (alkio.compareTo(suurin) > 0) {
               suurin = alkio;
            }
        }
        //Comparable<C> max = Collections.max(T lista);
        return suurin;
        
    }
    
}

