package d03_06_2022;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//        istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Ambalaza sok = new Tetrapak("13234-2323",
                "Sok",
                1000,
                1105,
                false,
                130);

        Ambalaza mleko = new Tetrapak("132342-323",
                "Mleko",
                1000,
                1105,
                true,
                90);

        Ambalaza vino = new StaklenaAmbalaza("13234-2323",
                "Vino",
                1000,
                1105,
                45,
                true,
                415);

        SuperKartica sk = new SuperKartica(1212, "Petar Petrovic", 200);

        sok.cenaArtikla();
        sok.stampa();
        System.out.println();
        mleko.cenaArtikla();
        mleko.stampa();
        System.out.println();
        vino.cenaArtikla();
        vino.stampa();
        System.out.println();

        Korpa korpa = new Korpa();

        korpa.dodajAmbalazu(sok);
        korpa.dodajAmbalazu(vino);
        korpa.dodajAmbalazu(mleko);
        korpa.izbaciAmbalazu("Mleko");


        System.out.println("Ukupna cena korpe sa popustom iznosi: " + korpa.ukupnaCenaKorpe(sk));

    }
}
