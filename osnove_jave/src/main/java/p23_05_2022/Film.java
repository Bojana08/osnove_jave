package p23_05_2022;

public class Film {
    private String naziv;
    private int godina;

    public Film() {

    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void print() {
        System.out.println(this.naziv + ", " + this.godina);
    }
}
