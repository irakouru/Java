//KOODI EI TOIMI VSCODESSA

/*
Oheisessa ohjelmassa on määritelty luokat Puhelu ja Videopuhelu. Tutustu luokkien määrittelyihin.

Kirjoita sitten metodi

public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut)
joka saa parametrikseen listan videopuheluita. Metodin tehtävänä on muodostaa ja palauttaa uusi lista, johon lisätään alkuperäiseltä listalta vain ne puhelut, joissa

jompi kumpi henkilöistä on nimeltään "James Bond" ja
puhelussa on video päällä.
Puheluiden järjestyksen tulee noudattaa alkuperäisen listan järjestystä.
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class jamesin_videopuhelut {
    public static void main(String[] args){
        final Random r = new Random();
        r.setSeed(Long.parseLong(args[0]));
   
        ArrayList<Videopuhelu> testilista = new ArrayList<>();
        testilista.add(new Videopuhelu("James Bond", "Jarmo Makkonen", 23, true));
        testilista.add(new Videopuhelu("James Stallone", "James Bond", 53, true));
        testilista.add(new Videopuhelu("James Bond", "Arto Virtanen", 11, false));
        testilista.add(new Videopuhelu("Mikko Mononen", "James Bond", 59, false));
        testilista.add(new Videopuhelu("Liisa Loponen", "Jarmo Makkonen", 2, true));
        testilista.add(new Videopuhelu("Mikko Virtanen", "Virta Mikkonen", 47, true));
        testilista.add(new Videopuhelu("James Bond", "Keijo Keksitty", 99, true));
        testilista.add(new Videopuhelu("Arvi Linden", "James Bond", 143, true));
        
        Collections.shuffle(testilista, r);
        
        System.out.println("Testilista:");
        tulosta(testilista);
        
        System.out.println("Jamesin videopuhelut:");
        ArrayList<Videopuhelu> oikealista = jamesinPuhelut(testilista);
        tulosta(oikealista);
    }
    
    public static void tulosta(ArrayList<Videopuhelu> puhelut) {
        for (Videopuhelu vp : puhelut) {
            System.out.println(vp);
        }
    }

    public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut) {
        ArrayList<Videopuhelu> uusiLista = new ArrayList<>();
        for (Videopuhelu puhelu : puhelut) {
                if (puhelu.getHenkilo1()=="James Bond" || puhelu.getHenkilo2()=="James Bond") {
                    if (puhelu.isVideoPaalla() == true){
                        uusiLista.add(puhelu);
                    }
                }
        }
        return uusiLista;
    }
}

class Puhelu {
    private String henkilo1;
    private String henkilo2;
    private int kestoMin;

    public Puhelu(String henkilo1, String henkilo2, int kestoMin) {
        this.henkilo1 = henkilo1;
        this.henkilo2 = henkilo2;
        this.kestoMin = kestoMin;
    }
    
    public String getHenkilo1() {
        return henkilo1;
    }
    
    public String getHenkilo2() {
        return henkilo2;
    }
    
    public int getKestoMin() {
        return kestoMin;
    }
}

class Videopuhelu extends Puhelu {
    private boolean videoPaalla;

    public Videopuhelu(String henkilo1, String henkilo2, int kestoMin, boolean videoPaalla) {
        super(henkilo1, henkilo2, kestoMin);
        this.videoPaalla = videoPaalla;
    }

    public boolean isVideoPaalla() {
        return videoPaalla;
    } 
    
    public String toString() {
        return getHenkilo1() + " - " + getHenkilo2() + ", " + getKestoMin() + " min., video: " +
                (videoPaalla ? "päällä" : "pois");
    }
}
