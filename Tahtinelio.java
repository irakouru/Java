/*
Kirjoita metodi

StringBuilder nelio(int sivunPituus)

joka palauttaa yhdessä StringBuilder-merkkijonossa tähdistä (eli asteriskeista) koostuvan neliön.

Rivinvaihdon voit tehdä merkkijonon sisällä merkillä "\n", esim.

System.out.println("aaa\nbbb");
tulostaa

aaa
bbb
Esimerkki metodin kutsumisesta:

public static void main(String[] args){
    System.out.println(nelio(3));
    System.out.println();

    StringBuilder isompiNelio = nelio(6);
    System.out.println(isompiNelio);
}
Ohjelma tulostaa:

***
***
***

******
******
******
******
******
******

*/

import java.util.Random;

public class Tahtinelio {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[] p = {2,4,6,3};
        for (int pa : p) {
            System.out.println("Testataan parametrilla " + pa);
            StringBuilder nelio = nelio(pa);
            
            if (nelio.charAt(nelio.length() -1) == '\n') {
                nelio.deleteCharAt(nelio.length() -1);
            }
            System.out.println(nelio);
            System.out.println("");
        }
    }
    
    public static StringBuilder nelio(int sivunPituus) {
        StringBuilder kuvio = new StringBuilder();
        for (int i= 0; i < sivunPituus; i++) {
            kuvio.append("*".repeat(sivunPituus) + "\n");
        }
    return kuvio;
    }

}
