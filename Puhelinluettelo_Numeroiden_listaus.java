/*
Kirjoita metodi

void listaa(HashMap<String,String> numerot

joka tulostaa luettelosta löytyvät käyttäjät ja näiden numerot allekkain ruudulle.Numerot tulee tulostaa aakkosjärjestyksessä.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    HashMap<String,String> numerot = new HashMap<>();
    numerot.put("Teemu", "12345");
    numerot.put("Kalle", "54321");
    numerot.put("Juho", "66666");

    listaa(numerot);
}
Ohjelma tulostaa:

Nimi: Juho, numero: 66666
Nimi: Kalle, numero: 54321
Nimi: Teemu, numero: 12345 
*/

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Puhelinluettelo_Numeroiden_listaus {
    public static void main(String[] args){
        final Random r = new Random();

        //<hide>
        
        HashMap<String, String> nrot = new HashMap<>();
        nrot.put("Pekka", "" + r.nextInt(1000000));
        nrot.put("Leena", "" + r.nextInt(1000000));
        nrot.put("Kimmo", "" + r.nextInt(1000000));
        nrot.put("Lasse", "" + r.nextInt(1000000));
        nrot.put("Liisa", "" + r.nextInt(1000000));
        nrot.put("Zorro", "" + r.nextInt(1000000));
        nrot.put("Tarzan", "" + r.nextInt(1000000));
        
        
        listaa(nrot);
        
    }

    public static void listaa(HashMap<String,String> numerot) {
        ArrayList<String> avaimet = new ArrayList<>();
        for (String avain : numerot.keySet()) {
            avaimet.add(avain);
            
        }

        Collections.sort(avaimet);

        for (String avain : avaimet) {
            System.out.println("Nimi: " + avain + ", " + "numero: " + numerot.get(avain));
        }    
    }
}
