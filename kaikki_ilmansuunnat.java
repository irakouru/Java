/*Kirjoita kaksi enum-luokkaa:

Ilmansuunta ja ValiIlmansuunta

Ilmansuuntia ovat pohjoinen, etelä, itä ja länsi, ja väli-ilmansuuntia koillinen, kaakko, lounas ja luode.

Muista oikea nimeämistapa! */

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class kaikki_ilmansuunnat {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan enum Ilmansuunta...");
        Ilmansuunta[] a = Ilmansuunta.values();
        ArrayList<String> al = Arrays.stream(a).map(s -> s.toString()).collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(al);
        al.stream().forEach(i -> System.out.println(i));
        
        System.out.println("Testataan enum ValiIlmansuunta...");
        ValiIlmansuunta[] va = ValiIlmansuunta.values();
        ArrayList<String> a2 = Arrays.stream(va).map(s -> s.toString()).collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(a2);
        a2.stream().forEach(i -> System.out.println(i));
    }
}

enum Ilmansuunta {
    POHJOINEN, ITA, ETELA, LANSI
}

enum ValiIlmansuunta {
    KOILLINEN, KAAKKO, LOUNAS, LUODE
    
}
