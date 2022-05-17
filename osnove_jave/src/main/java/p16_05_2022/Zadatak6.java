package p16_05_2022;

public class Zadatak6 {
    public static void main(String[] args) {

//        6. Zadatak
//        Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *

        zvezdica(5);
    }

    static void zvezdica(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("* ");
        }
    }
}
