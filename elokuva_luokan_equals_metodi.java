/*
Oheisessa ohjelmassa on määritelty luokka Elokuva.

Kirjoita luokkaan equals-metodi yllä olevien esimerkkien mukaisesti.

Määritellään, että ollakseen yhtäsuuret, kahden elokuvaolion kaikilla attribuuteilla pitää olla yhtäsuuret arvot - eli nimen, ohjaajan ja keston pitää olla samat. 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class elokuva_luokan_equals_metodi {
    public static void main(String[] args){
        final Random r = new Random();
        
        Elokuva e = new Elokuva("Java ja minä", "Jarmo Javalainen", 93);       
        System.out.println("Elokuva: " + e);
        
        Elokuva e2 = new Elokuva("Java ja minä", "Jaana Javalainen", 93);        
        Elokuva e3 = new Elokuva("Java ja minä", "Jarmo Javalainen", 94);        
        Elokuva e4 = new Elokuva("Python ja minä", "Jarmo Javalainen", 93);
        Elokuva e5 = new Elokuva("Java ja minä", "Jarmo Javalainen", 93);
        
        ArrayList<Elokuva> elokuvat = new ArrayList<>(Arrays.asList(new Elokuva[] {e2,e3,e4,e5,e,null}));
        Collections.shuffle(elokuvat, r);
        
        elokuvat.stream().forEach(ek -> vertaile(e, ek));
        
        System.out.println("Verrataan merkkijonoon \"Java ja minä\"");
        System.out.println("equals: " + (e.equals("Java ja minä")));
        
        
    }
    
    public static void vertaile(Elokuva e, Elokuva e2) {
        System.out.println("Verrataan elokuvaan " + e2);
        System.out.println("equals: " + (e.equals(e2)));
    }
}

class Elokuva {
    private String ohjaaja;
    private String nimi;
    int kesto;
    
    public Elokuva(String ohjaaja, String nimi, int kesto) {
        this.ohjaaja = ohjaaja;
        this.nimi = nimi;
        this.kesto = kesto;
    }
    
    public String toString() {
        return nimi + " (" + ohjaaja + "), " + kesto + " min.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
            
        if (obj.getClass() != Elokuva.class) {
            return false;
        }
            
        Elokuva toinen = (Elokuva) obj;
        
        return (nimi.equals(toinen.nimi) && ohjaaja.equals(toinen.ohjaaja) && kesto == (toinen.kesto));
    }
}
