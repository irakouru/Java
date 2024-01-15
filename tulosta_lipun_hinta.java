/*
Ohjelmassa on annettu valmiiksi koodi, jolla luetaan käyttäjältä tämän ikä. Tehtäväsi on tulostaa ruudulle lipun hinta seuraavien sääntöjen mukaan:

0 - 9 -vuotiaat: 2 euroa
10 - 64 -vuotiaat: 5 euroa
yli 65-vuotiaat: lippu on ilmainen
Jos käyttäjä antaa negatiivisen luvun, tulostetaan tieto virheellisestä syötteestä. Katso tulosteisiin mallia alla olevista kolmesta esimerkkisuorituksesta:

 Esimerkki 1:
Anna ikä: 7
Lipun hinta on 2e

Esimerkki 2:
Anna ikä: 94
Lippu on ilmainen
 
Esimerkki 3:
Anna ikä: -1
Syöte ei kelpaa 
*/

import java.util.Random;
import java.util.Scanner;

public class tulosta_lipun_hinta {
    public static void main(String[] args){
        final Random r = new Random();

        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna ikä: ");
        int ika = Integer.valueOf(lukija.nextLine());

        if (0 <= ika && ika < 10){
            System.out.println("Lipun hinta on 2e");
        } else if (10 <= ika && ika < 65){
            System.out.println("Lipun hinta on 5e");
        } else if (ika >= 65){
            System.out.println("Lippu on ilmainen");
        } else {
            System.out.println("Syöte ei kelpaa");
        }
    }
}
