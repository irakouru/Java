/*
Kirjoita metodi

double[] uusiTaulukko(ArrayList<Double> lista)

joka saa paramertikseen liukulukuja sisältävän listan. Metodi luo ja palauttaa liukulukutaulukon, jossa on samat alkiot samassa järjestyksessä kuin listassa.

Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    ArrayList<Double> testi = new ArrayList<>();
    testi.add(1.0);
    testi.add(3.0);
    testi.add(2.75);

    double[] taulu = uusiTaulukko(testi);
    System.out.println("Taulukko: " + Arrays.toString(taulu));
}
Ohjelma tulostaa:

Taulukko: [1.0, 3.0, 2.75] 
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Listasta_taulukko {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        double[] des = {0, 0.25, 0.5, 0.75};
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            ArrayList<Double> lista = new ArrayList<>();
            int koko = r.nextInt(5) + 5;
            for (int i=0; i<koko; i++) {
                double alkio = r.nextInt(10) + des[r.nextInt(des.length)];
                lista.add(alkio);
            }
            
            System.out.println("Lista: " + lista);
            double[] taulu = uusiTaulukko(lista);
            System.out.println("Taulukko: " + Arrays.toString(taulu));
            System.out.println("");
        }
    }
    
    public static double[] uusiTaulukko (ArrayList<Double> lista) {
        int pituus = lista.size();
        double[] taulukko = new double[pituus];
        for (int i=0; i<pituus; i++){
            taulukko[i]=lista.get(i);
        }
        return taulukko;
    }
}
