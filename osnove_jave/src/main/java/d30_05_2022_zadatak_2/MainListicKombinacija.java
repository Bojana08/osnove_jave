package d30_05_2022_zadatak_2;

public class MainListicKombinacija {
    public static void main(String[] args) {

        Kombinacija jedan = new Kombinacija("205", 1, 2, 3,
                4, 5, 6, 7);
        Kombinacija dva = new Kombinacija("206", 15, 24, 3,
                30, 31, 34, 24);
        Kombinacija tri = new Kombinacija("207", 22, 36, 39,
                28, 7, 6, 13);
        Kombinacija cetiri = new Kombinacija("208", 31, 13, 12,
                4, 35, 22, 7);
        Kombinacija pet = new Kombinacija("209", 26, 5, 34,
                16, 25, 17, 24);
        Kombinacija sest = new Kombinacija("210", 32, 34, 33,
                4, 5, 32, 16);
        Kombinacija sedam = new Kombinacija("211", 33, 27, 87,
                25, 15, 6, 7);
        Kombinacija izvucena = new Kombinacija("000", 32, 34, 33,
                4, 5, 32, 16);
        Kombinacija izvucenaDruga = new Kombinacija("001", 32, 1, 33,
                4, 5, 32, 16);

        Listic listic = new Listic();

        listic.dodajKombinaciju(jedan);
        listic.dodajKombinaciju(dva);
        listic.dodajKombinaciju(tri);
        listic.dodajKombinaciju(cetiri);
        listic.dodajKombinaciju(pet);
        listic.dodajKombinaciju(sest);
        listic.dodajKombinaciju(sedam);

        listic.daLiJeKombinacijaDobitna(izvucenaDruga);
        listic.stampa();

    }
}
