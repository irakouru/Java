/*
Ohjelmassa on määritelty luokka Lompakko, jolla on konstruktorin ja saldon havainnointimetodin lisäksi metodi lisaaRahaa(double rahat), jolla lompakkoon voi lisätä rahaa.

Kirjoita luokka ParempiLompakko, joka perii luokan Lompakko. Uudella luokalla on konstruktorin lisäksi kaksi ylikuormitettua uutta versiota metodista lisaaRahaa:

lisaaRahaa(int eurot, int sentit), joka saa erikseen lisättävät eurot ja sentit
lisaaRahaa(String rahamäärä), joka saa rahamäärän merkkijonona. 
Esimerkki havainnollistaa luokan toimintaa:

public static void main(String[] args) {
    ParempiLompakko lompsa = new ParempiLompakko(10);
    
    System.out.println(lompsa.getRahaa());
    
    lompsa.lisaaRahaa(5.0);
    System.out.println(lompsa.getRahaa());
    
    lompsa.lisaaRahaa(2, 75);
    System.out.println(lompsa.getRahaa());
    
    lompsa.lisaaRahaa("3.50");
    System.out.println(lompsa.getRahaa());
}
Ohjelma tulostaa:

10.0
15.0
17.75
21.25 
*/

import java.util.Random;

public class parempi_lompakko {
    public static void main(String[] args){
        final Random r = new Random();
        
        
          
        
        double[] desit = {0.25, 0.5, 0.75, 0.99, 0.65, 0.30};
        System.out.println("Testataan luokkaa ParempiLompakko...");
        
        ParempiLompakko pl = new ParempiLompakko(r.nextInt(100) + 1);
        
        // testataan, että perintä toimii
        Lompakko lompakko = (Lompakko) pl;
        
        System.out.println("Olio luotu!");
        
        System.out.println("Rahaa nyt: " + pl.getRahaa());
        
        double rahat = r.nextInt(100) + 1 + desit[r.nextInt(desit.length)];
        System.out.println("Lisätään " + rahat);
        pl.lisaaRahaa(rahat);
        
        System.out.println("Rahaa nyt: " + pl.getRahaa());
        
        int eurot = r.nextInt(100) + 1;
        int sentit = r.nextInt(99) + 1;
        System.out.println("Lisätään " + eurot + " euroa ja " + sentit + " senttiä");
        pl.lisaaRahaa(eurot, sentit);
        
        System.out.println("Rahaa nyt: " + pl.getRahaa());
        
        eurot = r.nextInt(100) + 1;
        sentit = r.nextInt(99) + 1;
        
        String lisays = eurot + "." + sentit;
        
        System.out.println("Lisätään \"" + lisays + "\"");
        pl.lisaaRahaa(lisays);
        
        System.out.println("Rahaa nyt: " + pl.getRahaa());
    }
}

class Lompakko {
    protected double rahaa;

    public Lompakko(double rahaa) {
        this.rahaa = rahaa;
    }
    
    public void lisaaRahaa(double rahamaara) {
        rahaa += rahamaara;
    }
    
    public double getRahaa() {
        return rahaa;
    }
}

class ParempiLompakko extends Lompakko {
    
    
    public ParempiLompakko(double rahaa) {
        super(rahaa);
    }
    
    public void lisaaRahaa(int eurot, int sentit) {
        super.lisaaRahaa(Double.valueOf(eurot) + Double.valueOf(sentit)/100);
    }
    
    public void lisaaRahaa(String rahamaara) {
        super.lisaaRahaa(Double.valueOf(rahamaara));
    }
}
