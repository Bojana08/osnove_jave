package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSastojak {
    public static void main(String[] args) {

//  3. Zadatak
//   Kreirati klasu Sastojak koja ima:
//●	naziv sastojka
//●	cenu
//●	gettere i settere
//●	konstuktore
// --U glavnom programu kreirati 3 sastojka.
//  U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju
//  odstampati niz. Koristeci ArrayList-e

        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> niz = new ArrayList<Sastojak>();

        System.out.print("Unesite broj sastojaka: ");
        int brSastojaka = s.nextInt();
        for (int i = 0; i < brSastojaka; i++) {
            System.out.print("Unesite sastojak: ");
            String sastojak = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();
            Sastojak jedan = new Sastojak(sastojak, cena);
            niz.add(jedan);
        }

        for (int i = 0; i < niz.size(); i++) {
            System.out.println(niz.get(i).getNaziv() + ", " + niz.get(i).getCena());
        }
    }
}
