/*
Kirjoita metodi

String siivoa(String sana)

joka palauttaa merkkijonon, jossa parametrina saadusta merkkijonosta on poistettu kaikki muut merkit paitsi isot ja pienet kirjaimet ja välilyönnit.

Esimerkki metodin kutsusta:

public static void main(String[] args){
    String testi = "Moi1234!&%kka";
    String siivottu = siivoa(testi);
    System.out.println(siivottu);
}
Ohjelma tulostaa:
Moikka 
*/

import java.util.Random;

public class siivoa_merkkijono_kaksi {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] s = {
            "a.b.c.",
            "s1213e342k&#/¤(o998i5t4et456t46u3?",
            "a1b2c3d4e5f6g7h8i9j10",
            "!täs\"#sä¤% &/ros()k,.,-an.- s&(#)eas*^**ssa &%on&&& vies¤¤ti"
            
        };
        for (String pa : s) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Siivottuna: " + siivoa(pa));
            System.out.println("");
        }
        
    }
    public static String siivoa(String sana) {
        String siivottu = "";
        String vertailu = "abcdefghijklmnopqrstuvwxyzåäöABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ ";
    
        for (int j=0; j < sana.length(); j++) {
            if (vertailu.contains(Character.toString(sana.charAt(j)))) {
                siivottu = siivottu + Character.toString(sana.charAt(j));
            } else {
                continue;
            }
        }
        return siivottu;
    }
}
