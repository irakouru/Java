/*Tutoriaalissa esiteltiin geneerinen luokka Pino.

Jono on pinoa vastaava tietorakenne. Ero on siinä, että kun pinoon lisätään ja poistetaan alkioita samaan päähän, jonossa alkiot lisätään alkuun mutta poistetaan lopusta (niin kuin jono toimii oikeastikin).

Kirjoita geneerinen luokka Jono<T>, jolla on seuraavat ominaisuudet:

Konstruktori, joka ei saa parametreja
Metodi void lisaa(T alkio), joka lisää alkion jonoon ensimmäiseksi
Metodi T poista(), joka poistaa ja palauttaa jonon viimeisen alkion
Metodi boolean onkoAlkioita(), joka palauttaa true, jos jonossa on vähintään yksi alkio */

import java.util.Random;
import java.util.ArrayList;

public class geneerinen_jono_luokka {
    public static void main(String[] args){
        final Random r = new Random();
        
        System.out.println("Testataan luokkaa Jono...");
        
        System.out.println("Testataan kokonaislukutyypillä...");
        Jono<Integer> jono = new Jono<>();
        int[] luvut = {2,4,6,3,5};
        
        for (int luku: luvut) {
            System.out.println("Lisätään alkio " + luku);
            jono.lisaa(luku);
        }
        
        System.out.println("Poistetaan alkioita kunnes onkoAlkioita == false");
        while (jono.onkoAlkioita()) {
            System.out.println(jono.poista());
        }
        System.out.println("");
        
        System.out.println("Testataan merkkijonotyypillä...");
        Jono<String> jono2 = new Jono<>();
        String[] alkiot = {"kani", "kettu", "karhu", "hirvi"};
        
        for (String alkio: alkiot) {
            System.out.println("Lisätään alkio " + alkio);
            jono2.lisaa(alkio);
        }
        
        System.out.println("Poistetaan alkioita kunnes onkoAlkioita == false");
        while (jono2.onkoAlkioita()) {
            System.out.println(jono2.poista());
        }
        
    }
}

class Jono<T> {
    private ArrayList<T> jono;
    
    public Jono() {
        jono = new ArrayList<>();
    }
    
    public void lisaa(T alkio) {
        jono.add(0, alkio);
    }
    
    public T poista() {
        return jono.remove(jono.size() -1);
    }
    
    public boolean onkoAlkioita() {
        return !jono.isEmpty();
    }
    
    
}
