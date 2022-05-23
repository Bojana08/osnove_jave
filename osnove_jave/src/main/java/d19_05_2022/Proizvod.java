package d19_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("Proizvod: " + this.naziv + " - cena: " + this.cena + " RSD, tezina: " + this.tezina + "g");
    }

    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(int popust) {
        if (popust > 0 && popust < 100) {
            return ((100 - popust) * this.cena) / 100;
        }
        return 0;
    }

    public int racunajPostarinu() {
        if (this.tezina > 0 && this.tezina <= 100) {
            return 200;
        }
        if (this.tezina > 100 && this.tezina < 500) {
            return 400;
        } else {
            return 1000;
        }

    }

}
