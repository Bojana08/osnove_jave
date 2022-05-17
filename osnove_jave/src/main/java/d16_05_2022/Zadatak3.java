package d16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {

//        3. Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        podaciOKorisniku("2634559872", "Petar", "Petrovic", 1956, true);
    }
    static void podaciOKorisniku (String jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);
    }
}
