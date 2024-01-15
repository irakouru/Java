/*
 * Alusta merkkijonotyyppinen lista, jonka arvoina ovat Aleksis Kiven klassikkoromaanin seitsemän veljestä (jos et juuri nyt muista nimiä, Wikipedia auttaa).
 * Listan tulee olla ArrayList-tyyppinen. Viittaus tallennetaan muuttujaan, jonka nimi on veljekset.
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class lista_seitsemasta_veljeksesta {
    public static void main(String[] args){
        final Random r = new Random();
        ArrayList<String> veljekset = new ArrayList<>(List.of("Juhani", "Tuomas", "Aapo", "Simeoni", "Timo", "Lauri", "Eero"));
        
        System.out.println("veljekset on ArrayList: " + (veljekset.getClass() == ArrayList.class));
        
        Collections.sort(veljekset);
        
        System.out.println("Veljekset:");
        veljekset.stream().forEach(v -> System.out.println(v));
}

}
