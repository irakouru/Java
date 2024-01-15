/*
Kirjoita metodi 

tulostaKeskimmainen

...joka saa parametrikseen kolme kokonaislukua. Metodi tulostaa luvuista suuruusjärjestyksessä keskimmäisen.

Jos metodi parametrit esimerkiksi olisivat 1, 3 ja 2, metodi tulostaisi luvun 2. 
*/

import java.util.Random;

public class tulosta_luvuista_keskimmainen {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4,3}, {121,145,94}, {20,30,40}, {9,7,8}, {99,77,88}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1] + ", " + pa[2]);
            tulostaKeskimmainen((Integer) pa[0], (Integer) pa[1], (Integer) pa[2]);
            System.out.println("");
        }
    }

    public static void tulostaKeskimmainen(int luku1, int luku2, int luku3) {
        if (luku1 < luku2 && luku2 < luku3) {
            System.out.println(luku2);
        } else if (luku2 < luku1 && luku1 < luku3) {
            System.out.println(luku1);
        } else if (luku1 < luku3 && luku3 < luku2) {
            System.out.println(luku3);
        } else if (luku2 < luku3 && luku3 < luku1) {
            System.out.println(luku3);
        } else if (luku3 < luku1 && luku1 < luku2) {
            System.out.println(luku1);
        }
    }
}
