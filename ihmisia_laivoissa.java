/*
Ohjelmassa on määritelty luokka Laiva. Luokka Matkustajalaiva perii Laiva-luokan. Lisäksi luokka Luksusristeilija perii Matkustajalaiva-luokan.

Laivassa on henkilöstä. Matkustajalaivassa on lisäksi matkustajia. Luksusristeilijässä on näiden lisäksi myös palvelijoita.

Tutustu luokkien tarjoamiin havainnointimetodeihin, ja kirjoita sitten metodi

public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat)
joka saa parametrikseen listan eri tyyppisiä laivoja, ja laskee ja palauttaa kaikkien laivojen kaikkien ihmisten yhteismäärän. Luku sisältää siis henkilöstön, matkustajat ja palvelijat. 
*/

import java.util.Random;
import java.util.ArrayList;

public class ihmisia_laivoissa {
    public static void main(String[] args){
        final Random r = new Random();
        
         ArrayList<Laiva> laivat = new ArrayList<Laiva>();
        for(int i = 0; i < 20; i++){
            int laivanTyyppi = r.nextInt(3);
            switch(laivanTyyppi){
                case 0:
                    laivat.add(new Laiva(r.nextInt(40) + 10));
                    break;
                case 1:
                    laivat.add(new Matkustajalaiva(r.nextInt(40) + 10,r.nextInt(40) + 500));
                    break;
                case 2:
                    laivat.add(new Luksusristeilija(r.nextInt(40) + 10,r.nextInt(40) + 500,r.nextInt(40) + 1000));
                    break;
            }
        }
        
        System.out.println("" + laivat);
        
        System.out.println("Ihmisia laivoissa: " + ihmisiaLaivoissa(laivat));
        
    }

    public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat) {
        int ihmistenLkm = 0;
        for (Laiva laiva : laivat) {
            if (laiva.getClass() == Laiva.class) {
                ihmistenLkm += laiva.getHenkilosto(); //toimii
            } else if (laiva.getClass() == Matkustajalaiva.class) {
                ihmistenLkm += laiva.getHenkilosto(); //toimii
                Matkustajalaiva parempiLaiva = (Matkustajalaiva) laiva;
                ihmistenLkm += parempiLaiva.getMatkustajat();
            } else if (laiva.getClass() == Luksusristeilija.class) {
                ihmistenLkm += laiva.getHenkilosto(); //toimii
                Luksusristeilija parempiParempiLaiva = (Luksusristeilija) laiva;
                ihmistenLkm += parempiParempiLaiva.getMatkustajat();
                ihmistenLkm += parempiParempiLaiva.getPalvelijat();
            }
        }
        return ihmistenLkm; 
    }
    
}

class Laiva{
    
    private int henkilosto;
    
    public Laiva(int henkilosto){
        this.henkilosto = henkilosto;
    }
    
    public int getHenkilosto(){
        return henkilosto;
    }
    
    @Override
    public String toString(){
        return "Laiva (" + henkilosto + ")";
    }
    
}

class Matkustajalaiva extends Laiva{
    
    private int matkustajat;
    
    public Matkustajalaiva(int henkilosto, int matkustajat){
        super(henkilosto);
        this.matkustajat = matkustajat;
    }

    public int getMatkustajat(){
        return this.matkustajat;
    }
    
    @Override
    public String toString(){
        return "Matkustajalaiva (" + (getHenkilosto() + matkustajat) + ")";
    }
}

class Luksusristeilija extends Matkustajalaiva{
    
    private int palvelijat;
    
    public Luksusristeilija(int henkilosto, int matkustajat, int palvelijat){
        super(henkilosto,matkustajat);
        this.palvelijat = palvelijat;
    }

    
    public int getPalvelijat(){
        return this.palvelijat;
    }
    
    public String toString(){
        return "Luksusristeilija (" + (getHenkilosto() + getMatkustajat() + palvelijat) + ")";
    }
}