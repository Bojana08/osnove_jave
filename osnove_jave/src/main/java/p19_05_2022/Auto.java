package p19_05_2022;

public class Auto {
    public String imeIPrezime;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public int brzina;
    public String registracija;
    public boolean klima;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikaza;
    public int kapacitetRezervoara;
    public int kolicinaGorivaURezervoaru;


    public void stampaj() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + " km/h je trenutna brzina");
    }

    public boolean prekoracenjeBrzine(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int visinaNovcaneKazne(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return (this.brzina - ogranicenje) * 1000;
        } else {
            return 0;
        }
    }

    public void dodajGas() {
        this.brzina = this.brzina + 10;
    }

    public void smanjiGas() {
        this.brzina = this.brzina - 10;
        if (this.brzina < 0) {
            this.brzina = 0;
        }
    }

    public double trenutnaPotrosnja() {
        if (this.klima) {
            return (this.brzina / 100.0 * this.potrosnja) * 1.2;
        }
        return (this.brzina / 100.0 * this.potrosnja) * 1.0;
    }

    public boolean autoJeOldTimer() {
        if (this.godinaProizvodnje < 1950) {
            return true;
        }
        return false;
    }

    public boolean registracijaJeIstekla(int trenutniMesec) {
        if (trenutniMesec > this.mesecRegistracije) {
            return true;
        }
        return false;
    }

    public double cenaRegistracije() {
        if (this.kubikaza < 2000) {
            return this.kubikaza * 100;
        }
        return this.kubikaza * 100 * 1.3;
    }

    public int natociGorivo(int litrazaGorivaKojaSeToci) {
        if (litrazaGorivaKojaSeToci <= (this.kapacitetRezervoara - this.kolicinaGorivaURezervoaru)) {
            return litrazaGorivaKojaSeToci * 170;
        }
        return (this.kapacitetRezervoara - this.kolicinaGorivaURezervoaru) * 170;
    }

    public boolean brzinaAuta(Auto bmw) {
        if (this.brzina == bmw.brzina) {
            return true;
        }
        return false;
    }

}



