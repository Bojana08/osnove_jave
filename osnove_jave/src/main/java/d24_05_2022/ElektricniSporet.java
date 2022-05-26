package d24_05_2022;

public class ElektricniSporet {

//    Kreirati klasu ElektricniSporet koja ima:
//            ●	marku storeta (npr: Beko, Bosh)
//●	garanciju kao broj godina
//●	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//●	4 ringle
//○	gore levo
//○	gore desno
//○	dole levo
//○	dole desno
//●	konstruktor koji postavlja sve atribute
//●	gettere za sve atribut
//●	ne postoje setteri
//●	metodu pojacaj kojoj se prosledjuje pozicija ringle
//○	pozicija 1 je ringla gore levo
//○	pozicija 2 je ringla gore desno
//○	pozicija 3 je ringla dole levo
//○	pozicija 4 je ringla dole desno
//○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije
//○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//            ●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//○	pozicija 1 je ringla gore levo
//○	pozicija 2 je ringla gore desno
//○	pozicija 3 je ringla dole levo
//○	pozicija 4 je ringla dole desno
//●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//●	metodu koja stampa podatke u formatu:
//    marka - garancija u godinama
//    Ringle:
//    Gore levo:
//    Ringla je ukljucena/iskljucena
//    Tip ringle: tip ringle
//    Jacina: jacina
//    Grejac: jacina grejaca kW
//    Gore desno:
//    Ringla je ukljucena/iskljucena
//    Tip ringle: tip ringle
//    Jacina: jacina
//    Grejac: jacina grejaca kW
//    Dole levo:
//    Ringla je ukljucena/iskljucena
//    Tip ringle: tip ringle
//    Jacina: jacina
//    Grejac: jacina grejaca kW
//    Dole desno:
//    Ringla je ukljucena/iskljucena
//    Tip ringle: tip ringle
//    Jacina: jacina
//    Grejac: jacina grejaca kW


    private String markaSporeta;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla ringlaGoreLevo;
    private Ringla ringlaGoreDesno;
    private Ringla ringlaDoleLevo;
    private Ringla ringlaDoleDesno;

    public ElektricniSporet(String markaSporeta, int garancija, int maxBrojUkljucenihRingli,
                            Ringla ringlaGoreLevo, Ringla ringlaGoreDesno, Ringla ringlaDoleLevo,
                            Ringla ringlaDoleDesno) {
        this.markaSporeta = markaSporeta;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.ringlaGoreLevo = ringlaGoreLevo;
        this.ringlaGoreDesno = ringlaGoreDesno;
        this.ringlaDoleLevo = ringlaDoleLevo;
        this.ringlaDoleDesno = ringlaDoleDesno;
    }

    public String getMarkaSporeta() {
        return markaSporeta;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrojUkljucenihRingli() {
        return maxBrojUkljucenihRingli;
    }

    public Ringla getRinglaGoreLevo() {
        return ringlaGoreLevo;
    }

    public Ringla getRinglaGoreDesno() {
        return ringlaGoreDesno;
    }

    public Ringla getRinglaDoleLevo() {
        return ringlaDoleLevo;
    }

    public Ringla getRinglaDoleDesno() {
        return ringlaDoleDesno;
    }

    int brojac1 = 0;
    int brojac2 = 0;
    int brojac3 = 0;
    int brojac4 = 0;

    public void pojacaj(int pozicijaRingle) {
        if (pozicijaRingle == 1) {
            this.ringlaGoreLevo.pojacajRinglu();
            if (this.ringlaGoreLevo.getJacinaRingle() > 0) {
                brojac1 = 1;
            }
        } else if (pozicijaRingle == 2) {
            this.ringlaGoreDesno.pojacajRinglu();
            if (this.ringlaGoreDesno.getJacinaRingle() > 0) {
                brojac2 = 1;
            }
        } else if (pozicijaRingle == 3) {
            this.ringlaDoleLevo.pojacajRinglu();
            if (this.ringlaDoleLevo.getJacinaRingle() > 0) {
                brojac3 = 1;
            }
        } else if (pozicijaRingle == 4) {
            this.ringlaDoleDesno.pojacajRinglu();
            if (this.ringlaDoleDesno.getJacinaRingle() > 0) {
                brojac4 = 1;
            }
        }

        if (brojac1 + brojac2 + brojac3 + brojac4 > maxBrojUkljucenihRingli) {
            if (pozicijaRingle != 1) {
                this.ringlaGoreLevo.iskljuciRinglu();
                brojac1 = 0;
            }
            if (pozicijaRingle != 2) {
                this.ringlaGoreDesno.iskljuciRinglu();
                brojac2 = 0;
            }
            if (pozicijaRingle != 3) {
                this.ringlaDoleLevo.iskljuciRinglu();
                brojac3 = 0;
            }
            if (pozicijaRingle != 4) {
                this.ringlaDoleDesno.iskljuciRinglu();
                brojac4 = 0;
            }
        }
    }
    public void iskljuci(int pozicijaRingle) {
        if (pozicijaRingle == 1) {
            this.ringlaGoreLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 2) {
            this.ringlaGoreDesno.iskljuciRinglu();
        } else if (pozicijaRingle == 3) {
            this.ringlaDoleLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 4) {
            this.ringlaDoleDesno.iskljuciRinglu();
        }
    }

    public double ukupnaPotrosnja(double brojRadnihSati) {
        return this.ringlaGoreLevo.potrosnjaElEn(brojRadnihSati) +
                this.ringlaGoreDesno.potrosnjaElEn(brojRadnihSati) +
                this.ringlaDoleLevo.potrosnjaElEn(brojRadnihSati) +
                this.ringlaDoleDesno.potrosnjaElEn(brojRadnihSati);
    }

    public void stampa() {
        System.out.println(this.markaSporeta + " - " + this.garancija + " god.");
        System.out.println("Ringle: ");
        System.out.println("Gore levo: ");
        this.ringlaGoreLevo.stampa();
        System.out.println("Gore desno: ");
        this.ringlaGoreDesno.stampa();
        System.out.println("Dole levo: ");
        this.ringlaDoleLevo.stampa();
        System.out.println("Dole desno: ");
        this.ringlaDoleDesno.stampa();
    }
}

