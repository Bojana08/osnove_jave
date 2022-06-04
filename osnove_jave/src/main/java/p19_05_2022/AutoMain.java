package p19_05_2022;

public class AutoMain {
    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.imeIPrezime = "Petar Petrovic";
        bmw.marka = "BMW";
        bmw.brojVrata = 5;
        bmw.potrosnja = 10;
        bmw.brzina = 200;
        bmw.klima = true;
        bmw.registracija = "NI109KL";
        bmw.godinaProizvodnje = 2008;
        bmw.mesecRegistracije = 8;
        bmw.kubikaza = 1600;
        bmw.kapacitetRezervoara = 58;
        bmw.kolicinaGorivaURezervoaru = 31;
        bmw.stampaj();
        boolean x = bmw.prekoracenjeBrzine(50);
        if (x) {
            System.out.println("Prekoracili ste brzinu.");
        } else {
            System.out.println("Nema prekoracenja.");
        }
        int y = bmw.visinaNovcaneKazne(50);
        System.out.println("Kazna je: " + y);
        bmw.dodajGas();
        double trenutnaPotrosnja = bmw.trenutnaPotrosnja();
        System.out.println("Trenutna brzina je: " + bmw.brzina + " km/h");
        System.out.println("Trenutna potrosnja je: " + trenutnaPotrosnja);
        bmw.autoJeOldTimer();
        if (bmw.autoJeOldTimer()) {
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }
        bmw.registracijaJeIstekla(5);
        if (bmw.registracijaJeIstekla(5)) {
            System.out.println("Registracija je istekla.");
        } else {
            System.out.println("Nije istekla registracija.");
        }
        double cenaRegistracije = bmw.cenaRegistracije();
        System.out.println("Cena registracije je: " + cenaRegistracije);
        bmw.natociGorivo(15);
        System.out.println(bmw.natociGorivo(15));


        System.out.println();

        Auto audi = new Auto();
        audi.imeIPrezime = "Jovan Jovanovic";
        audi.marka = "Audi";
        audi.brojVrata = 5;
        audi.potrosnja = 10;
        audi.brzina = 255;
        audi.klima = false;
        audi.registracija = "NI158MP";
        audi.godinaProizvodnje = 2016;
        audi.mesecRegistracije = 3;
        audi.kubikaza = 2000;
        audi.stampaj();
        x = audi.prekoracenjeBrzine(50);
        if (x) {
            System.out.println("Prekoracili ste brzinu.");
        } else {
            System.out.println("Nema prekoracenja.");
        }
        y = audi.visinaNovcaneKazne(50);
        System.out.println("Kazna je: " + y);
        audi.smanjiGas();
        trenutnaPotrosnja = audi.trenutnaPotrosnja();
        System.out.println("Trenutna brzina je: " + audi.brzina + " km/h");
        System.out.println("Trenutna potrosnja je: " + trenutnaPotrosnja);
        audi.autoJeOldTimer();
        if (audi.autoJeOldTimer()) {
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }
        audi.registracijaJeIstekla(5);
        if (audi.registracijaJeIstekla(5)) {
            System.out.println("Registracija je istekla.");
        } else {
            System.out.println("Nije istekla registracija.");
        }
        cenaRegistracije = audi.cenaRegistracije();
        System.out.println("Cena registracije je: " + cenaRegistracije);
        if (audi.brzinaAuta(bmw)) {
            System.out.println("Brzina je ista.");
        } else {
            System.out.println("Brzina nije ista.");
        }


    }
}
