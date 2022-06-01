package p31_05_2022_3_zadatak;

public class DUOPaket extends Paket{

    private String uredjaj;

    public DUOPaket(String korisnk, int mesecnaCena, int ugovornaObaveza, String uredjaj) {
        super("EON FULL DUO", korisnk, mesecnaCena, ugovornaObaveza, 250, 100);
        this.uredjaj = uredjaj;
    }

    @Override
    public int meseciPoDinar() {
        return 6;
    }

    public void uvecanjeBrzine(int vrednost) {
        this.downloadBrzina = 250 + vrednost;
        this.uploadBrzina = 100 + vrednost;
    }

    @Override
    public void stampa() {
        System.out.println("Korisnik: " + this.korisnk);
        System.out.println("Paket: " + this.paket + " - " + this.downloadBrzina + "/" + this.uploadBrzina +
                " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena + "  Broj meseci po dinar: " + meseciPoDinar());
    }
}
