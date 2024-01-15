/*
Ohjelmassa että meillä on käytössä luokka Reitti, jolla on seuraavat tehtävässä tarvittavat havainnointimetodit:

getSuunta(), joka palauttaa reitin suunnan. Palautusarvo on Ilmansuunta-tyyppinen enum, jolla on neljä mahdollista arvoa (POHJOINEN, ETELA, ITA ja LANSI).
getPituus(), joka palauttaa reitin pituuden liukulukuna
Kirjoita luokkametodi

public static void tulostaPohjoisenReitit(ArrayList<Reitti> reitit)
joka saa parametrikseen listan Reitti-olioita. Metodi tulostaa allekkain kaikki ne reitit, joiden suunta on pohjoiseen. Käytä tulostamiseen Reitti-luokan toString-metodia.
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class tulosta_pohjoisen_reitit {
    public static void main(String[] args){
        final Random r = new Random();
        
     
        ArrayList<Reitti> reitit = new ArrayList<>();
        int m = r.nextInt(3) + 2;
        for (int i=0; i<m; i++) {
            reitit.add(new Reitti(r.nextInt(100), Ilmansuunta.POHJOINEN));
        }
        m = r.nextInt(5) + 5;
        Ilmansuunta[] eil = {Ilmansuunta.ETELA, Ilmansuunta.ITA, Ilmansuunta.LANSI};
        for (int i=0; i<m; i++) {
            reitit.add(new Reitti(r.nextInt(100), eil[r.nextInt(3)]));
        }
        
        Collections.shuffle(reitit, r);
        
        System.out.println("Kaikki reitit:");
        reitit.stream().forEach(re -> System.out.println(re));
        
        System.out.println("Pohjoisen reitit:");
        tulostaPohjoisenReitit(reitit);
       
    }

    public static void tulostaPohjoisenReitit(ArrayList<Reitti> reitit){
        ArrayList<Reitti> pohjoiseen = new ArrayList<>();
        reitit.stream().filter(reitti -> reitti.getSuunta() == Ilmansuunta.POHJOINEN).forEach(reitti -> pohjoiseen.add(reitti));
        pohjoiseen.stream().forEach(reitti -> System.out.println(reitti.toString()));
    }
    
}

class Reitti {
    private double pituus;
    private Ilmansuunta suunta;
    
    public Reitti(double pituus, Ilmansuunta suunta) {
        this.pituus = pituus;
        this.suunta = suunta;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public Ilmansuunta getSuunta() {
        return suunta;
    }

    public void setSuunta(Ilmansuunta suunta) {
        this.suunta = suunta;
    } 
    
    public String toString() {
        return "Suunta: " + suunta + ", pituus: " + pituus;
    }
}


enum Ilmansuunta {
    POHJOINEN, ETELA, ITA, LANSI
}
