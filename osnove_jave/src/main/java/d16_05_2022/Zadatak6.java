package d16_05_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        6. (Za vezbanje) Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        Scanner s= new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();
        System.out.print("Unesite treci broj: ");
        int treciBroj = s.nextInt();

        int x = najmanjiBroj(prviBroj, drugiBroj, treciBroj);
        System.out.println("Najmanji broj je: " + x);
    }
    static int najmanjiBroj(int broj1, int broj2, int broj3) {
        if (broj1 < broj2 && broj1 < broj3) {
            return broj1;
        } else if (broj2 < broj1 && broj2 < broj3) {
            return broj2;
        } else {
            return broj3;
        }
    }
}
