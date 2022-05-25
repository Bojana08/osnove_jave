package p23_05_2022;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cenaIzradeProizvoda;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzradeProizvoda() {
        return cenaIzradeProizvoda;
    }

    public void setCenaIzradeProizvoda(int cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public Proizvod() {}

    public Proizvod(String naziv, Kupac kupac, int cenaIzradeProizvoda) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public double cenaProizvoda() {
        return this.cenaIzradeProizvoda * 1.9 * (100 - this.kupac.getKartica().getPopust())/100;
    }
    public void stampaj(){
        System.out.println("Naziv proizvoda: " + this.naziv + " - " + this.cenaProizvoda());
        System.out.println("Ime i prezime: " + this.kupac.getImeIPrezime() + " - " +
                this.kupac.getKartica().getBrojKartice());
    }
}
