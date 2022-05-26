package d24_05_2022;

public class Transakcija {

//Kreirati klasu Transakcija koja ima:
//●	id transakcije
//●	racun sa kog se prenose sredstva
//●	racun na koji se prenose sredstva
//●	gettere i settere
//●	konstruktore
//●	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//○	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//○	ako je prenos sredstava veci od 4500, provizija je 1%
//○	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//○	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//●	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//●	metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna
//    Naravno u glavnom kreirati objekte i testirati funkcionalnosti


    private int idTransakcije;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;

    public Transakcija(int idTransakcije, Racun racunSaKogSePrenosi, Racun racunNaKojiSePrenosi) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunSaKogSePrenosi() {
        return racunSaKogSePrenosi;
    }

    public void setRacunSaKogSePrenosi(Racun racunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
    }

    public Racun getRacunNaKojiSePrenosi() {
        return racunNaKojiSePrenosi;
    }

    public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    private double provizija(double vrednostTransakcije) {
        if (vrednostTransakcije < 4500) {
            return 45;
        }
        return vrednostTransakcije * 0.01;
    }

    public void izvrsiTransakciju(double vrednostTransakcije) {
        if (this.racunSaKogSePrenosi.getTrenutnoStanjeRacuna() >= vrednostTransakcije + provizija(vrednostTransakcije)) {
            this.racunSaKogSePrenosi.promenaStanjaNaRacunu(-vrednostTransakcije - provizija(vrednostTransakcije));
            this.racunNaKojiSePrenosi.promenaStanjaNaRacunu(vrednostTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava za izvrsenje transakcije.");
        }
    }

    public void stampa() {
        System.out.println("ID transakcije: " + this.idTransakcije);
        System.out.println("Racun sa: " + this.racunSaKogSePrenosi.getPunoImeOsobe() + " - " +
                this.racunSaKogSePrenosi.getBrRacuna());
        System.out.println("Racun na: " + this.racunNaKojiSePrenosi.getPunoImeOsobe() + " - " +
                this.racunNaKojiSePrenosi.getBrRacuna());
        System.out.println("Racun sa kog s prenosi: " + this.racunSaKogSePrenosi.getTrenutnoStanjeRacuna());
        System.out.println("Racun na koji se prenosi: " + this.racunNaKojiSePrenosi.getTrenutnoStanjeRacuna());
    }
}

