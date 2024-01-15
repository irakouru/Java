/*
Kirjoita luokka SuperPoikkeus, joka periin luokan Exception.

Luokalla tulee olla konstruktori, joka saa parametrikseen viestin merkkijonona. Konstruktori kutsuu yliluokan vastaavaa konstruktoria ja välittää sille viestin.

Muuta toiminnallisuutta ei tarvita. 
*/

import java.util.Random;

public class omat_poikkeukset_1_Luokka_SuperPoikkeus {
    public static void main(String[] args){
        final Random r = new Random();
        
    }
}

class SuperPoikkeus extends Exception {
    
    public SuperPoikkeus(String viesti){
        super(viesti);
    }
}
