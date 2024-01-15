import java.util.Random;
public class Laske_tuotteet_yhteen{
    public static void main(String[] args){
        final Random r = new Random();
        
        
         String[] tuotteet = {"Mustikka", "Mansikka", "Vadelma", "Viinirypäle",
                "Puolukka", "Karpalo", "Viinimarja"};
        
        for (int testi=0; testi<3; testi++) {
            String t1 = tuotteet[r.nextInt(tuotteet.length)];
            String t2 = t1;
            while (t1.equals(t2)) {
                t2 = tuotteet[r.nextInt(tuotteet.length)];
            }
            
            Tuote tuote1 = new Tuote(t1, r.nextInt(20) + 1);
            Tuote tuote2 = new Tuote(t2, r.nextInt(20) + 1);
            
            System.out.println("Tuote 1: " + tuote1);
            System.out.println("Tuote 2: " + tuote2);
            
            Tuote tuote3 = laskeYhteen(tuote1, tuote2);
            System.out.println("Yhteenlaskettu nimi: " + tuote3.getNimi());
            System.out.println("Yhteenlaskettu määrä: " + tuote3.getMaara());
            System.out.println("");
            
        }
    public static Tuote laskeYhteen(Tuote tuote1, Tuote tuote2) {
    
    String uusiTuote = tuote1.getNimi() + " ja " + tuote2.getNimi();
    int uusiMaara = tuote1.getmaara() + tuote2.getmaara();
    Tuote uusTuote = new Tuote(uusiTuote, uusiMaara);
    
    return uusTuote;
}

    
}
class Tuote {
    private String nimi;
    private int maara;
    
    public Tuote(String nimi, int maara) {
        this.nimi = nimi;
        this.maara = maara;
    }

    public String getNimi() {
        return nimi;
    }

    public int getMaara() {
        return maara;
    }

    @Override
    public String toString() {
        return "Tuote (nimi=" + nimi + ", maara=" + maara + ")";
    }  
}
}
