/*
Kirjoita kaksi metodia: tulostaMoi() ja tulostaHei()

Metodit tulostavat nimensä mukaisesti joko merkkijonon "Moi!" tai merkkijono "Hei!".

Alla esimerkki metodien kutsumisesta:

public static void main(String[] args) {
    tulostaMoi();
    tulostaHei();
}
Ohjelma tulostaa:

Moi!
Hei! 
*/

import java.util.Random;

public class moi_ja_hei {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan tulostaMoi:");
        tulostaMoi();
        
        System.out.println("");
        
        System.out.println("Testataan tulostaHei:");
        tulostaHei();
    }

    public static void tulostaMoi() {
        System.out.println("Moi!");
    
    }
    
    public static void tulostaHei() {
        System.out.println("Hei!");
    
    }
}
