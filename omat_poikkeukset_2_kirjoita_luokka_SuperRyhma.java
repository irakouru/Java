/*
Oheisessa ohjelmassa on määritelty luokka SuperElain. Luokalla on ominaisuutena nimen ja supervoiman lisäksi laji, joka kirjoitetaan kokonaan pienillä kirjaimilla (esim. "koira" tai "kissa") ja tähän liittyvä havainnointimetodi, jota tarvitset tehtävässä.

Kirjoita luokka SuperRyhma, joka mallintaa supereläimistä koostuvaa ryhmää.

Luokalla on seuraavat ominaisuudet:

Konstruktori, joka saa parametrikseen ryhmän nimen
Metodi lisaaJasen(SuperElain elain), jolla voidaan lisätä uusi jäsen ryhmään. Jos ryhmässä olisi lisäyksen jälkeen sekä koira että kissa, metodi estää lisäyksen ja heittää sen sijasta SuperPoikkeus-tyyppisen poikkeuksen.
Metodi void tulostaRyhma(), joka tulostaa ryhmän nimen ja jäsenet alla näkyvässä muodossa. Huomaa, että luokalla SuperElain on metodi toString - hyödynnä sitä siis tässä!
Metodin tulostRyhma() tulostus voisi näyttää esimerkiksi tältä, kun ryhmään on onnistuneesti lisätty kolme eläintä:

Ryhmä Vuh
Mad Dog (koira), supervoima: Superpurenta
Kapteeni Muu (lehmä), supervoima: Supermärehtiminen
Supermusti (koira), supervoima: Superhaukku 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class omat_poikkeukset_2_kirjoita_luokka_SuperRyhma {
    public static void main(String[] args){
        final Random r = new Random();
        
       System.out.println("Testataan luokkaa SuperRyhma...");
        
        String[] nimet = "Hau Röh Vuh Miau Muu Möö Kurnauskis Tööt Kvaak".split(" ");
       
        System.out.println("Testi 1");
        SuperRyhma ryhma = new SuperRyhma("Ryhmä " + nimet[r.nextInt(nimet.length)]);
        System.out.println("Ryhmä luotu!");
        
        ArrayList<SuperElain> al = new ArrayList<>();
        
        al.add(new SuperElain("possu", "Mr. Ponteva", "Superhengitys"));
        al.add(new SuperElain("lehmä", "Kapteeni Muu", "Supermärehtiminen"));
        al.add(new SuperElain("kissa", "Felixx", "Supernäkö"));
        al.add(new SuperElain("kissa", "Car-Finen", "Superautoilu"));
        Collections.shuffle(al, r);
        
        System.out.println("Lisätään sallittuja...");
        for (SuperElain elain : al) {
            try {
                ryhma.lisaaJasen(elain);
            } catch (SuperPoikkeus e) {
                System.out.println("Heitettiin poikkeus kun yritettiin lisätä eläintä");
                System.out.println(elain);
            }
            System.out.println("Ryhmä nyt:");
            ryhma.tulostaRyhma();
        }
        
        al.clear();
        al.add(new SuperElain("koira", "Superhessu", "Lentotaito"));
        al.add(new SuperElain("koira", "Ressu", "Supermielikuvitus"));
        Collections.shuffle(al, r);
        
        System.out.println("Lisätään kiellettyjä...");
        for (SuperElain elain : al) {
            try {
                ryhma.lisaaJasen(elain);
            } catch (SuperPoikkeus e) {
                System.out.println("Heitettiin poikkeus kun yritettiin lisätä eläintä");
                System.out.println(elain);
            }
            System.out.println("Ryhmä nyt:");
            ryhma.tulostaRyhma();
        }
        
        System.out.println("");
        
        
        System.out.println("Testi 2");
        ryhma = new SuperRyhma("Ryhmä " + nimet[r.nextInt(nimet.length)]);
        System.out.println("Ryhmä luotu!");
        
        al.clear();
        
        al.add(new SuperElain("possu", "Mr. Ponteva", "Superhengitys"));
        al.add(new SuperElain("lehmä", "Kapteeni Muu", "Supermärehtiminen"));
        al.add(new SuperElain("koira", "Supermusti", "Superhaukku"));
        al.add(new SuperElain("koira", "Mad Dog", "Superpurenta"));
        Collections.shuffle(al, r);
        
        System.out.println("Lisätään sallittuja...");
        for (SuperElain elain : al) {
            try {
                ryhma.lisaaJasen(elain);
            } catch (SuperPoikkeus e) {
                System.out.println("Heitettiin poikkeus kun yritettiin lisätä eläintä");
                System.out.println(elain);
            }
            System.out.println("Ryhmä nyt:");
            ryhma.tulostaRyhma();
        }
        
        al.clear();
        al.add(new SuperElain("kissa", "Ms. Karvinen", "Superruokahalu"));
        al.add(new SuperElain("kissa", "Kissamies", "Superkehräys"));
        Collections.shuffle(al, r);
        
        System.out.println("Lisätään kiellettyjä...");
        for (SuperElain elain : al) {
            try {
                ryhma.lisaaJasen(elain);
                
            } catch (SuperPoikkeus e) {
                System.out.println("Heitettiin poikkeus kun yritettiin lisätä eläintä");
                System.out.println(elain);
            }
            System.out.println("Ryhmä nyt:");
            ryhma.tulostaRyhma();
        }
        
        
       
    }
}

class SuperPoikkeus extends Exception {
    public SuperPoikkeus(String viesti) {
        super(viesti);
    }
}

class SuperElain {
    private String laji;
    private String nimi;
    private String supervoima;
    
    public SuperElain(String laji, String nimi, String supervoima) {
        this.laji = laji;
        this.nimi = nimi;
        this.supervoima = supervoima;
    }
    
    public String getLaji() {
        return laji;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public String getSupervoima() {
        return supervoima;
    }

    @Override
    public String toString() {
        return nimi + " (" + laji + "), supervoima: " + supervoima;
    }
}

class SuperRyhma {
    protected String nimi;
    protected ArrayList<SuperElain> lista;
    
    public SuperRyhma(String nimi) {
        this.nimi = nimi;
        this.lista = new ArrayList<>();

    }
    
    
    public void lisaaJasen(SuperElain elain) throws SuperPoikkeus {
        for (SuperElain elainListassa : lista) {
            String molempienLajit = elainListassa.getLaji() + elain.getLaji();
            if (molempienLajit.contains("kissa") && molempienLajit.contains("koira")) {
                throw new SuperPoikkeus("fjxgfcvgfcdfhg");
            }
        }
        
        lista.add(elain);
                
    }
    

    public void tulostaRyhma() {
        System.out.println(nimi);
        for (SuperElain elain3 : lista) {
            System.out.println(elain3);
        }
    }
    

}