package d18_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("Naziv proizvoda: " + this.naziv + ", " + this.cena + " RSD, " + this.tezina + "g");
    }
}
