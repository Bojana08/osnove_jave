package p31_05_2022_2_zadatak;

public class VisaKartica extends PlatnaKartica{
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
        if (this.suma >= vrednost + 1.8/100 * vrednost) {
            this.suma = this.suma - vrednost - (1.8/100 * vrednost);
        }
    }

    @Override
    public void stampa() {
        System.out.println("Visa Card: " + this.brojKartice + ", " + this.mesecVazenjaKartica +
                "/" + this.godinaVazenjaKartice + ", $" + this.suma);
    }

}
