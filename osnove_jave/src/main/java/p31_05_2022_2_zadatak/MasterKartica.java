package p31_05_2022_2_zadatak;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartica) {
        super(suma, brojKartice, godinaVazenjaKartice, mesecVazenjaKartica);
    }

    @Override
    public void izvrsiTransakciju(int vrednost) {
        if (this.suma >= vrednost + 1.5/100 * vrednost) {
            this.suma = this.suma - vrednost - 1.5/100 * vrednost;
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
