package p31_05_2022_2_zadatak;

public class MainPlatnaKartica {
    public static void main(String[] args) {

        VisaKartica v = new VisaKartica(200,
                "21561656",
                2024,
                11,
                "Jovan Jovanovic");

        MasterKartica m = new MasterKartica(250,
                "312424242",
                2023,
                10);

        v.stampa();
        v.izvrsiTransakciju(10);
        v.stampa();
        System.out.println();
        m.stampa();
        m.izvrsiTransakciju(10);
        m.naplatiOdrzavanje();
        m.stampa();

    }
}
