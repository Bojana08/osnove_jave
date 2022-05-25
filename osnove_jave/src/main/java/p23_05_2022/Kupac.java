package p23_05_2022;

public class Kupac {

    private String imeIPrezime;
    private Kartica kartica;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }
    public Kupac(){}

    public Kupac(String imeIPrezime, Kartica kartica) {
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + this.imeIPrezime + " - " + this.kartica.getBrojKartice());
    }
}
