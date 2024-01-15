/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaisluvun. Ohjelma tulostaa sitten kokonaisluvun mukaisen lukukolmion alla näkyvien esimerkkitulosteiden mukaisesti.

Esimerkkituloste:

Anna luku: 4
1
12
123
1234 
*/

import java.util.Random;
import java.util.Scanner;

public class lukukolmio {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        String taso = "";
        for (int laskuri=1; laskuri <= luku; laskuri++) {
            String stringForm = String.valueOf(laskuri);
            System.out.println(taso + stringForm);
            taso = taso + stringForm;
        }
    }
}