/*
Ohjelmassa on määritelty luokka Elokuva. Lisää luokkaan toString-metodi, joka palauttaa elokuvan tiedot merkkijonona seuraavassa muodossa:

ElokuvanNimi (Ohjaajan Nimi), kesto min.

Esimerkiksi:

public static void main(String[] args) {
    Elokuva e = new Elokuva("Java ja minä", "Jarmo Javalainen", 93);
    System.out.println(e);
}
Ohjelma tulostaa:

Jarmo Javalainen (Java ja minä), 93 min. 
*/

import java.util.Random;


public class lisaa_toString_metodi {
    public static void main(String[] args){
        final Random r = new Random();
        
        System.out.println("Luodaan elokuvaolio parametreilla");
        System.out.println("(Senior Spielbergo, A.T., 111");
        Elokuva e = new Elokuva("Senior Spielbergo", "A.T.", 111);
        System.out.println("Tulostus: " + e);
        System.out.println("");
        
        System.out.println("Luodaan elokuvaolio parametreilla");
        System.out.println("(Jori Lukas, Impivaaran Joonas, 142");
        e = new Elokuva("Jori Lukas", "Impivaaran Joonas", 142);
        System.out.println("Tulostus: " + e);
        System.out.println("");
        
        System.out.println("Luodaan elokuvaolio parametreilla");
        System.out.println("(Speed Pasanen, Uno Armeniassa, 93");
        e = new Elokuva("Speed Pasanen", "Uno Armeniassa", 93);
        System.out.println("Tulostus: " + e);
        System.out.println("");
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

    @Override
    public String toString() {
        return this.nimi + " (" + this.ohjaaja + "), " + this.kesto + " min.";
    }
}