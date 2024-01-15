/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaislukuja. Ohjelma tallentaa luvut kokonaislukutyyppiseen listaan.

Kun käyttäjä syöttää luvun -1, ohjelman suoritus päättyy ja ohjelma tulostaa kaikkien (ennen -1:tä) syötettyjen lukujen summan, keskiarvon, minimin ja maksimin.

Käytä arvojen laskemiseen virtoja!

Esimerkkisuoritus:

Anna luku: 1
Anna luku: 2
Anna luku: 3
Anna luku: -1
Summa: 6
Keskiarvo: 2.0
Minimi: 1
Maksimi: 3

*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class lukujen_summa_keskiarvo_minimi_ja_maksimi {
    public static void main(String[] args){
        final Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>(); 

        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            } else {
                lista.add(luku);
            }
        }

        System.out.println("Summa: " + lista.stream().mapToInt(luku -> luku).sum());
        System.out.println("Keskiarvo: " + lista.stream().mapToInt(luku -> luku).average().getAsDouble());
        System.out.println("Minimi: " + lista.stream().mapToInt(luku -> luku).min().getAsInt());
        System.out.println("Maksimi: " + lista.stream().mapToInt(luku -> luku).max().getAsInt());

    }
}
