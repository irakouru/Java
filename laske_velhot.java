/*
Ohjelmassa on taas määritelty luokka Satuhahmo ja sen perivät luokat Velho, Veljenpoika ja Supersankari.

Kirjoita metodi

public static int laskeVelhot(ArrayList<Satuhahmo> hahmot) 
joka saa parametriksi listan eri satuhahmoja, ja palauttaa listassa olevien velhojen määrän kokonaislukuna. 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class laske_velhot {
    public static void main(String[] args){
        final Random r = new Random();
        
    for (int testi=1; testi<=3; testi++) {
            
            System.out.println("Testi " + testi);
            
            int ika = r.nextInt(5) + 5;
            ArrayList<Integer> iat = new ArrayList<>();
            for (int i=0; i<20; i++) {
                iat.add(ika);
                ika += r.nextInt(10) + 1;
            }
            
            ArrayList<Satuhahmo> hahmot = new ArrayList<>();
            String[] varit = "sininen keltainen punainen musta ruskea valkoinen vihreä".split(" ");
            
            for (String vp : new String[] {"Kupu", "Pupu", "Rupu", "Mupu"}) {
                String vari = varit[r.nextInt(varit.length)];
                hahmot.add(new Veljenpoika(vp, iat.remove(r.nextInt(iat.size())), vari));
            }
            
            String[] supervoimat = "supernäkö lentotaito supervoima lukutaito superaivastus".split(" ");
            for (String vp : new String[] {"Manbat", "Hiirimies", "Bulk", "Kuparimies", "Teräskissa"}) {
                String voima = supervoimat[r.nextInt(supervoimat.length)];
                hahmot.add(new Supersankari(vp, iat.remove(r.nextInt(iat.size())), voima));
            }
            
            ArrayList<Satuhahmo> velhot = new ArrayList<>();
            String[] sauvat = "tammi lakritsi koivu leppä pähkinäpuu muovi".split(" ");
            for (String vp : new String[] {"Harri", "Hermiina", "Roni", "Valdemort", "Dumpeldore", "Snake"}) {
                String sauva = sauvat[r.nextInt(sauvat.length)];
                velhot.add(new Velho(vp, iat.remove(r.nextInt(iat.size())), sauva));
            }
            
            int hm = r.nextInt(hahmot.size());
            int vl = r.nextInt(velhot.size());
            
            Collections.shuffle(hahmot, r);
            Collections.shuffle(velhot, r);
            
            ArrayList<Satuhahmo> testilista = new ArrayList<>();
            
            for (int i=0; i<hm; i++) {
                testilista.add(hahmot.get(i));
            }
            
            for (int i=0; i<vl; i++) {
                testilista.add(velhot.get(i));
            }
            
            Collections.shuffle(testilista, r);
            
            System.out.println("Satuhahmot:");
            testilista.stream().forEach(h -> System.out.println("" + h));
            
            System.out.println("Velhoja: " + laskeVelhot(testilista));
            
            System.out.println("");
        
        }
        
        
    }

    public static int laskeVelhot(ArrayList<Satuhahmo> hahmot) {
        int velhojenLkm = 0;
        for (Satuhahmo hahmo : hahmot) {
            if (hahmo.getClass() == Velho.class) {
                velhojenLkm += 1;
            }
        } 
        return velhojenLkm;
    }
}

class Satuhahmo {
    private String nimi;
    private int ika;
    
    public Satuhahmo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public int getIka() {
        return ika;
    }
    
    @Override
    public String toString() {
        return nimi + ", " + ika + " vuotta";
    }
}

class Veljenpoika extends Satuhahmo {
    private String lakinVari;

    public Veljenpoika(String nimi, int ika, String lakinVari) {
        super(nimi, ika);
        this.lakinVari = lakinVari;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + lakinVari + " lakki (veljenpoika)";
    }
}

class Velho extends Satuhahmo {
    private String sauva;

    public Velho(String nimi, int ika, String sauva) {
        super(nimi, ika);
        this.sauva = sauva;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + sauva + "sauva (velho)";
    }
}

class Supersankari extends Satuhahmo {
    private String supervoima;

    public Supersankari(String nimi, int ika, String supervoima) {
        super(nimi, ika);
        this.supervoima = supervoima;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", supervoima: " + supervoima + " (supersankari)";
    }
}
