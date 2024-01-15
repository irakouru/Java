/*
Tiedostossa pelaajat.txt on pelaajien nimiä, yksi nimi jokaisella rivillä.

Kirjoita metodi

ArrayList<String> luePelaajat()

joka lukee tiedoston sisällön ja tallentaa sen listaan siten, että jokainen nimi on yksi alkio listassa. Lopuksi lista palautetaan.

Käytä lukemiseen Scanner-luokkaa. Voit katsoa mallia tutoriaalissa yllä olevasta koodista.

Esimerkki metodin kutsumisesta (huomaa, että testiohjelma arpoo tiedostolle uuden sisällön joka suorituskerralla - tuloste siis vaihtelee):

public static void main(String[] args){
    ArrayList<String> lista = luePelaajat();
    System.out.println(lista);   
}
Esimerkkituloste:

[Anneli, Anneli, Anu, Kalle, Anneli, Jaana, Tuomas, Jarmo] 
*/

import java.util.Random;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Pelaajat_tiedostosta {
    public static void main(String[] args){
        final Random r = new Random();
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
       
        System.out.println("Testataan tiedoston lukua...");
        ArrayList<String> p = luePelaajat();
        System.out.println("Pelaajat listassa:");
        for (String pelaaja : p) {
            System.out.println(pelaaja);
        }
       
    }
    
    public static ArrayList<String> luePelaajat() {
        ArrayList<String> pelaajaLista = new ArrayList<>();
        File tiedosto = new File("pelaajat.txt");
        try(Scanner lukija = new Scanner(tiedosto)) {
            while (lukija.hasNextLine()) {
                pelaajaLista.add(lukija.nextLine());
            }
        }
            catch (Exception e) {
                System.out.println("Tapahtui virhe!");
            }
        return pelaajaLista;
    }
}
