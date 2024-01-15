//KOODI EI TOIMI OIKEIN VSCODESSA

/*
Kirjoita alla olevan UML-kaavion mukainen luokka.

Metodien toiminnallisuudella ei ole merkitystä (kunhan koodi kääntyy) - riittää, että kaikki on määritelty kaavion mukaisesti.
*/

import java.util.Random;
import java.lang.reflect.Field;

public class Kirjoita_luokka_UML_kaavion_perusteella {
    public static void main(String[] args){
        
        
    }
}


class Peli {
    private String nimi;
    private int pelaajia;
    
    public Peli(String nimi, int pelaajia) {
        this.nimi = nimi;
        this.pelaajia = pelaajia;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public int getPelaajia() {
        return pelaajia;
    }
    
    public void setPelaajia(int pelaajia) {
        this.pelaajia = pelaajia;
    }
}