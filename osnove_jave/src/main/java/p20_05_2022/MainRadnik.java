package p20_05_2022;

public class MainRadnik {
    public static void main(String[] args) {

        Radnik k = new Radnik("0920139453");
        System.out.println("JMBG je " + k.jmbg);
        System.out.println();

        Radnik n = new Radnik("08099940329443", "Jovan Jovanovic", 3, 7, 14);
        System.out.println("Ime i prezime zaposlenog: " + n.imeIPrezime);
        System.out.println("JMBG: " + n.jmbg);
        System.out.println("Plata radnika iznosi " + n.plata());
        if (n.kreditnoSposoban()) {
            System.out.println("Zaposleni je kreditno sposoban.");
        } else {
            System.out.println("Zaposleni nije kreditno sposoban.");
        }
        System.out.println("Radnik ima " + n.slobodniDani() + " slobodnih dana.");
    }
}
