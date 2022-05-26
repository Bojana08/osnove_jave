package d24_05_2022;

public class Racun {

//2.	Zadatak
//    Kreirati klasu Racun koja ima:
//●	broj racuna (npr: 170-289328923-23)
//●	ime i prezime osobe
//●	trenutno stanje na racunu (npr: 100, 1220)
//●	gettere i setter za sve atribute, sem settera za stanje na racunu
//●	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//●	metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    private String brRacuna;
    private String punoImeOsobe;
    private double trenutnoStanjeRacuna;

    public Racun(String brRacuna, String punoImeOsobe, double trenutnoStanjeRacuna) {
        this.brRacuna = brRacuna;
        this.punoImeOsobe = punoImeOsobe;
        this.trenutnoStanjeRacuna = trenutnoStanjeRacuna;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getPunoImeOsobe() {
        return punoImeOsobe;
    }

    public void setPunoImeOsobe(String punoImeOsobe) {
        this.punoImeOsobe = punoImeOsobe;
    }

    public double getTrenutnoStanjeRacuna() {
        return trenutnoStanjeRacuna;
    }

    public void promenaStanjaNaRacunu(double vrednost) {
        this.trenutnoStanjeRacuna = this.trenutnoStanjeRacuna + vrednost;
    }

    public void stampa() {
        System.out.println(this.punoImeOsobe + " - " + this.brRacuna);
        System.out.println("Stanje na racunu je " + this.trenutnoStanjeRacuna + "RSD");
    }
}
