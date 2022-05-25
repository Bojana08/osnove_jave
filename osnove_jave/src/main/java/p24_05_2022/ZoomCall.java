package p24_05_2022;

public class ZoomCall {

    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall () {}

    public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void stampaj () {
        System.out.println("Zoom call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + getHost().getImeIPrezime());
        System.out.println("Guest: " + getGuest().getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je: " + this.host.duzinaTrajanjaPoziva());

    }

}
