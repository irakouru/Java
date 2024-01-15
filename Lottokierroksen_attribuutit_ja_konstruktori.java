import java.util.Random;
import java.util.ArrayList;
public class Lottokierroksen_attribuutit_ja_konstruktori {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        ArrayList<Integer> nrot = new ArrayList<>();
        for (int i=0; i<7; i++) {
            nrot.add(r.nextInt(39) + 1);
        }
        
        int kierros = r.nextInt(52) + 1;
        
        double potti = r.nextInt(5000000) + 1000000;
        
        System.out.println("Luodaan olio parametreilla");
        System.out.println("Kierros: " + kierros);
        System.out.println("Numerot: " + nrot);
        System.out.println("Potti: " + potti);
        
        Lottokierros lk = new Lottokierros(kierros, nrot, potti);
        System.out.println("Olio: " + lk);
    }
}
class Lottokierros {
    int viikko;
ArrayList<Integer> numerot;
double voittopotti;

    public Lottokierros(int viikko, ArrayList<Integer> numerot, double voittopotti) {
        this.viikko = viikko;
        this.numerot = numerot;
        this.voittopotti = voittopotti;
    }

@Override
public String toString() {
    return "Lottokierros [viikko=" + viikko + ", numerot=" + numerot + ", voittopotti=" + voittopotti + "]";
}  
}

