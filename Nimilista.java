import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Nimilista {
    public static void main(String[] args) {
        final Random r = new Random();
        ArrayList<String> nimilista = new ArrayList<>();
    Scanner lukija = new Scanner(System.in); 

    boolean flag = true;

    while (flag == true) {
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        if (nimi.equals("lopeta")) {
            System.out.println("Nimet: " + nimilista); 
            flag = false;
        } else if (nimilista.contains(nimi)) {
            System.out.println("Nimi on jo annettu");
        } else {
            nimilista.add(nimi);
            System.out.println("Moi, " + nimi);
                }
            }
        }
    }
