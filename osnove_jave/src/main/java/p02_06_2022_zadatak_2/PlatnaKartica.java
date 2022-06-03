package p02_06_2022_zadatak_2;

public abstract class PlatnaKartica {
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

    public abstract void izvrsiTransakciju(int vrednost);

    public abstract void stampa();
}

