/*Kirjoita luokka SalainenAgentti, jolla on seuraavat ominaisuudet:

Konstruktori, joka saa parametrikseen nimen (merkkijono) ja koodin (merkkijono)
Havainnointimetodit getNimi ja getKoodi
Asetusmetodi setKoodi(String koodi), joka asettaa koodiattribuutin, jos annettu parametri on sääntöjen mukainen (säännöt alempana); muuten koodiksi asetetaan "000"
Staattinen metodi static boolean koodiOk(String koodi), joka palauttaa true, jos koodi on sääntöjen mukainen
Koodi on sääntöjen mukainen, jos siinä on tasan kolme numeroa, eikä muita merkkejä. Kahden ensimmäisen numeron pitää olla nollia. 
*/

import java.util.Random;

public class luokka_SalainenAgentti {
    public static void main(String[] args){
        final Random r = new Random();
        

        System.out.println("Testataan luokkaa SalainenAgentti...");
        
        String[] en = "James Jane John Jill Jim Janet Joakim Juuso Jaana Jutta".split(" ");
        String[] sn = "Bond Pond Pöntinen Ponttooni Band Bonjovi Blond".split(" ");
        String[] k = "500 505 040 00A 00X XYZ X0X 700 777 0X0X 0007 0003 0070".split(" ");
        
        for (int testi = 1; testi <=2; testi++) {
            System.out.println("Testi " + testi);
            
            String nimi = en[r.nextInt(en.length)] + " " + sn[r.nextInt(sn.length)];
            String koodi = "00" + (r.nextInt(9) + 1);
            SalainenAgentti sa = new SalainenAgentti(nimi, koodi);
            
            System.out.println("Olio luotu parametreilla (" + nimi + ", " + koodi + ")");
            
            System.out.println("getNimi() palauttaa " + sa.getNimi());
            System.out.println("getKoodi() palauttaa " + sa.getKoodi());
            
            System.out.println("Kokeillaan vaihtaa koodi sallituksi...");
            
            for (int toisto=1; toisto<= 2; toisto++) {
                koodi = "00" + (r.nextInt(9) + 1);
                System.out.println("Kokeillaan koodilla " + koodi);
                sa.setKoodi(koodi);
                System.out.println("getKoodi() palauttaa " + sa.getKoodi());
            }
            
            System.out.println("Kokeillaan vaihtaa koodi kielletyksi...");
 
            koodi = k[r.nextInt(k.length)];
            System.out.println("Kokeillaan koodilla " + koodi);
            sa.setKoodi(koodi);
            System.out.println("getKoodi() palauttaa " + sa.getKoodi());
        }
        
        System.out.println("Testi 3: staattisen metodin kutsu");
        String[] koodit = "007 004 003 008 0009 070 00A 600 888".split(" ");
        for (String koodi : koodit) {
            System.out.println("Testaan koodia " + koodi + ", kelpaa: " + SalainenAgentti.koodiOk(koodi));
        }
        
    }
}

class SalainenAgentti {
    private String nimi;
    private String koodi;
    
    public SalainenAgentti(String nimi, String koodi) {
        this.nimi = nimi;
        this.koodi = koodi;
    }
    
    public void setKoodi(String koodi) {
        if (SalainenAgentti.koodiOk(koodi) == true) {
            this.koodi = koodi;
        } else {
            this.koodi = "000";
        }
    }
    
    public static boolean koodiOk(String koodi) {
        String numerot = "0123456789";
        boolean flag = true;
        if (koodi.length() == 3) {
            if (Character.toString(koodi.charAt(0)).equals("0") && Character.toString(koodi.charAt(1)).equals("0")) {
                if (numerot.contains(Character.toString(koodi.charAt(2)))){
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getKoodi() {
        return this.koodi;
    }
    
}
