package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        3.	Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//        a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja
//        ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        niz.add(3);
        niz.add(5);
        niz.add(8);
        niz.add(4);
        niz.add(6);
        niz.add(2);
        niz.add(1);
        niz.add(9);
        niz.add(7);
        niz.add(5);

        System.out.print("Niz je: ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + " ");
        }

        System.out.println();
        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();

        if (pozicija > niz.size() - 1 || pozicija < 0) {
            System.out.println("Uneli ste nevalidnu poziciju!");
        } else {
            niz.remove(pozicija);
            for (int i = 0; i < niz.size(); i++) {
                System.out.print(niz.get(i) + " ");
            }
        }
    }
}
