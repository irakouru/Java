/*
Kirjoita metodi

int toiseksiPienin(ArrayList<Integer> luvut)

...joka palauttaa listan toiseksi pienimmän alkion. Metodi ei saa muuttaa listan alkioiden järjestystä.

Esimerkki metodin kutsumisesta:

public static void main(String[] parametrit){
    ArrayList<Integer> luvut = new ArrayList<>();
    luvut.add(5);
    luvut.add(1);
    luvut.add(8);
    luvut.add(3);
    luvut.add(7);

    System.out.println("Lista ennen: " + luvut);
    System.out.println("Toiseksi pienin: " + toiseksiPienin(luvut));
    System.out.println("Lista jälkeen: " + luvut);   
}
Ohjelma tulostaa:

Lista ennen: [5, 1, 8, 3, 7]
Toiseksi pienin: 3
Lista jälkeen: [5, 1, 8, 3, 7]
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class toiseksi_pienin_ilman_sivuvaikutuksia {
    public static void main(String[] args){
        final Random r = new Random();
            
            
        int[][] s = {{3,2,1,4}, {10,20,40,50,30,60}, {9,7,5,3,8,6,4,2}, {25,5,20,15,10}};
            
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
                
                System.out.println("Lista ennen: ");
                System.out.println("" + lista);
                System.out.println("Toiseksi pienin:" + toiseksiPienin(lista));
                System.out.println("Lista jälkeen: ");
                System.out.println(lista);
                System.out.println("");
        }
    }
      
    public static int toiseksiPienin(ArrayList<Integer> luvut) {
        int pienin = luvut.get(0);
        for (int luku : luvut) {
            if (luku < pienin) {
                pienin = luku;
            }

        }
        int toiseksiPienin = (pienin +1) ;
    
        for (int i = (pienin + 1); ; i++) {
            if (luvut.contains(i) == true) {
                toiseksiPienin = i;
                break;
            }
        } 
        return toiseksiPienin;    
    } 
}
   