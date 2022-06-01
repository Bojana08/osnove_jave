package p31_05_2022_3_zadatak;

public class EONPaket extends Paket{

    public EONPaket(String korisnk, int mesecnaCena, int ugovornaObaveza) {
        super("EON LIGHT DUO", korisnk, mesecnaCena, ugovornaObaveza, 150, 75);
    }

    @Override
    public int meseciPoDinar() {
        return 3;
    }

@Override
    public void stampa() {
        System.out.println("Korisnik: " + this.korisnk);
        System.out.println("Paket: " + this.paket + " - " + this.downloadBrzina + "/" + this.uploadBrzina +
                " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena + "  Broj meseci po dinar: " + this.meseciPoDinar());
    }
}
