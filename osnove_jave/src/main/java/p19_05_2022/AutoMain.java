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

        System.out.println();

        Auto audi = new Auto();
        audi.imeIPrezime = "Jovan Jovanovic";
        audi.marka = "Audi";
        audi.brojVrata = 5;
        audi.potrosnja = 10;
        audi.brzina = 5;
        audi.klima = false;
        audi.registracija = "NI158MP";
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

    }
}
