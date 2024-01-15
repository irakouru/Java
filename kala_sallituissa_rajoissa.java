/*
Olipa kerran kalastuskilpailu. Luokassa KalaMitat on määritelty kilpailussa sallittujen kalojen minimi- ja maksimipituus ja -paino luokkamuuttujina.

Luokka Kala mallintaa yhtä kalaa. Luokalla on attribuutit pituus ja paino.

Kirjoita luokkaan Kala julkinen metodi  
 
public boolean sallittu()
 
joka palauttaa arvon true tai false sen mukaan, onko kyseinen Kala-olio kilpailuissa sallituissa rajoissa.
*/

import java.util.Random;

public class kala_sallituissa_rajoissa {
    public static void main(String[] args){
        final Random rnd = new Random();
                
                
                System.out.println("Testataan metodia sallittu...");
                
                for (int i=0; i<10; i++){
                    Kala kala = new Kala(rnd.nextInt(80) + 10, rnd.nextInt(7) + rnd.nextDouble());
                    System.out.println("" + kala);
                    System.out.println(kala.sallittu() ? "Sallittu" : "Ei sallittu");
                }
                
            }
        }
        
    class KalaMitat{
        public static final int MINIMIPITUUS = 25;
        public static final int MAKSIMIPITUUS = 75;
        public static final double MINIMIPAINO = 1.0;
        public static final double MAKSIMIPAINO = 5.0;
    }

    class Kala{
        private int pituus;
        private double paino;
            
        public Kala(int pituus, double paino){
            this.pituus = pituus;
            this.paino = paino;
        }

        public boolean sallittu() {
            boolean sallittu = true;
            if ((this.pituus > KalaMitat.MINIMIPITUUS && this.pituus < KalaMitat.MAKSIMIPITUUS) && (this.paino > KalaMitat.MINIMIPAINO && this.paino < KalaMitat.MAKSIMIPAINO)) {
                sallittu = true;
            } else {
                sallittu = false;
            }
            return sallittu;
        }

        public String toString(){
        return "Pituus:" + pituus + ", paino:" + paino;
    }

}
    