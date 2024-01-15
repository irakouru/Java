/*
Kirjoita metodi

String poistaVokaalit(String sana)

joka palauttaa merkkijonon, jossa parametrina saadusta merkkijonosta on poistettu kaikki vokaali (a, e, i, o, u, y ,å, ä ja ö).

Voit olettaa, että sana on kirjoitettu kokonaan pienillä kirjaimilla.

Esimerkki metodin kutsusta:

public static void main(String[] args) {
    String testisana = "tervetuloa!";
    System.out.println(poistaVokaalit(testisana));
}
Ohjelma tulostaa:

trvtl! 
*/

import java.util.Random;

public class poista_vokaalit {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] s = "apea koira kissa rankkuri kulkuneuvo rapsakka hilipalihippan testilöinen".split(" ");
        for (String pa : s) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Ilman vokaaleja: " + poistaVokaalit(pa));
            System.out.println("");
        }
        
    }

    public static String poistaVokaalit(String sana){
        String uusiSana = sana.replaceAll( "[aeiouyäö]", "" );
        
        return uusiSana;
    }
}
