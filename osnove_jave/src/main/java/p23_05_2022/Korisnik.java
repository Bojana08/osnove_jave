package p23_05_2022;

public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void print() {
        System.out.println(this.ime + this.prezime);
    }
}
