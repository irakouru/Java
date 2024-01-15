import java.util.Random;
import java.util.HashMap;
public class Kierrosaikojen_asetus_ja_havainnointi {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan luokkaa...");
        
        double[] kaplus = {0.1, 0.2, 0.3, 0.4, 0.5, 0.75, 0.9, 0.99, 0.999};
        
        HashMap<String, Double> ka = new HashMap<>();
        ka.put("Kake Ruusperi", r.nextInt(10) + 1 + kaplus[r.nextInt(kaplus.length)]);
        ka.put("Häkä Mikkinen", r.nextInt(10) + 1 + kaplus[r.nextInt(kaplus.length)]);
        ka.put("Arto Sennanen", r.nextInt(10) + 1 + kaplus[r.nextInt(kaplus.length)]);
        ka.put("Mika Suutari", r.nextInt(10) + 1 + kaplus[r.nextInt(kaplus.length)]);
        ka.put("Rami Kaikkonen", r.nextInt(10) + 1 + kaplus[r.nextInt(kaplus.length)]);
        
        Tulokset tulokset = new Tulokset("Montsa", new HashMap<>());
        
        System.out.println("Luotiin Tulokset lauseella");
        System.out.println("new Tulokset(\"Montsa\", new HashMap<String, Double>())");
        
        System.out.println("Asetetaan kierrosajoiksi " + ka);
        tulokset.setKierrosAjat(ka);
        System.out.println("Kierrosajat nyt:" + tulokset.getKierrosAjat());
        System.out.println("");
        
        System.out.println("Asetetaan kierrosajoiksi null...");
        tulokset.setKierrosAjat(null);
        System.out.println("Kierrosajat nyt:" + tulokset.getKierrosAjat());
        System.out.println("");
    }
}
class Tulokset {
    private String kilpailu;
    private HashMap<String, Double> kierrosAjat;
    
    public Tulokset(String kilpailu, HashMap<String, Double> kierrosAjat) {
        this.kilpailu = kilpailu;
        this.kierrosAjat = kierrosAjat;
    }

    public String getKilpailu() {
        return kilpailu;
    }

    public void setKilpailu(String kilpailu) {
        this.kilpailu = kilpailu;
    }
    public HashMap<String, Double> getKierrosAjat() {
        
        return kierrosAjat;
    }
    //public void setKierrosajat(HashMap<String, Double> kierrosAjat) {
        //if (kierrosAjat != null) {
        //this.kierrosAjat.put(kierrosAjat);
        //}
    //}
}
