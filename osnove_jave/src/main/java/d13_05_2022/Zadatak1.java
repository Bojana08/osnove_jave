package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//    1.	Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//        Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//        Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod,
//        sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!
//        U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i postavite tekst zadataka
//        u komentaru a zatim commit-ujte promenu i push-ujte na github sa porukom “Domaci 13.05.2022 Zadatak 1”
//        Primer izvrsenja:
//        2,4,6,7,4,
//        4,2,5,1,4,
//        1,4,9,4,5,
//        4,8,5,4,7,
//        4,4,7,4,1,
//        Unesite poziciju: 12
//        Suma je 27

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        niz.add(2);
        niz.add(4);
        niz.add(7);
        niz.add(10);
        niz.add(4);
        niz.add(3);
        niz.add(12);
        niz.add(8);
        niz.add(3);
        niz.add(4);
        niz.add(6);
        niz.add(7);
        niz.add(9);
        niz.add(20);
        niz.add(1);
        niz.add(3);
        niz.add(6);
        niz.add(5);
        niz.add(10);
        niz.add(4);
        niz.add(2);
        niz.add(8);
        niz.add(4);
        niz.add(7);
        niz.add(10);

        int suma = 0;

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }

        System.out.print("Unesite poziciju: ");
        int pozicija = s.nextInt();

        if (pozicija <= niz.size() - 1) {
            if (pozicija == 0) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija + 1) + niz.get(pozicija + 5);
            } else if (pozicija == niz.size() - 1) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija - 5);
            } else if (pozicija == 4) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 5);
            } else if (pozicija == niz.size() - 5) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija + 1) + niz.get(pozicija - 5);
            } else if (pozicija % 5 == 4) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija - 5) + niz.get(pozicija + 5);
            } else if (pozicija % 5 == 0) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija + 1) + niz.get(pozicija - 5) + niz.get(pozicija + 5);
            } else if (pozicija > 0 && pozicija < 4) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 1) + niz.get(pozicija + 5);
            } else if (pozicija < niz.size() - 1 && pozicija > niz.size() - 5) {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 1) + niz.get(pozicija - 5);
            } else {
                suma = suma + niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 1) +
                        niz.get(pozicija - 5) + niz.get(pozicija + 5);
            }
            System.out.println("Suma je " + suma);
        }
    }
}

