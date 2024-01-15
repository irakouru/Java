/*Ohjelmassa on määritelty geneerinen rajapintaluokka Vaihtaja.

Kirjoita rajapinnan toteuttava luokka MerkkijonoVaihtaja, joka sitoo geneerisen tyypin merkkijonoksi (eli luokka MerkkijonoVaihtaja ei ole geneerisesti määritelty).

MerkkijonoVaihtajasta luotu oli toimii niin, että se pitää sisällää aina vain yhden merkkijonoarvon kerrallaan. Luokalla tulee olla

Konstruktori, joka saa parametrikseen merkkijonon
Toteutus metodille vaihdaArvo: metodi palauttaa vaihtajan nykyisen arvon ja tallentaa sen tilalle parametrina tulleen uuden arvon.
Esimerkki luokan käytöstä:

public static void main(String[] args) {
    MerkkijonoVaihtaja vaihtaja = new MerkkijonoVaihtaja("moi");
    
    System.out.println(vaihtaja.vaihdaArvo("heippa"));
    System.out.println(vaihtaja.vaihdaArvo("heipparallaa"));
    System.out.println(vaihtaja.vaihdaArvo("terve nyt sitten"));
}
Ohjelma tulostaa:

moi
heippa
heipparallaa
  */

import java.util.Random;

public class toteuta_luokka_MerkkijonoVaihtaja {
    public static void main(String[] args){
        final Random r = new Random();
        
         System.out.println("Testataan luokkaa MerkkijonoVaihtaja...");
        
        String[] jonot = "kettu susi possu hiiri ankka lehmä".split(" ");
        String[] j2 = "hamsteri marsu gerbiili kirahvi norsu".split(" ");
        
        String arvo = j2[r.nextInt(j2.length)];
        System.out.println("Luodaan olio parametrilla " + arvo);
        
        
        Vaihtaja<String> vaihtaja = new MerkkijonoVaihtaja(arvo);
        System.out.println("Olio luotu!");
        
        for (String jono : jonot) {
            System.out.println("Vaihdetaan arvoksi " + jono);
            arvo = vaihtaja.vaihdaArvo(jono);
            System.out.println("Olio palautti aikaisemman arvon " + arvo);
        }
    }
}

interface Vaihtaja<T> {
    T vaihdaArvo(T arvo);
}

class MerkkijonoVaihtaja implements Vaihtaja<String> {
    private String merkkijono;
    
    public MerkkijonoVaihtaja(String merkkijono) {
        this.merkkijono = merkkijono;
    }
    
    public String vaihdaArvo(String uusiMerkkijono) {
        String temp = merkkijono;
        this.merkkijono = uusiMerkkijono;
        return temp;
    }
    
}


