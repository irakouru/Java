/*Ohjelmassa on määritelty rajapintaluokka Astia ja sen toteuttavat luokat Tynnyri ja Pullo.

Kirjoita metodi

public static int montakoMahtuu(Astia isoAstia, Astia pieniAstia)
joka palauttaa kokonaislukuna tiedon siitä, kuinka monta pientä astiallista mahtuu kokonaan isoon astiaan. 

Esimerkki metodin kutsumisesta:

public static void main(String[] args) {
    Tynnyri tynnyri = new Tynnyri("tammi", 5.0);
    Pullo pullo = new Pullo("jaffa", 1.5);
    
    System.out.println(montakoMahtuu(tynnyri, pullo));
}
Ohjelma tulostaa:

3 
*/

import java.util.Random;

public class montako_mahtuu_astiaan {
    public static void main(String[] args){
        final Random r = new Random();
        
    String[] mat = "tammi leppä koivu muovi teräs kupari rauta kumi".split(" ");
        double[] t = {2.0, 3.0, 4.5, 5.0, 6.0, 7.0, 8.0, 10.0, 20.0, 25.0, 30.0};
        double[] t2 = {0.1, 0.25, 0.5, 0.75, 1.0, 2.0};
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            
            String imat = mat[r.nextInt(mat.length)];
            String pmat = mat[r.nextInt(mat.length)];
            
            Astia iso = new Tynnyri(imat, t[r.nextInt(t.length)] + t[r.nextInt(t.length)]);
            Astia pieni = new Pullo(pmat, t2[r.nextInt(t2.length)]);
            
            System.out.println("Iso astia: " + iso);
            System.out.println("Pieni astia: " + pieni);
            
            System.out.println("Isoon astiaan mahtuu " + montakoMahtuu(iso, pieni) + " pientä astiallista.");
        }
    
    }

    public static int montakoMahtuu(Astia isoAstia, Astia pieniAstia) {
        int tulos = (int) (isoAstia.getTilavuus() / pieniAstia.getTilavuus());
        return tulos;
   }

}

interface Astia {
    double getTilavuus();
}

class Pullo implements Astia {
    private String nimi;
    private double tilavuus;
    
    public Pullo(String nimi, double tilavuus) {
        this.nimi = nimi;
        this.tilavuus = tilavuus;
    }

    @Override
    public double getTilavuus() {
        // TODO Auto-generated method stub
        return tilavuus;
    }
    
    @Override
    public String toString() {
        return nimi + "pullo, tilavuus " + tilavuus + " litraa";
    }
}

class Tynnyri implements Astia {
    private String nimi;
    private double tilavuus;
    
    public Tynnyri(String nimi, double tilavuus) {
        this.nimi = nimi;
        this.tilavuus = tilavuus;
    }

    @Override
    public double getTilavuus() {
        // TODO Auto-generated method stub
        return tilavuus;
    }
    
    @Override
    public String toString() {
        return nimi + "tynnyri, tilavuus " + tilavuus + " litraa";
    }
}
