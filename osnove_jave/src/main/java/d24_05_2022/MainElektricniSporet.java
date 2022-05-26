package d24_05_2022;

public class MainElektricniSporet {
    public static void main(String[] args) {

        Ringla jedan = new Ringla("obicna", 1.2);
        Ringla dva = new Ringla("obicna", 1.7);
        Ringla tri = new Ringla("obicna", 1.2);
        Ringla cetiri = new Ringla("obicna", 1.7);

        ElektricniSporet beko = new ElektricniSporet(
                "Beko",
                5,
                3,
                jedan,
                dva,
                tri,
                cetiri);
        beko.pojacaj(2);
        beko.pojacaj(3);
        beko.pojacaj(1);
        beko.pojacaj(3);
        beko.pojacaj(3);
        beko.pojacaj(3);
        beko.stampa();
        System.out.println("Ukupna potrosnja sporeta je: " + beko.ukupnaPotrosnja(1));
        System.out.println();

        ElektricniSporet bosch = new ElektricniSporet(
                "Bosch",
                5,
                2,
                jedan,
                dva,
                tri,
                cetiri);
        bosch.pojacaj(2);
        bosch.pojacaj(3);
        bosch.pojacaj(4);
        bosch.pojacaj(3);
        bosch.pojacaj(3);
        bosch.stampa();
        System.out.println("Ukupna potrosnja sporeta je: " + bosch.ukupnaPotrosnja(1));

    }
}
