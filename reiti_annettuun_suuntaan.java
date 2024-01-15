/*
Ohjelmassa on määritelty edellisessä tehtävässä kirjoitettu luokka Reitti.

Kirjoita metodi

public static ArrayList<Reitti> reititSuuntaan(ArrayList<Reitti> reitit, Ilmansuunta suunta)
joka saa parametrikseen listan reittiolioita ja suunnan.

Metodi palauttaa uudessa listassa ne reitit, jotka kulkevat annettuun suuntaan.

Reittien järjestyksen uudessa listassa tulee olla sama kuin parametrina annetussa listassa. 
*/

import java.util.ArrayList;
import java.util.Random;

public class reiti_annettuun_suuntaan {
    public static void main(String[] args){
        final Random r = new Random();
        
   
        ArrayList<Reitti> al = new ArrayList<>();
        int maara = r.nextInt(5) + 10;
        
        for (int i=0; i<maara; i++) {
            double pituus = r.nextInt(200) + 10;
            Ilmansuunta suunta = Ilmansuunta.values()[r.nextInt(4)];
            al.add(new Reitti(pituus, suunta));
        }
        
        System.out.println("Kaikki reitit:");
        al.stream().forEach(rt -> System.out.println("" + rt));

        for (Ilmansuunta suunta : Ilmansuunta.values()) {
            System.out.println("<ingore>");
            System.out.println("Reitit suuntaan " + suunta);
            
            ArrayList<Reitti> al2 = reititSuuntaan(al, suunta);
            al2.stream().forEach(rt -> System.out.println("" + rt));
        }        
    }


    public static ArrayList<Reitti> reititSuuntaan(ArrayList<Reitti> reitit, Ilmansuunta suunta) {
        ArrayList<Reitti> samaSuunta = new ArrayList<>();
        for (Reitti reitti : reitit) {
            if (reitti.getSuunta() == suunta) {
                samaSuunta.add(reitti);
            }
        }
        return samaSuunta;
    }
}