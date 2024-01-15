/*
Kirjoita metodi

void lisaaSumma(ArrayList<Integer> luvut) 

...joka laskee listassa olevien lukujen summan ja lisää sen listan viimeiseksi alkioksi.

Esimerkki metodin kutsumisesta:

public static void main(String[] parametrit){
    ArrayList<Integer> luvut = new ArrayList<>();
    for (int i=1; i<5; i++) {
        luvut.add(i);
    }
    System.out.println(luvut);
    lisaaSumma(luvut);
    System.out.println(luvut);
}
Ohjelma tulostaa:

[1, 2, 3, 4]
[1, 2, 3, 4, 10] 
*/

import java.util.Random;
import java.util.ArrayList;

public class lisaa_summa_listaan{
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[][] s = {{1,2,3}, {10,20,30,40}, {2,4,6,8,10}, {9,1,8,2,7,3,6,4}};
        
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
            
            System.out.println("Lista ennen: ");
            System.out.println("" + lista);
            System.out.println("Lista jälkeen: ");
            lisaaSumma(lista);
            System.out.println(lista);
            
        }
    }
    
    public static void lisaaSumma(ArrayList<Integer> luvut) {
        int summa = 0; 
        for (int i=0; i<luvut.size(); i++){
            summa = summa + luvut.get(i); 
        }
        luvut.add(summa); 
    }
}