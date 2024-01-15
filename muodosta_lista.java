/*
Kirjoita metodi 

ArrayList<Integer> muodostaLista(int alku, int loppu)

...joka saa parametrikseen listan alku- ja loppuarvot. Metodi muodostaa uuden listan, jossa on järjestyksessä kaikki alkiot annettujen pisteiden väliltä yhden askeleen välein. Tuttuun tapaan alkualkio on listassa mukana, mutta loppualkio ei.

Huomaa, että lista pitää mudostaa takaperin, jos alkualkio on suurempi kuin loppualkio. Katso mallia esimerkkisuorituksista.

Esimerkkejä metodin kutsumisesta:

public static void main(String[] parametrit){
    System.out.println(muodostaLista(1,10));
    System.out.println(muodostaLista(10,1));
}
Ohjelma tulostaa:

[1, 2, 3, 4, 5, 6, 7, 8, 9]
[10, 9, 8, 7, 6, 5, 4, 3, 2] 
*/

import java.util.Random;
import java.util.ArrayList;

public class muodosta_lista {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4}, {100,106}, {5,0}, {90,80}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1]);
            System.out.println(muodostaLista((Integer) pa[0], (Integer) pa[1]));
            System.out.println("");
        }
    }
    
    public static ArrayList<Integer> muodostaLista(int alku, int loppu){
        ArrayList<Integer> uusiLista = new ArrayList<>();
        if (alku < loppu) {
            for (int i=alku; i<loppu; i++) {
                uusiLista.add(i);
            }
        } else {
            for (int i = alku; i > loppu; i--) {
                uusiLista.add(i);
            }
        }
        return uusiLista;
    }
}
