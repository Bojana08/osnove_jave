package p31_05_2022_2_zadatak;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godinaVazenjaKartice;
    protected int mesecVazenjaKartica;

    public PlatnaKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartica) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenjaKartice = godinaVazenjaKartice;
        this.mesecVazenjaKartica = mesecVazenjaKartica;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVazenjaKartice() {
        return godinaVazenjaKartice;
    }

    public int getMesecVazenjaKartica() {
        return mesecVazenjaKartica;
    }

    public void dodajSredstva(int vrednost) {
        this.suma = this.suma + vrednost;
    }

    public void izvrsiTransakciju(int vrednost) {
        if (this.suma >= vrednost) {
            this.suma = this.suma - vrednost;
        }
    }

    public void stampa() {
        System.out.println(this.brojKartice + ", " + this.mesecVazenjaKartica + "/" + this.godinaVazenjaKartice +
                ", $" + this.suma);
    }
}
