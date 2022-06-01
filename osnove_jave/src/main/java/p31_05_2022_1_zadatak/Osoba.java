package p31_05_2022_1_zadatak;

public class Osoba {
    protected String punoIme;
    protected String jmbg;

    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void stampa() {
        System.out.println(this.punoIme + ", " + this.jmbg);
    }
}
