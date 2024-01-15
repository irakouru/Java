/*
Kirjoita ohjelma, joka kyselee käyttäjältä nimiä. Annetut nimet lisätään listaan.

Jos nimi kuitenkin on jo listassa, sitä ei lisätä sinne uudestaan vaan tulostetaan käyttäjälle virheviesti. 

Kun käyttäjä antaa nimeksi "lopeta", tulostetaan nimilista ja ohjelman suoritus päättyy.

Esimerkkisuoritus:

Anna nimi: Kalle
Moi, Kalle
Anna nimi: Ville
Moi, Ville
Anna nimi: Kalle
Nimi on jo annettu
Anna nimi: Anu
Moi, Anu
Anna nimi: Ville
Nimi on jo annettu
Anna nimi: lopeta
Nimet: [Kalle, Ville, Anu] 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class nimet_listaan {
    public static void main(String[] args){
        final Random r = new Random();
        ArrayList<String> nimilista = new ArrayList<>();
    Scanner lukija = new Scanner(System.in); 

    boolean flag = true;

        while (flag == true) {
            System.out.print("Anna nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("lopeta")) {
                System.out.println("Nimet: " + nimilista); 
                flag = false;
            } else if (nimilista.contains(nimi)) {
                System.out.println("Nimi on jo annettu");
            } else {
                nimilista.add(nimi);
                System.out.println("Moi, " + nimi);
            }
        }
    }

}
