/*
Kirjoita ohjelmaan  main-metodi. Metodin tulee tulostaa kuuden kertotaulu täsmälleen alla olevan esimerkkitulosteen mukaisesti.

Tuloste:

Kuuden kertotaulu
1 x 6 = 6
2 x 6 = 12
3 x 6 = 18
4 x 6 = 24
5 x 6 = 30
6 x 6 = 36
7 x 6 = 42
8 x 6 = 48
9 x 6 = 54
10 x 6 = 60
*/

import java.util.Random;

public class kirjoita_main_metodi {
    public static void main(String[] args) {
        System.out.println("Kuuden kertotaulu");
        for (int i=1; i<11; i++) {
            System.out.println(i+" x "+"6"+" = "+(i*6));
        }
    }
}
