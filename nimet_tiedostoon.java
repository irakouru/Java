/*
 * Kirjoita ohjelma, joka kyselee käyttäjältä nimiä. Annetut nimet lisätään tiedostoon nimet.txt siten, että jokainen nimi on omalla rivillään. 
 * Kun käyttäjä antaa nimeksi "lopeta", ohjelman suoritus päättyy.
 */

 import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class nimet_tiedostoon {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);

try (PrintWriter tiedosto = new PrintWriter("testi.txt")) {
    while (true) {
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();   
        if (nimi.equals("lopeta")) {
            break;
        } else {
            tiedosto.write(nimi + "\n");
        }
    }
    
} catch (FileNotFoundException e) {
    System.out.println("Tapahtui virhe: " + e);
}
System.out.println("Tiedoston sisältö:");
        
}
}
