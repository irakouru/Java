/*
Kirjoita metodi

public static void lisaaRyhmaan(SuperRyhma ryhma, ArrayList<SuperElain> elaimet)
joka saa parametrikseen ryhmän ja listan jäseniä.

Metodi yrittää lisätä jäsenet yksi kerrallaan ryhmään. Jokaisen eläimen kohdalla tulostetaan (alla olevan esimerkin mukainen) viesti siitä, onnistuiko ryhmään lisäys vai ei.

Kun kaikki jäsenet on yritetty lisätä, tulostetaan ryhmä käyttäen SuperRyhma-luokan metodia tulostaRyhma().

Esimerkki metodin kutsumisesta:

public static void main(String[] args) {
    ArrayList<SuperElain> al = new ArrayList<>();
    
    al.add(new SuperElain("possu", "Veli Huilu", "Supermusisointi"));
    al.add(new SuperElain("kissa", "Crazy Kat", "Supervoimat"));
    al.add(new SuperElain("koira", "Superressu", "Supervoimat"));
    
    SuperRyhma ryhma = new SuperRyhma("Ryhmä Äks");
    lisaaRyhmaan(ryhma, al);
}
Ohjelma tulostaa:

Onnistui: Veli Huilu (possu), supervoima: Supermusisointi
Onnistui: Crazy Kat (kissa), supervoima: Supervoimat
Ei onnistunut: Superressu (koira), supervoima: Supervoimat
Ryhmä Äks
Veli Huilu (possu), supervoima: Supermusisointi
Crazy Kat (kissa), supervoima: Supervoimat 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class omat_poikkeukset_3_poikkeukset_kiinniottaminen {
    public static void main(String[] args){
        final Random r = new Random();
        
        ArrayList<SuperElain> al = new ArrayList<>();
        
        al.add(new SuperElain("possu", "Mr. Ponteva", "Superhengitys"));
        al.add(new SuperElain("lehmä", "Kapteeni Muu", "Supermärehtiminen"));
        al.add(new SuperElain("kissa", "Felixx", "Supernäkö"));
        al.add(new SuperElain("koira", "Superressu", "Supervoimat"));
        Collections.shuffle(al, r);
        
        SuperRyhma ryhma = new SuperRyhma("Ryhmä Äks");
        lisaaRyhmaan(ryhma, al);
    }

    public static void lisaaRyhmaan(SuperRyhma ryhma, ArrayList<SuperElain> elaimet) {
        
        for (SuperElain elain : elaimet) {
            try {
                ryhma.lisaaJasen(elain); 
                System.out.println("Onnistui: " + elain);
            } catch (SuperPoikkeus e) {
                System.out.println("Ei onnistunut: " + elain);
            }
        }
        
        ryhma.tulostaRyhma();
    }
}
