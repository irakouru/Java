/*
Ohjelmassa on määritelty luokka Auto ja sen perivä luokka KuormaAuto.

Kirjoita metodi

public static int lastiaYhteensa(ArrayList<Auto> autot)
joka saa parametrikseen listan KuormaAuto-olioita. Metodi laskee ja palauttaa tiedon kuorma-autojen yhteenlasketusta lastista.

Huomaa, että listan tyyppi on Auto, ei KuormaAuto! 
*/

import java.util.Random;
import java.util.ArrayList;

public class laske_kuorma_autojen_yhteislasti {
    public static void main(String[] args){
        final Random r = new Random();
        
    String[] merkit = "Sisu Scania Volvo Ford Fiat Citroen".split(" ");
        
        for(int testi=1; testi<=3; testi++) {
            
            System.out.println("Testi " + testi);
        
            ArrayList<Auto> autot = new ArrayList<>();
            
            final int koko = r.nextInt(4) + 3;
            for (int i=0; i<koko; i++) {
                autot.add(new KuormaAuto(merkit[r.nextInt(merkit.length)], r.nextInt(20) + 5));
            }
            System.out.println("Autot:");
            autot.stream().forEach(a -> System.out.println("" + a));
            
            System.out.println("Lastia yhteensä: " + lastiaYhteensa(autot));
            System.out.println("");
    
        }
    }
    
    public static int lastiaYhteensa(ArrayList<Auto> autot) {
        int lasti = 0;
        for (Auto auto : autot) {
            KuormaAuto autoKuormurina = (KuormaAuto) auto;
            lasti += autoKuormurina.getLasti();
        }
        return lasti;
    }
}

class Auto {
    protected String merkki;
    
    public Auto(String merkki) {
        this.merkki = merkki;
    }

    public String getMerkki() {
        return merkki;
    }
}

class KuormaAuto extends Auto {
    private int lasti;

    public KuormaAuto(String merkki, int lasti) {
        super(merkki);
        this.lasti = lasti;
    }
    
    public int getLasti() {
        return lasti;
    }
    
    public String toString() {
        return merkki + ", lastia: " + lasti;
    }
}
