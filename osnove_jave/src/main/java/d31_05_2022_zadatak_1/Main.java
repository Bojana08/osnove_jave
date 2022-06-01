package d31_05_2022_zadatak_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

        Igrac igrac = new Igrac("Nemanja Petrovic",
                "424224342",
                1999,
                12,
                "napadac",
                false);

        Igrac igrac1 = new Igrac("Nikola Nikolic",
                "424224342",
                1997,
                8,
                "napadac",
                true);

        Trener trener = new Trener("Petar Jovanovic",
                "213434353",
                1971,
                15,
                "pomocni");

        Trener trener1 = new Trener("Pavle Pavlovic",
                "213434353",
                1970,
                10,
                "pomocni");

        igrac.stampa();
        System.out.println();
        igrac1.stampa();
        System.out.println();
        trener.stampa();
        System.out.println();
        trener1.stampa();
        System.out.println();

    }
}
