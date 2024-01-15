/*
Kirjoita ohjelma, joka kysyy käyttäjältä vuotta ja ilmoittaa, onko annetttu vuosi karkausvuosi vai ei.

Vuosi on karkausvuosi jos se on tasan jaollinen neljällä. Sadalla jaollinen vuosi on kuitenkin karkausvuosi vain silloin, jos se on jaollinen myös neljälläsadalla.

Niinpä esim. vuodet 2000 ja 2004 ovat karkausvuosia, mutta vuosi 1900 ei ole.

Esimerkkituloste 1:

Anna vuosi: 1984
On karkausvuosi
Esimerkkituloste 2:

Anna vuosi: 1983
Ei ole karkausvuosi 
*/

import java.util.Random;
import java.util.Scanner;

public class onko_karkausvuosi {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna vuosi: ");
        int vuosi = Integer.valueOf(lukija.nextLine());

        if (vuosi % 100 != 0 && vuosi % 4 == 0){
            System.out.println("On karkausvuosi");
        } else if (vuosi % 100 == 0 && vuosi % 4 == 0 && vuosi % 400 == 0){
            System.out.println("On karkausvuosi");
        } else {
            System.out.println("Ei ole karkausvuosi");
        }
    }
}
