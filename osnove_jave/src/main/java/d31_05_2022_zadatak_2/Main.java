package d31_05_2022_zadatak_2;

public class Main {
    public static void main(String[] args) {

//    U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        Igrac i = new Igrac("Nikola Nikolic",
                "10129993232",
                1999,
                12,
                "napadac",
                true);

        Karton crveni = new Karton("Crveni");
        Karton zuti = new Karton("Zuti");

        i.dodajKarton(crveni);
        i.dodajKarton(crveni);
        i.dodajKarton(zuti);
        i.dodajKarton(zuti);
        i.dodajKarton(zuti);
        i.dodajKarton(crveni);
        i.brojZutihKartona();
        i.brojCrvenihKartona();

        i.stampa();

    }
}
