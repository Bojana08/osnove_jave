package d24_05_2022;

public class MainRacunTransakcija {
    public static void main(String[] args) {


        Racun s = new Racun("170-289328923-23", "Bojana Radojkovic", 55000);
        Racun d = new Racun("415-244894623-93", "Jovan Nikolic", 0);

        Transakcija t = new Transakcija(4569, s, d);

        t.izvrsiTransakciju(5000);
        t.stampa();
        System.out.println();

        t.izvrsiTransakciju(100);
        t.stampa();
        System.out.println();

        t.izvrsiTransakciju(1610);
        t.stampa();
    }
}