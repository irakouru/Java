/*

Ohjelmassa on määritelty edellisessä tehtävässä esitelty enum ilmansuuntaa varten.

Kirjoita luokka Reitti, jolla on seuraavat ominaisuudet:

Konstruktori, joka saa parametrikseen pituuden (liukuluku) ja suunnan (ilmansuunta-enum)
Asetus- ja havainnointimetodit pituudelle ja suunnalle 

*/

import java.util.Random;

public class luokka_reitti {
    public static void main(String[] args){
        final Random r = new Random();
        
    System.out.println("Testataan luokkaa Reitti...");
        
        double pituus = r.nextInt(200) + 10;
        Ilmansuunta suunta = Ilmansuunta.values()[r.nextInt(4)];
        
        System.out.println("Luodaan arvoilla (" + pituus + ", " + suunta + ")");
        
        Reitti r1 = new Reitti(pituus, suunta);
        System.out.println("Olio luotu!");
        
        System.out.println("Pituus: " + r1.getPituus());
        System.out.println("Suunta: " + r1.getSuunta());
        
        System.out.println("Testataan havainnointia...");
        
        for (int testi=1; testi<=3; testi++) {
            pituus = r.nextInt(200) + 10;
            suunta = Ilmansuunta.values()[r.nextInt(4)];
            
            System.out.println("Asetetaan pituudeksi " + pituus);
            r1.setPituus(pituus);
            System.out.println("Pituus: " + r1.getPituus());
            
            System.out.println("Asetetaan suunnaksi " + suunta);
            r1.setSuunta(suunta);
            System.out.println("Suunta: " + r1.getSuunta());
        } 
    }
}

class Reitti {
    private double pituus;
    private Ilmansuunta suunta;
    
    public Reitti (double pituus, Ilmansuunta suunta) {
        this.pituus = pituus;
        this.suunta = suunta;
    }
    
    public double getPituus() {
        return pituus;
    }
    
    public Ilmansuunta getSuunta() {
        return suunta;
    }
    
    public void setPituus(double pituus) {
        this.pituus = pituus;
    }
    
    public void setSuunta(Ilmansuunta suunta) {
        this.suunta = suunta;
    }
    
}
