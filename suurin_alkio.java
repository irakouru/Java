/*
Kirjoita metodi

int suurinAlkio(ArrayList<Integer> luvut)

joka palauttaa kokonaislukulistassa luvut olevista alkioista suurimman.

Esimerkki metodin kutsumisesta:

public static void main(String[] args) {
    ArrayList<Integer> testiluvut = new ArrayList<>();
    testiluvut.add(4);
    testiluvut.add(9);
    testiluvut.add(3);
    testiluvut.add(-2);

    int suurin = suurinAlkio(testiluvut);
    System.out.println("Suurin: " + suurin);
}
Ohjelma tulostaa:

Suurin: 9 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class suurin_alkio {
    public static void main(String[] args){
        final Random r = new Random();
        
        testaa(new int[]{4,20,3,6,7,8,9,11,13,16,17});
        testaa(new int[]{1,5,2,4,3,6,4,7,5,8,6,3,9,5,3});
        testaa(new int[]{-5,-4,-1,-2,-3,-6,-7});
        
        int pituus = r.nextInt(10) + 10;
        int[] l = new int[pituus];
        for (int i=0; i<pituus; i++) {
            l[i] = (100 - r.nextInt(200));
        }
        testaa(l);
        
        
    }
    
    public static void testaa(int[] l) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int a : l) {
            lista.add(a);
        }
        System.out.println("Testataan listalla " + lista);
        System.out.println("Suurin alkio: " + suurinAlkio(lista));
        System.out.println("");
    }

    public static int suurinAlkio (ArrayList<Integer> luvut) {
        int suurin = -1000;
        for (int luku : luvut) {
            if (luku > suurin) {
                suurin = luku;
            }
        }
        return suurin;
    }
}
