package p23_05_2022;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;
    public FacebookPost() {}
    public FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public void setOpis (String opis) {
        this.opis = opis;
    }
    public String getOpis(){
        return this.opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public void print(){
        System.out.println(this.korisnik.getIme() + this.korisnik.getPrezime());
        System.out.println(this.opis);
    }
}
