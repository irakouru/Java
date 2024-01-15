//KOODI EI TOIMI VSCODELLA

/*
Tiedostoon luvut.csv on tallennettu lukuja. Yhdellä rivillä on useampia lukuja pilkulla erotettuna. Tiedosto voisi siis näyttää esim. tältä:

1,2,1,2,3
4,3,2,3,2,4,2
1,2,3
Kirjoita metodi

ArrayList<Integer> kaikkiArvot()

joka lukee luvut tiedostosta, ja tallentaa ne listaan. Lopuksi lista palautetaan.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    ArrayList<Integer> lista = kaikkiArvot();
    System.out.println(lista);
}
Esimerkkituloste:

[1, 2, 1, 2, 3, 4, 3, 2, 3, 2, 4, 2, 1, 2, 3] 
*/

import java.util.Random;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Lue_luvut_tiedostosta {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Tiedosto:");
        for (String s : syote) {
            System.out.println("" + s);
        }
        
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
       
        System.out.println("Testataan tiedoston lukua...");
        ArrayList<Integer> p = kaikkiArvot();
        System.out.println("Kaikki arvot:");
        for (int arvo : p) {
            System.out.println(arvo);
        }
       
    }
    public static ArrayList<Integer> kaikkiArvot() {
        ArrayList<Integer> numeroLista = new ArrayList<>();
        File tiedosto = new File("luvut.csv");
        try(Scanner lukija = new Scanner(tiedosto)) {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                String[] palat = rivi.split(",");
                for (String pala : palat) {
                    int luku = Integer.valueOf(pala);
                    numeroLista.add(luku);
                }
            }
        } catch (FileNotFoundException e) {
                System.out.println("Virhe: " + e.getMessage());
            }
        return numeroLista;    
    }
}
