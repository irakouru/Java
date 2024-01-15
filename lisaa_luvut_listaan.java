/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaislukuja. Ohjelma lisää käyttäjän syöttämät luvut listaan syöttöjärjestyksessä.

Kun käyttäjä syöttää luvun -1, ohjelman suoritus päättyy ja ohjelma tulostaa listan.

Esimerkkisuoritus:

Anna luku: 2
Anna luku: 3
Anna luku: 4
Anna luku: 5
Anna luku: -1
[2, 3, 4, 5]
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class lisaa_luvut_listaan {
    public static void main(String[] args){
        final Random r = new Random();
        
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> numeroLista = new ArrayList<>();
        boolean flag = true;
        while (flag == true) {
            //Scanner lukija = new Scanner(System.in);
            System.out.print("Anna luku: ");
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero == -1) {
                flag = false;
            } else {
                numeroLista.add(numero);
            }
        }
            
    System.out.println(numeroLista);
    }
}

