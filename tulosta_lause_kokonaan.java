/*
Täydennä oheinen ohjelmarunko niin, että se tulostaa kokonaisuudessaan lauseen

Java-ohjelmointi onkin yllättäen aika helppoa.
Huomaa, että ohjelmassa on annettu tulostuslause ennen ja jälkeen kirjoitettavan ohjelman osuuden. 
*/

import java.util.Random;

public class tulosta_lause_kokonaan {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.print("Java-ohjelmointi");
        System.out.print(" onkin yllättäen aika ");
        System.out.println("helppoa.");
    }
}
