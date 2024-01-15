/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään vuorokausien määrän (kokonaisluku). Ohjelma laskee ja tulostaa minuuttien määrän vuorokaudessa alla olevan esimerkkitulosteen mukaisesti. Käyttäjän syöte on annettu esimerkissä lihavoituna. Huomaa, että ohjelmasi tulosteen tulee olla täsmälleen samanlainen kuin esimerkkitulosteessa.

Anna vuorokausien määrä: 4
4 vuorokaudessa on 5760 minuuttia. 
*/

import java.util.Random;
import java.util.Scanner;

public class minuutteja_vuorokaudessa {
    public static void main(String[] args){
    final Random r = new Random();
    Scanner lukija = new Scanner(System.in);
    System.out.print("Anna vuorokausien määrä: ");
    int luku = Integer.valueOf(lukija.nextLine());
    System.out.println(luku + " vuorokaudessa on " + luku * 24 * 60 + " minuuttia.");
    }
}
