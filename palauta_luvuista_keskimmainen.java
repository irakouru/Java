/*
Kirjoita metodi 

keskimmainen

...joka saa parametrikseen kolme kokonaislukua. Metodi palauttaa luvuista suuruusjärjestyksessä keskimmäisen.

Esimerkkejä metodin kutsumisesta:

public static void main(String[] args) {
    System.out.println(keskimmainen(1, 3, 2);
    int keski = keskimmainen(8, 9, 7);
    System.out.println(keski);ulos);
}
Ohjelma tulostaa:

2
8 
*/

import java.util.Random;

public class palauta_luvuista_keskimmainen {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4,3}, {121,145,94}, {20,30,40}, {9,7,8}, {99,77,88}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1] + ", " + pa[2]);
            System.out.print("Keskimmäinen: ");
            System.out.println(keskimmainen((Integer) pa[0], (Integer) pa[1], (Integer) pa[2]));
            System.out.println("");
        }
    }

    public static int keskimmainen(int luku1, int luku2, int luku3) {
        int keskimmainen = 0;
        if (luku1 < luku2 && luku2 < luku3) {
            keskimmainen = luku2;
        } else if (luku3 < luku1 && luku1 < luku2) {
            keskimmainen = luku1;
        } else if (luku2 < luku3 && luku3 < luku1) {
            keskimmainen = luku3;
        } else if (luku3 < luku2 && luku2 < luku1) {
            keskimmainen = luku2;
        } else if (luku2 < luku1 && luku1 < luku3) {
            keskimmainen = luku1;
        } else if (luku1 < luku3 && luku3 < luku2) {
            keskimmainen = luku3;
        }
        
        return keskimmainen;
    }
}
