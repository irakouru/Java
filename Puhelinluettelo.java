/*
Kirjoita metodi

void lisaaNumero(HashMap<String,String> numerot)

joka pyytää käyttäjää syöttämään nimen ja numeron ja lisää ne sitten parametrina saatuun hajautustauluun (niin, että nimi on avain ja numero arvo).

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    HashMap<String,String> numerot = new HashMap<>();
    lisaaNumero(numerot);
    System.out.println(numerot);
}
Esimerkkisuoritus:

Nimi: Jarmo Java
Numero: 1234567
{Jarmo Java=1234567} 
*/

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Puhelinluettelo {
    public static void main(String[] args){
        final Random r = new Random();
        
        HashMap<String,String> nrot = new HashMap<>();
            
        lisaaNumero(nrot);
        System.out.println("Luettelo nyt:");
            
        ArrayList<String> nimet = new ArrayList<>(nrot.keySet());
        Collections.sort(nimet);
        for (String nimi : nimet) {
            System.out.println(nimi + ": " + nrot.get(nimi));
        }
    }
    
    public static void lisaaNumero (HashMap<String, String> numero) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine(); 
        System.out.print("Numero: ");
        String puhnro = lukija.nextLine(); 
        numero.put(nimi, puhnro);
    }
}
