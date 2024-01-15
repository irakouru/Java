/*
Ohjelmassa on määritelty luokka Kirja. Luokasta voidaan muodostaa olio antamalla sille nimi ja kirjailija seuraavasti:

Kirja k = new Kirja("Vanhus ja Meri", "Ernest Hemingway");
Kirjoita  luokka Lopputyo, joka perii luokan Kirja.

Luokalla on seuraavat piirteet:

Konstruktori, joka saa parametriksi nimen, kirjailijan ja arvosanan (kokonaisluku). Konstruktori  asettaa nimen ja kirjailijan kutsumalla yliluokan konstruktoria. Arvosana on Lopputyo-luokan attribuutti
Asetus- ja havainnointimetodit arvosanalle. 
*/

import java.util.Random;

public class lopputyo_perii_kirjan {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] kir = {"Olli Opiskelija", "Hilma Hikipinko", "Keijo Keskinkertainen",
                "Outi Oivallinen", "Arto Alisuorittaja"};
        
        String[] nimet = {"Gradu", "Kandityö", "DI-työ"};
        
        for (int testi=1; testi<=3; testi++) {
            String kirjailija = kir[r.nextInt(kir.length)];
            String nimi = nimet[r.nextInt(nimet.length)];
            
            Lopputyo lt = new Lopputyo(nimi, kirjailija, r.nextInt(5) + 1);
            System.out.println("Lopputyöolio muodostettu!");
            Kirja k = (Kirja) lt;
            System.out.println("Kirjailija: " + k.getKirjailija());
            System.out.println("Nimi: " + k.getNimi());
            System.out.println("Arvosana:" + lt.getArvosana());
            System.out.println("Vaihdetaan arvosana...");
            if (r.nextInt(2) == 0) {
                lt.setArvosana(lt.getArvosana() - 1);
            } else {
                lt.setArvosana(lt.getArvosana() + 1);
            }
            System.out.println("Arvosana:" + lt.getArvosana());
            System.out.println("");
            
        }
    }
}
class Kirja {
    private String nimi;
    private String kirjailija;
    
    public Kirja(String nimi, String kirjailija) {
        this.nimi = nimi;
        this.kirjailija = kirjailija;
    }
      
    public String getNimi() {
        return nimi;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String getKirjailija() {
        return kirjailija;
    }
    
    public void setKirjailija(String kirjailija) {
        this.kirjailija = kirjailija;
    }   
}

class Lopputyo extends Kirja {
    private int arvosana;
    
    public Lopputyo(String nimi, String kirjailija, int arvosana) {
        super(nimi, kirjailija);
        this.arvosana = arvosana;
    }
    
    
    public int getArvosana() {
        return arvosana;
    }
    
    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }
}
