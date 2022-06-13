import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringVezba {
    public static void main(String[] args) {

       /* Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
        pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese*/

        
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj pesama : ");
        int brojPesama = s.nextInt();
        s.nextLine();
        String imePesme[] = new String[brojPesama];


        for (int i = 0; i < brojPesama; i++) {

            System.out.println("unesite ime pesme " + (i + 1));
            imePesme[i] = s.next();
        }
        for (int i=0; i<brojPesama; i++) {
            System.out.println(imePesme[i]);
        }
    }
}
