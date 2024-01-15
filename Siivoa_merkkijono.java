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
import java.util.ArrayList;

public class Siivoa_merkkijono {
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
        ArrayList<String> lista = new ArrayList<String>();
        String siivottu = "";
        for(char c ='A'; c <= 'Z'; c++) {
            String s = Character.toString(c);
            lista.add(s);
        }
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            lista.add(s);
        }
        
        lista.add(" ");
         
        System.out.println(lista);
        for (int i=0; i<sana.length(); i++) {
                if (lista.contains(Character.toString(sana.charAt(i)))) {
                        siivottu = siivottu + Character.toString(sana.charAt(i));
                } else {
                    continue;
                }
            }
  
                
            
        return siivottu;
    }
}


