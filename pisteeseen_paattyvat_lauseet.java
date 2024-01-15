/*
Kirjoita metodi

public static ArrayList<String> pisteellisetLauseet(ArrayList<String> lauseet)
joka saa parametrikseen listan lauseita merkkijonoina.

Metodi palauttaa uuden listan, joka sisältää alkuperäiseltä listalta ainoastaan ne lauseet, jotka päättyvät pisteeseen.

Käytä ratkaisuun virtaa!
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class pisteeseen_paattyvat_lauseet {
    public static void main(String[] args){
        final Random r = new Random();
        
    
        String[] sub = "Hauki Lahna Ahven Ruusu Horsma Lilja Kani Pupu Jänis Java Python".split(" ");
        String[] ob = "kala kukka kasvi eläin nisäkäs ohjelmointikieli".split(" ");
        
        ArrayList<String> lauseet = new ArrayList<>();
        int m = r.nextInt(6) + 6;
        for (int i=0; i<m; i++) {
            String lause = sub[r.nextInt(sub.length)] + " on " + ob[r.nextInt(ob.length)];
            lause += r.nextInt(2) == 0 ? "." : "";
            lauseet.add(lause);
        }
        
        System.out.println("Lauseet:");
        lauseet.stream().forEach(l -> System.out.println("" + l));
        
        System.out.println("Pisteeseen päättyvät:");
        pisteellisetLauseet(lauseet).stream().forEach(l -> System.out.println(l));
          
    }

    public static ArrayList<String> pisteellisetLauseet(ArrayList<String> lauseet) {
        return lauseet.stream().filter(lause -> paattyyPisteeseen(lause) == true).collect(Collectors.toCollection(ArrayList::new));
    }
    
    public static boolean paattyyPisteeseen(String lause) {
        String viimeinenKirjain = "" + lause.charAt(lause.length()-1);
        if (viimeinenKirjain.equals(".")) {
            return true;
        } else {
            return false;
        }
    }
}
