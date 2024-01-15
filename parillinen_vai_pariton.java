/*
Myös Javassa jakolaskun jakojäännös voidaan palauttaa operaattorin % avulla. Operaattori toimii esim. näin:

int jaannos = 5 % 2;
// tulostaa 1, koska 5 / 2 == 2, jää 1.
System.out.println(jaannos);
Samalla operaattorilla voidaan kätevästi testata luvun parillisuutta: jos jakojäännös jaettaessa kahdella on yksi, luku on pariton.

Kirjoita ohjelma, joka kysyy käyttäjältä kokonaisluvun ja tulostaa sitten tiedon siitä onko luku pariton vai parillinen alla olevien esimerkkitulosteiden mukaisesti. Alla on siis esitettynä ohjelman suoritus kahteen kertaan:

Esimerkkituloste 1:

Anna luku: 8
Luku 8 on parillinen
Esimerkkituloste 2:

Anna luku: 3
Luku 3 on pariton 
*/

import java.util.Random;
import java.util.Scanner;

public class parillinen_vai_pariton {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku % 2 == 1){
            System.out.println("Luku " + luku + " on pariton");
        } else {
            System.out.println("Luku " + luku + " on parillinen");
        }
    }
}
