/*
Kirjoita metodi

String lopustaAlkuun(String sana)

joka saa parametrikseen merkkijonon. Metodi muodostaa merkkijonosta käänteisen version, jossa alkuperäisen merkkijonon merkit ovat lopusta alkuun.

Esimerkki metodin kutsumisesta:

public static void main(String[] args) {
    System.out.println(lopustaAlkuun("moi"));
    
    String sana = "Heipparallaa";
    String sana2 = lopustaAlkuun(sana);
    System.out.println(sana2);
}
Ohjelma tulostaa:

iom
aallarappieH 
*/

import java.util.Random;

public class lopusta_alkuun {
    public static void main(String[] args){
        final Random r = new Random();
        
        String[] sanat = "eka auto tomaatti kurkku appelsiini mopo kellari tsukutsuku hippa banaani".split(" ");
        for (String pa: sanat) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println(lopustaAlkuun(pa));
            System.out.println("");
        }
    }

    public static String lopustaAlkuun(String sana) {
        int pituus = sana.length();
        String palaute = "";
        
        for (int i=pituus-1; i >= 0; i--) {
            char kirjain = sana.charAt(i);
            //System.out.println(kirjain);
            String kirjainStringinä = Character.toString(kirjain);
            palaute = palaute + kirjainStringinä;
        }
        
        return palaute;
    }
}
