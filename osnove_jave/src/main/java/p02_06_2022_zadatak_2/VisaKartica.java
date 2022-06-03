package p02_06_2022_zadatak_2;

public class VisaKartica extends PlatnaKartica {
    private String osobaKojaImaOvlascenje;

    public VisaKartica(int suma, String brojKartice,
                       int godinaVazenjaKartice,
                       int mesecVazenjaKartica,
                       String osobaKojaImaOvlascenje) {
        super(suma, brojKartice, godinaVazenjaKartice, mesecVazenjaKartica);
        this.osobaKojaImaOvlascenje = osobaKojaImaOvlascenje;
    }

    public String getOsobaKojaImaOvlascenje() {
        return osobaKojaImaOvlascenje;
    }

    public void setOsobaKojaImaOvlascenje(String osobaKojaImaOvlascenje) {
        this.osobaKojaImaOvlascenje = osobaKojaImaOvlascenje;
    }

    @Override
    public void izvrsiTransakciju(int vrednost) {
        double provizija = 1.8 / 100 * vrednost;
        if (this.suma >= vrednost + provizija) {
            this.suma = this.suma - vrednost - provizija;
        }
        if (provizija < 4) {
            provizija = 4;
        }
    }

    @Override
    public void stampa() {
        System.out.println("Visa Card: " + this.brojKartice + ", " + this.mesecVazenjaKartica +
                "/" + this.godinaVazenjaKartice + ", $" + this.suma);
    }

}
