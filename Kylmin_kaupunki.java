/* 
Kirjoita metodi

String kylminKaupunki(HashMap<String, Double> lampotilat)

joka saa parametrikseen hajautustaulun, jossa avaimet ovat kaupunkien nimiä ja arvot lämpötiloja. Tehtäväsi on etsiä ja palauttaa sen kaupungin nimi, jonka lämpötila on pienin.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    HashMap<String, Double> lammot = new HashMap<>();
    lammot.put("Turku", 0.5);
    lammot.put("Tampere", -5.25);
    lammot.put("Helsinki", -2.5);

    System.out.println("Kylmin kaupunki: " + kylminKaupunki(lammot));
}
Ohjelma tulostaa:

Kylmin kaupunki: Tampere
*/

import java.util.Random;
import java.util.HashMap;

public class Kylmin_kaupunki {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            String[] kaup = "Turku Helsinki Tampere Rovaniemi Oulu Kajaani Jyväskylä Pori Vaasa".split(" ");
            HashMap<String, Double> lt = new HashMap<>();
            double[] add = {0, 0.25, 0.5, 0.75};
            
            for (String kaupunki : kaup) {
                double l = 25 - r.nextInt(50);
                l += add[r.nextInt(4)];
                
                lt.put(kaupunki, l);
            }
            
            System.out.println("Lämpötilat: ");
            System.out.println("" + lt);
            System.out.println("Kylmin kaupunki: " + kylminKaupunki(lt));
            System.out.println("");
        }
    }
    
    public static String kylminKaupunki(HashMap<String, Double> lampotilat) {
        double kylminLampotila = 10000;
        String kylminKaupunki = null;
        for (String avain : lampotilat.keySet()) {
            if (lampotilat.get(avain) < kylminLampotila) {
                kylminKaupunki = avain;
                kylminLampotila = lampotilat.get(avain);
            }
        }
        return kylminKaupunki;
    }
}
