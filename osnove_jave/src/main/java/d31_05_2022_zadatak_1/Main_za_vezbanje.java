package d31_05_2022_zadatak_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_za_vezbanje {
    public static void main(String[] args) {

// (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
// Podatke za igrace i trenere unosi korisnik sa tastature.

        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> prviTim = new ArrayList<Igrac>();
        System.out.print("Unesite broj igraca: ");
        int brojIgraca = s.nextInt();
        System.out.println();

        for (int i = 0; i < brojIgraca; i++) {
            System.out.print("Unesite ime igraca: ");
            String punoIme = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja igraca: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Unesite broj koji nosi igrac: ");
            int broj = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Da li je igrac kapiten: ");
            boolean kapiten = s.nextBoolean();
            Igrac jedan = new Igrac(punoIme, jmbg, godinaRodjenja, broj, pozicija, kapiten);
            prviTim.add(jedan);
            System.out.println();
        }

        ArrayList<Trener> treneri = new ArrayList<Trener>();
        System.out.print("Unesite broj trenera: ");
        int brojTrenera = s.nextInt();
        System.out.println();

        for (int i = 0; i < brojTrenera; i++) {
            System.out.print("Unesite ime trenera: ");
            String punoIme = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godineIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tipTrenera = s.next();
            Trener jedan = new Trener(punoIme, jmbg, godinaRodjenja, godineIskustva, tipTrenera);
            treneri.add(jedan);
            System.out.println();
        }

        System.out.println("Igraci: ");
        for (int i = 0; i < prviTim.size(); i++) {
            prviTim.get(i).stampa();
            System.out.println();
        }

        System.out.println("Treneri: ");
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampa();
            System.out.println();
        }

    }
}
