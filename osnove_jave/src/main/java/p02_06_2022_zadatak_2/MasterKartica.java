package p02_06_2022_zadatak_2;

import p31_05_2022_2_zadatak.PlatnaKartica;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartica) {
        super(suma, brojKartice, godinaVazenjaKartice, mesecVazenjaKartica);
    }

    @Override
    public void izvrsiTransakciju(int vrednost) {
        double provizija = 1.5 / 100 * vrednost;
        if (this.suma >= vrednost + provizija) {
            this.suma = this.suma - vrednost - provizija;
        }
        if (provizija < 4) {
            provizija = 4;
        }
    }

    public void naplatiOdrzavanje() {
        if (this.suma >= 2) {
            this.suma = this.suma - 2;
        }
    }

    @Override
    public void stampa() {
        System.out.println("Master Card: " + this.brojKartice + ", " + this.mesecVazenjaKartica + "/" +
                this.godinaVazenjaKartice + ", $" + this.suma);
    }
}
