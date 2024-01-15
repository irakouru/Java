/*
1. Kirjoita aluksi metodi

public static boolean onkoKarkausvuosi(int vuosi)

...joka palauttaa true tai false sen mukaan onko annetttu vuosi karkausvuosi vai ei.

Vuosi on karkausvuosi jos se on tasan jaollinen neljällä. Sadalla jaollinen vuosi on kuitenkin karkausvuosi vain silloin, jos se on jaollinen myös neljälläsadalla. Niinpä esim. vuodet 2000 ja 2004 ovat karkausvuosia, mutta vuosi 1900 ei ole.

2. Kirjoita sen jälken metodi

public static void karkausvuodet()

...joka pyytää käyttäjää syöttämään alku- ja loppuvuoden. Tämän jälkeen metodi tulostaa kaikki näiden vuosien välistä löytyvät karkausvuodet. Hyödynnä totetuksessa metodia onkoKarkausvuosi!

Esimerkki metodin suorituksesta:

Anna alku: 1970
Anna loppu: 1977
1972 on karkausvuosi
1976 on karkausvuosi 
*/

import java.util.Random;
import java.util.Scanner;

public class karkausvuodet_osa_2 {
    public static void main(String[] args){
        final Random r = new Random();
        
        
            
        karkausvuodet();   
    }

    public static boolean onkoKarkausvuosi(int vuosi) {
        boolean flag = false;
        if (vuosi % 100 != 0 && vuosi % 4 == 0){
            flag = true;
        } else if (vuosi % 100 == 0 && vuosi % 4 == 0 && vuosi % 400 == 0){
            flag = true;
        }
        return flag;
    }
    
    
    public static void karkausvuodet() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna alku: ");
        int alku = Integer.valueOf(lukija.nextLine());
        
        System.out.print("Anna loppu: ");
        int loppu = Integer.valueOf(lukija.nextLine());
        
        for (int i = alku; i <= loppu; i++) {
            boolean onko = onkoKarkausvuosi(i);
            if (onko == true) {
                System.out.println(i + " on karkausvuosi");
            } else {
                continue;
            }
        }
    }
    
}
