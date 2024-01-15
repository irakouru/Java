/*
Kirjoita metodi

void poistaNegatiiviset(ArrayList<Integer> luvut) 

...joka poistaa listasta kaikki nollaa pienemmät luvut.

Vinkki: for-silmukka ei välttämättä toimi luotettavasti, jos iteroitava rakenne muuttuu silmukan suorituksen aikana - kannattaa käyttää ennemmin jotain muuta tapaa listan läpikäyntiin.

Esimerkki metodin kutsumisesta:

public static void main(String[] parametrit){
    ArrayList<Integer> luvut = new ArrayList<>();
    luvut.add(1);
    luvut.add(-2);
    luvut.add(-5);
    luvut.add(10);
    System.out.println(luvut);
    poistaNegatiiviset(luvut);
    System.out.println(luvut);
}
Ohjelma tulostaa:

[1, -2, -5, 10]
[1, 10]
*/

import java.util.Random;
import java.util.ArrayList;

public class poista_negatiiviset_luvut {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[][] s = {{1,-2,3}, {10,-20,30,-40}, {-2,4,-6,8,-10}, {-9,-1,-8,2,7,3,-6,-4}};
        
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
            
            System.out.println("Lista ennen: ");
            System.out.println("" + lista);
            System.out.println("Lista jälkeen: ");
            poistaNegatiiviset(lista);
            System.out.println(lista);
            System.out.println("");
            
        }
    }
    
    public static void poistaNegatiiviset(ArrayList<Integer> luvut) {
        ArrayList<Integer> poistettavat = new ArrayList<>();
        for (int luku : luvut) {
            if (luku < 0) {
                poistettavat.add(luku); 
            }
        }
        for (int numero : poistettavat)  {
            int index = luvut.indexOf(numero);
            luvut.remove(index);
        }
    }
}

