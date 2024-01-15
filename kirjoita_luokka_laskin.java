//import java.util.Random;
//import java.lang.reflect.Field;

public class kirjoita_luokka_laskin {
    public static void main(String[] args){
        
        
    }
    class Laskin {
        private int tulos;
        
        public Laskin(int tulos) {
            this.tulos = tulos;
        }
        
        public void lisaa(int luku) {
            this.tulos = tulos + luku;
        }
        public int annaTulos() {
            return tulos;
        }
    }
}