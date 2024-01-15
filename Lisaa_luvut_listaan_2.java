/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaislukuja. Ohjelma lisää käyttäjän syöttämät luvut listaan syöttöjärjestyksessä. 

Kun käyttäjä syöttää luvun -1, ohjelman suoritus päättyy ja ohjelma tulostaa listan.

Jos käyttäjä syötteessä on jotain muuta kuin numeroita, ohjelma jättää syötteen huomiotta.

Esimerkkisuoritus:

Anna luku: 2
Anna luku: 3
Anna luku: sdf
Anna luku: 4
Anna luku: 5
Anna luku: nelkyt
Anna luku: -1
[2, 3, 4, 5]
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Lisaa_luvut_listaan_2 {
     public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> numeroLista = new ArrayList<>();
        boolean flag = true;
        while (flag == true) {
            try {
                System.out.print("Anna luku: ");
                int luku = Integer.valueOf(lukija.nextLine());
                if (luku == -1) {
                    flag = false;
                    break;
                } else {
                    numeroLista.add(luku);
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }   
    
    System.out.println(numeroLista);
    }
}