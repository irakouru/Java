/*
Kirjoita metodi

ArrayList<Integer> lukuLista(ArrayList<String> lista)

joka saa parametrikseen merkkijonoja sisältävän listan. Merkkijonot sisältävän lukuja.

Metodi palauttaa uuden kokonaislukutyyppisen listan, jossa merkkijonojen sisältö on muunnettu kokonaisluvuiksi.

Esimerkki metodin kutsumisesta:

public static void main(String[] parametrit){
    ArrayList<String> lista = new ArrayList<>();
    lista.add("2");
    lista.add("10");
    lista.add("-999");

    System.out.println(lukuLista(lista));
}
Ohjelma tulostaa:

[2, 10, -999]
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class muuta_lukulistaksi {
    public static void main(String[] args){
        final Random r = new Random();
        
        testaa(new int[]{4,20,3,6,7,8,9,11});
        testaa(new int[]{1,5,2,4,3,6,4,7,5,8,6,3,9,5,3});
        testaa(new int[]{-5,-4,-1,-2,-3,-6,-7});
        
        int pituus = r.nextInt(10) + 10;
        int[] l = new int[pituus];
        for (int i=0; i<pituus; i++) {
            l[i] = (100 - r.nextInt(200));
        }
        testaa(l);
        
        
    }
    
    public static void tulosta(ArrayList<String> lista) {
        System.out.print("[\"");
        System.out.print(String.join("\", \"", lista));
        System.out.println("\"]");
    }
    
    public static void testaa(int[] l) {
        ArrayList<String> lista = new ArrayList<>();
        for (int a : l) {
            lista.add("" + a);
        }
        System.out.println("Testataan listalla ");
        System.out.print("");
        tulosta(lista);
        System.out.println("Kokonaislukuina: " + lukuLista(lista));
        System.out.println("");
    }

    public static ArrayList<Integer> lukuLista(ArrayList<String> lista) {
        ArrayList<Integer> uusiLista = new ArrayList<>();
        for (String luku : lista) {
            int numero = Integer.valueOf(luku);
            uusiLista.add(numero); 
        }
        return uusiLista;
    }
}
