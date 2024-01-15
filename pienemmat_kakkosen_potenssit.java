/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaisluvun. Ohjelma tulostaa kakkosen potensseja. jotka ovat pienempiä kuin annettu yläraja.

Käytännössä ohjelma siis tulostaa lukuja sarjasta 1, 2, 4, 8...jne.

Esimerkki suorituksesta:

Anna yläraja: 25
1
2
4
8
16 
*/

import java.util.Random;
import java.util.Scanner;

public class pienemmat_kakkosen_potenssit {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna yläraja: ");
        int luku = Integer.valueOf(lukija.nextLine());

        int tulos = 1;

        for (int i=0; tulos < luku; i++) {
            System.out.println(tulos);
            tulos = tulos * 2;
        }
    }
}
