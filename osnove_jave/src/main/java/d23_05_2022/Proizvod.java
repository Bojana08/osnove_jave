package d23_05_2022;

public class Proizvod {

//2.	(Za vezbanje) Kreirati klasu Proizvod koja ima:
//-	sifru proizvoda
//-	naziv proizvoda
//-	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//-	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//-	gettere i settere za sifru i naziv
//-	setter za cenu po kilogramu
//-	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//-	metodu getCenaLb koja vraca cenu za 1lb prozvoda
//    konverzija: 1 kg = 2.2046 lb
//-	metodu koja stampa proizvod u formatu:
//            (sifra) - (naziv)


    private String sifra;
    private String naziv;
    private double cenaKg;

    public Proizvod() {
    }

    public Proizvod(String sifra, String naziv, int cenaKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaKg = cenaKg;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaKg(int cenaKg) {
        this.cenaKg = cenaKg;
    }

    public double getCenaKg() {
        return this.cenaKg;
    }

    public double getCenaLb() {
        return this.cenaKg / 2.2046;
    }

    public void stampa() {
        System.out.println(this.sifra + " - " + this.naziv);
    }
}
