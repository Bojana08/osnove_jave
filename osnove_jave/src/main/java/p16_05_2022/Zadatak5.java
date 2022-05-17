package p16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        5. Zadatak
//        Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        stampajApsolutnuVrednost(broj);
    }

    static void stampajApsolutnuVrednost(int a) {
        if (a >= 0) {
            System.out.println(a);
        } else {
            System.out.println(-a);
        }
    }
}

