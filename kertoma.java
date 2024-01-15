/*
Kirjota metodi

kertoma(int luku)

joka laskee ja palauttaa kokonaislukuna annetun luvun kertoman.

Kertoma lasketaan kertomalla luku kaikilla itseään pienemmillä kokonaisluvuilla, esimerkiksi luvun 5 kertoma on 5 x 4 x 3 x 2 x 1.

Esimerkkejä funktion kutsumisesta:

public static void main(String[] args) {
    System.out.println(kertoma(3));
    int k = kertoma(4);
    System.out.println(k);
}
Ohjelma tulostaa:

6
24 
*/

import java.util.Random;

public class kertoma {
    public static void main(String[] args){
        final Random r = new Random();
        
        int[] p = {2,3,4,6,1};
        for (int pa : p) {
            System.out.println("Testataan parametrin arvolla " + pa);
            System.out.println("Kertoma: " + kertoma(pa));
            System.out.println("");
        }
        
    }

    public static int kertoma(int luku) {
        int tulos = 1;
        for (int i=luku; i>0; i--) {
            tulos = tulos * i;
        }
        return tulos;
    }
}
