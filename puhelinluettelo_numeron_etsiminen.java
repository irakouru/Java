//KOODI EI TOIMI VSCODESSA

/*
Kirjoita metodi

void etsiNumero(HashMap<String,String> numerot)

joka pyytää käyttäjää syöttämään nimen ja etsii ja tulostaa sitten puhelinluettelosta nimen mukaisen numeron. Jos nimeä ei löydy, ohjelma tulostaa mallivastauksen mukaisesti virheviestin..

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    HashMap<String,String> numerot = new HashMap<>();
    numerot.put("Teemu", "12345");
    numerot.put("Kalle", "54321");
    numerot.put("Juho", "66666");

    etsiNumero(numerot);
    etsiNumero(numerot);
    etsiNumero(numerot);
}
Esimerkkisuoritus:

Nimi: Teemu
Numero: 12345
Nimi: Kalle
Numero: 54321
Nimi: Pertti
Nimeä ei löydy
*/

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class puhelinluettelo_numeron_etsiminen {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        etsiNumero(nrot);
                
    }

    public static void etsiNumero(HashMap<String, String> numerot) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine(); 
        
        if  (numerot.get(nimi) == null) {
            System.out.println("Nimeä ei löydy");
        } else {
            System.out.println("Numero: " + numerot.get(nimi));
        }
    }
}