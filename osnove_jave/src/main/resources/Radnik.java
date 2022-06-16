package p20_05_2022;

public class Radnik {
    String jmbg;
    String radnik;
    int brojDece;
    int strucnaSprema;
    int radniStaz;

    Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    Radnik(String jmbg, String radnik, int brojDece, int strucnaSprema, int radniStaz) {
        this.jmbg = jmbg;
        this.radnik = radnik;
        this.brojDece = brojDece;
        this.strucnaSprema = strucnaSprema;
        this.radniStaz = radniStaz;
    }

    public double minuliRad() {
        if (radniStaz < 10) {
            return radniStaz * 0.05;
        } else if (radniStaz < 20) {
            return radniStaz * 0.075;
        }
        return radniStaz * 0.1;
    }

    public double koeficijentSlozenosti() {
        if (strucnaSprema == 1) {
            return 1.03;
        }
        if (strucnaSprema == 2) {
            return 1.65;
        }
        if (strucnaSprema == 3) {
            return 2.00;
        }
        if (strucnaSprema == 4) {
            return 2.27;
        }
        if (strucnaSprema == 5) {
            return 2.88;
        }
        if (strucnaSprema == 6) {
            return 3.09;
        }
        if (strucnaSprema == 7) {
            return 3.40;
        }
        return 4.12;
    }

    public double plata() {
        return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
    }

    public boolean kreditnoSposoban() {
        return plata() > 50000;
    }

    public int slobodniDani() {
        return 22 + 2 * this.brojDece;
    }

}
