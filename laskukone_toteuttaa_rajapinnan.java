//KOODI EI TOIMI VSCODESSA

/*Kirjoita nyt luokka Laskukone, joka toteuttaa edellisessä tehtävässä kirjoitetun rajapinnan Laskin.

Luokalla tulee olla konstruktori, joka alustaa laskimen alkutilaan (tulos on 0.0).

Luokalla on lisäksi rajapinnasta tulevat metodit lisaa, vahenna, kerro ja jaa, jotka kaikki muuttavat nimensä mukaisesti muistissa olevaa tulosta.

Metodi annaTulos() palauttaa muistissa olevan tuloksen.

Esimerkki luokan käyttämisestä:

Laskukone laskin = new Laskukone();
System.out.println(laskin.annaTulos());

laskin.lisaa(10);
System.out.println(laskin.annaTulos());

laskin.vahenna(5);
System.out.println(laskin.annaTulos());

laskin.kerro(3);
System.out.println(laskin.annaTulos());

laskin.jaa(2);
System.out.println(laskin.annaTulos());
 

Ohjelma tulostaa:

0.0
10.0
5.0
15.0
7.5 
*/

import java.util.Random;

public class laskukone_toteuttaa_rajapinnan {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan luokkaa Laskukone...");
        
        Laskin laskin = new Laskukone();
        
        System.out.println("Luokka toteuttaa rajapinnan Laskin!");
        
        System.out.println("Testataaan lisäystä...");
        int[] luvut = {2,4,3,7};
        for (int luku : luvut) {
            laskin.lisaa(luku);
            System.out.println("Lisättiin " + luku + ", nyt tulos on " + laskin.annaTulos());
        }
        
        System.out.println("Testataaan vähennystä...");
        luvut = new int[]{2,1,3,2};
        for (int luku : luvut) {
            laskin.vahenna(luku);
            System.out.println("Vähennettiin " + luku + ", nyt tulos on " + laskin.annaTulos());
        }
        
        System.out.println("Testataaan kertomista...");
        luvut = new int[]{2,1,3};
        for (int luku : luvut) {
            laskin.kerro(luku);
            System.out.println("Kerrottiin luvulla " + luku + ", nyt tulos on " + laskin.annaTulos());
        }
        
        System.out.println("Testataaan jakamista...");
        luvut = new int[]{2,2,5};
        for (int luku : luvut) {
            laskin.jaa(luku);
            System.out.println("Jaettiin luvulla " + luku + ", nyt tulos on " + laskin.annaTulos());
        }
    }
}

class Laskukone implements Laskin {
    private double tulos;
    
    public Laskukone() {
        this.tulos = 0.0;
    }
    
    @Override 
    public void lisaa(int luku) {
        this.tulos += luku;
    }
    
    @Override
    public void vahenna(int luku) {
        this.tulos -= luku;
    }
    
    @Override
    public void kerro(int luku) {
        this.tulos *= luku;
    }
    
    @Override 
    public void jaa(int luku) {
        this.tulos = this.tulos / luku;
    }
    
    @Override
    public double annaTulos() {
        return tulos; 
    }
}
