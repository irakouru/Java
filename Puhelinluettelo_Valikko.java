//KOODI EI TOIMI VSCODESSA

/*
Kirjoita metodi

void start()

joka alustaa puhelinluettelossa tarvittavan HashMap-olion ja tulostaa valikon, josa käyttäjä voi valita minkä toiminnon haluaa suoritettavaksi.

Sen jälkeen ohjelma kutsuu joko metodia lisaaNumero,  etsiNumero tai listaa. Metodeita ei tarvitse määritellä, riittää että niitä kutsutaan. Kaikki metodit saavat HashMap-olion paramertrikseen.

Esimerkki ohjelman suorituksesta:

1. Lisää numero
2. Etsi numero
3. Listaa numerot
0. Poistu
Valinta: 1
Nimi: Pekka
Numero: 12345

1. Lisää numero
2. Etsi numero
3. Listaa numerot
0. Poistu
Valinta: 1
Nimi: Jaakko

1. Lisää numero
2. Etsi numero
3. Listaa numerot
0. Poistu
Valinta: 3
Nimi: Jaakko, numero: 54321
Nimi: Pekka, numero: 12345

1. Lisää numero
2. Etsi numero
3. Listaa numerot
0. Poistu
Valinta: 2
Nimi: Pekka
Numero: 12345

1. Lisää numero
2. Etsi numero
3. Listaa numerot
0. Poistu
Valinta: 0 
*/

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Puhelinluettelo_Valikko {
    public static void main(String[] args){
        final Random r = new Random();
        
        //<hide>
        
        String[] s = {"1","Pekka","12345","1","Jaakko","54321", "1", "Maija", "99999", "3", "2", "Pekka", "2", "Jaakko", "0"};
        Scanner.setStream(s);
        start();
    }

    public static void start() {
        HashMap<String, String> luettelo = new HashMap<>();
        Scanner lukija = new Scanner(System.in);
        boolean flag = true;    
    
        while (flag == true) {
            
            
            System.out.println("1. Lisää numero\n2. Etsi numero\n3. Listaa numerot\n0. Poistu");
            System.out.print("Valinta: ");
            int valinta = Integer.valueOf(lukija.nextLine());
            
            
            if (valinta == 1) {
                lisaaNumero(luettelo);
                System.out.println("");
            } else if (valinta == 2) {
                etsiNumero(luettelo);
                System.out.println("");
            } else if (valinta == 3) {
                listaa(luettelo);
                System.out.println("");
            } else if (valinta == 0) {
                flag = false;
            }
        }
    }
}