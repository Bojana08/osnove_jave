package p20_05_2022;

public class Radnik {
    public String jmbg;
    public String imeIPrezime;
    public int brojDece;
    public int sss;
    public int godRadnogStaza;

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int sss, int godRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.sss = sss;
        this.godRadnogStaza = godRadnogStaza;
    }

    public double minuliRad() {
        if (this.godRadnogStaza < 10) {
            return 0.05;
        } else if (this.godRadnogStaza < 20) {
            return 0.075;
        } else {
            return 0.1;
        }
    }

    public double koeficijentSlozenosti() {
        if (this.sss == 1) {
            return 1.03;
        }
        if (this.sss == 2) {
            return 1.65;
        }
        if (this.sss == 3) {
            return 2.00;
        }
        if (this.sss == 4) {
            return 2.27;
        }
        if (this.sss == 5) {
            return 2.88;
        }
        if (this.sss == 6) {
            return 3.09;
        }
        if (this.sss == 7) {
            return 3.40;
        }
        if (this.sss == 8) {
            return 4.12;
        }
        return 0;
    }

    public double plata() {
        return 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
    }

    public boolean kreditnoSposoban() {
        if (this.plata() > 50000) {
            return true;
        }
        return false;
    }

    public int slobodniDani() {
        return 22 + this.brojDece * 2;
    }

}
