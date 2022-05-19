package p18_05_2022;

import java.util.Scanner;

public class Racun {
    public String broj;
    public String vlasnik;
    public int stanje;

    public static void main(String[] args) {
        Racun prvi = new Racun();
        Racun drugi = new Racun();
        Scanner s = new Scanner(System.in);

        prvi.broj = "840-23932-323";
        prvi.vlasnik = "Bojana Radojkovic";
        prvi.stanje = 100;

        System.out.println("Posiljalac: " + prvi.vlasnik + ", " + prvi.broj
                + ", " + "stanje: " + prvi.stanje);

        drugi.broj = "840-23932-357";
        drugi.vlasnik = "Petar Petrovic";
        drugi.stanje = 300;

        System.out.println("Primalac: " + drugi.vlasnik + ", " + drugi.broj
                + ", " + "stanje: " + drugi.stanje);

        System.out.print("Unesite sumu za transakciju: ");
        int sumaZaTransakciju = s.nextInt();
        prvi.stanje = prvi.stanje - sumaZaTransakciju;
        drugi.stanje = drugi.stanje + sumaZaTransakciju;

        System.out.println("Posiljalac: " + prvi.vlasnik + ", " + prvi.broj
                + ", " + "stanje: " + prvi.stanje);
        System.out.println("Primalac: " + drugi.vlasnik + ", " + drugi.broj
                + ", " + "stanje: " + drugi.stanje);

    }
}
