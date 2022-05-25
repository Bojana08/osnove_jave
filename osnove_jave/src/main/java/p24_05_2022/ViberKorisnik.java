package p24_05_2022;

public class ViberKorisnik {

    private String punoIme;
    private String brTelefona;
    private boolean korisnikJeAktivan;

    public ViberKorisnik(String punoIme, String brTelefona, boolean korisnikJeAktivan) {
        this.punoIme = punoIme;
        this.brTelefona = brTelefona;
        this.korisnikJeAktivan = korisnikJeAktivan;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }

    public boolean isKorisnikJeAktivan() {
        return korisnikJeAktivan;
    }

    public void setKorisnikJeAktivan(boolean korisnikJeAktivan) {
        this.korisnikJeAktivan = korisnikJeAktivan;
    }
}
