package p31_05_2022_3_zadatak;

public class Paket {

    protected String paket;
    protected String korisnk;
    protected int mesecnaCena;
    protected int ugovornaObaveza;
    protected int downloadBrzina;
    protected int uploadBrzina;

    public Paket(String paket,
                 String korisnk,
                 int mesecnaCena,
                 int ugovornaObaveza,
                 int downloadBrzina,
                 int uploadBrzina) {
        this.paket = paket;
        this.korisnk = korisnk;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.downloadBrzina = downloadBrzina;
        this.uploadBrzina = uploadBrzina;
    }

    public String getKorisnk() {
        return korisnk;
    }

    public void setKorisnk(String korisnk) {
        this.korisnk = korisnk;
    }

    public int getMesecnaCena() {
        return mesecnaCena;
    }

    public void setMesecnaCena(int mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public void produziUgovor() {
        this.ugovornaObaveza = this.ugovornaObaveza + 12;
    }

    public int meseciPoDinar() {
        return 0;
    }

    public void stampa() {
        System.out.println("Korisnik: " + this.korisnk);
        System.out.println("Paket: " + this.paket + " - " + this.downloadBrzina + "/" + this.uploadBrzina +
                " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena);
    }
}
