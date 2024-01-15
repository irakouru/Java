/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään työpäivien määrän (kokonaisluku) ja päiväpalkan (liukuluku).

Ohjelma laskee käyttäjän kokonaispalkan tietojen perusteella. 

Jos työpäiviä on yli 5, kokonaispalkkaan lasketaan 20 % korotus.

Jos työpäiviä on kuitenkin yli 10, kokonaispalkkaan laskettava korotus on 50 %.

Esimerkkituloste:

Työpäiviä: 11
Päiväpalkka: 8.50
Kokonaispalkka: 140.25 
*/

import java.util.Random;
import java.util.Scanner;

public class laske_kokonaispalkka {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Työpäiviä: ");
        int työpäivät = Integer.valueOf(lukija.nextLine());

        System.out.print("Palkka: ");
        double palkka = Double.valueOf(lukija.nextLine());

        if (5 < työpäivät && työpäivät <= 10){
            System.out.println("Kokonaispalkka: " + työpäivät * palkka * 1.2);
        } else if (työpäivät > 10){
            System.out.println("Kokonaispalkka: " + työpäivät * palkka * 1.5);
        } else {
            System.out.println("Kokonaispalkka: " + työpäivät * palkka);
        }
    }
}
