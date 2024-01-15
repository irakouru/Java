//KOODI EI TOIMI OIKEIN VSCODESSA

/*
Alla olevassa UML-kaaviossa on määritelty luokkahierarkia.

Toteuta luokat kaavion mukaisesti. Metodien toiminnallisuutta ei testata, määrittelyt ovat tärkeitä.

Koodin pitää kuitenkin kääntyä.
*/

import java.util.Random;
import java.lang.reflect.Field;

public class toteuta_luokkahierarkia {
    public static void main(String[] args){
        final Random r = new Random();
        
    }
}

interface Laskin {
    double getTulos();
    
}

class Laskukone implements Laskin {
    private double tulos;
    
    public Laskukone(double tulos) {
        this.tulos = tulos;
    }
    
    @Override
    public double getTulos() {
        return tulos;
    }
    
    public void laske(String operaatio, double parametri) {
        
    }
}

