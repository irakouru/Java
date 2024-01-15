/*
Kirjoita ohjelma, joka pyytää käyttäjää syöttämään pienen kirjaimen [a-ö]. Ohjelma tulostaa sitten kirjaimen mukaisen pyramidin alla näkyvien esimerkkitulosteiden mukaisesti.

Esimerkkituloste:

Anna pieni kirjain: d
   aa
  baab
 cbaabc
dcbaabcd
 

Toinen esimerkkituloste:

Anna pieni kirjain: p
              aa
             baab
            cbaabc
           dcbaabcd
          edcbaabcde
         gedcbaabcdeg
        hgedcbaabcdegh
       ihgedcbaabcdeghi
      jihgedcbaabcdeghij
     kjihgedcbaabcdeghijk
    lkjihgedcbaabcdeghijkl
   mlkjihgedcbaabcdeghijklm
  nmlkjihgedcbaabcdeghijklmn
 onmlkjihgedcbaabcdeghijklmno
ponmlkjihgedcbaabcdeghijklmnop 
*/

import java.util.Random;
import java.util.Scanner;

public class kirjainpyramidi {
    public static void main(String[] args){
        final Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna pieni kirjain: ");
        String kirjainStringinä = lukija.nextLine(); 
        char kirjain = kirjainStringinä.charAt(0);//Muuta annettu string kirjain characteriksi
        String kirjaimet = "abcdefghijklmnopqrstuvwxyzåäö";

        int kierrokset = kirjain - 'a';
        String tuloste = "";

        for (int i=0; i<=kierrokset; i++) {
            tuloste = Character.toString(kirjaimet.charAt(i)) + tuloste + Character.toString(kirjaimet.charAt(i));
            System.out.println(" ".repeat(kierrokset-i) + tuloste); //+ " ".repeat(kierrokset-i));
        }
    }       
            
                
}
