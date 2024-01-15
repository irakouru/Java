/*
Kirjoita geneerisesti tyyppimääritelty luokka

Monistaja<T>

Luokalla tulee olla seuraavat ominaisuudet:

Konstruktori, joka saa parametrikseen tyyppiä T olevan alkion
Asetus ja havainnointimetodit alkiolle (getAlkio ja setAlkio)
Metodi ArrayList<T> annaMonta(int maara), joka palauttaa uuden listan. Listan koko on parametrina annettu kokonaisluku, ja jokainen listan alkio on oliossa tallessa oleva alkio.
Esimerkki luokan käytöstä:

public static void main(String[] args) {
    Monistaja<String> m1 = new Monistaja<>("abc");
    System.out.println(m1.annaMonta(3));
    
    Monistaja<Double> m2 = new Monistaja<>(2.5);
    System.out.println(m2.annaMonta(4));
}
Ohjelma tulostaa:

[abc, abc, abc]
[2.5, 2.5, 2.5, 2.5]
*/

import java.util.Random;
import java.util.ArrayList;

public class geneerinen_monistaja {
    public static void main(String[] args){
        final Random r = new Random();
        
        System.out.println("Testataan luokkaa monistaja...");
        
        System.out.println("Testataan kokonaislukutyypillä...");
        int alkio = r.nextInt(100) + 1;
        System.out.println("Alkion arvo: " + alkio);
        Monistaja<Integer> m1 = new Monistaja<>(alkio);
        System.out.println("Olio luotu!");
        
        System.out.println("getAlkio palauttaa " + m1.getAlkio());
        alkio = r.nextInt(100) + 1;
        System.out.println("Kutsutaan setAlkio arvolla " + alkio);
        m1.setAlkio(alkio);
        System.out.println("getAlkio palauttaa " + m1.getAlkio());
        
        int koko = r.nextInt(6) + 2;
        System.out.println("Kutsutaan annaMonta arvolla " + koko);
        ArrayList<Integer> al = m1.annaMonta(koko);
        System.out.println(al);
        
        System.out.println("");
        
        System.out.println("Testataan merkkijonotyypillä...");
        String[] s = "koira kissa marsu hamsteri lehmä lammas kana marsu".split(" ");
        String salkio = s[r.nextInt(s.length)];
        System.out.println("Alkion arvo: " + salkio);
        Monistaja<String> m2 = new Monistaja<>(salkio);
        System.out.println("Olio luotu!");
        
        System.out.println("getAlkio palauttaa " + m2.getAlkio());
        salkio = s[r.nextInt(s.length)];
        System.out.println("Kutsutaan setAlkio arvolla " + salkio);
        m2.setAlkio(salkio);
        System.out.println("getAlkio palauttaa " + m2.getAlkio());
        
        koko = r.nextInt(6) + 2;
        System.out.println("Kutsutaan annaMonta arvolla " + koko);
        ArrayList<String> al2 = m2.annaMonta(koko);
        System.out.println(al2);        
    }
}

class Monistaja<T> {
    private T alkio;
    
    public Monistaja(T alkio) {
        this.alkio = alkio;
    }
    
    public T getAlkio() {
        return alkio;
    }
    
    public void setAlkio(T alkio) {
        this.alkio = alkio;
    }
    
    public ArrayList<T> annaMonta(int maara) {
        ArrayList<T> alkioLista = new ArrayList<>(); 
        for (int i=0; i<maara; i++) {
            alkioLista.add(alkio);
        }
        return alkioLista;
    }
}
