package p24_05_2022;

public class ViberReakcija {

    private String emoji;
    private ViberKorisnik viberKorisnik;

    public ViberReakcija(String emoji, ViberKorisnik viberKorisnik) {
        this.emoji = emoji;
        this.viberKorisnik = viberKorisnik;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getViberKorisnik() {
        return viberKorisnik;
    }

    public void setViberKorisnik(ViberKorisnik viberKorisnik) {
        this.viberKorisnik = viberKorisnik;
    }
}
