package p24_05_2022;

public class Ugovor {
    private String datumSklapanjaUgovora;
    private FizickoLice prodajeNekretninu;
    private FizickoLice kupujeNekretninu;
    private int cenaProdajeNekretnine;
    private String adresaNekretnine;

    public Ugovor () {

    }
    public Ugovor(String datumSklapanjaUgovora, FizickoLice prodajeNekretninu, FizickoLice kupujeNekretninu,
                  int cenaProdajeNekretnine, String adresaNekretnine) {
        this.datumSklapanjaUgovora = datumSklapanjaUgovora;
        this.prodajeNekretninu = prodajeNekretninu;
        this.kupujeNekretninu = kupujeNekretninu;
        this.cenaProdajeNekretnine = cenaProdajeNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public String getDatumSklapanjaUgovora() {
        return datumSklapanjaUgovora;
    }

    public void setDatumSklapanjaUgovora(String datumSklapanjaUgovora) {
        this.datumSklapanjaUgovora = datumSklapanjaUgovora;
    }

    public FizickoLice getProdajeNekretninu() {
        return prodajeNekretninu;
    }

    public void setProdajeNekretninu(FizickoLice prodajeNekretninu) {
        this.prodajeNekretninu = prodajeNekretninu;
    }

    public FizickoLice getKupujeNekretninu() {
        return kupujeNekretninu;
    }

    public void setKupujeNekretninu(FizickoLice kupujeNekretninu) {
        this.kupujeNekretninu = kupujeNekretninu;
    }

    public int getCenaProdajeNekretnine() {
        return cenaProdajeNekretnine;
    }

    public void setCenaProdajeNekretnine(int cenaProdajeNekretnine) {
        this.cenaProdajeNekretnine = cenaProdajeNekretnine;
    }

    public String getAdresaNekretnine() {
        return adresaNekretnine;
    }

    public void setAdresaNekretnine(String adresaNekretnine) {
        this.adresaNekretnine = adresaNekretnine;
    }

    public double procenatZarade () {
        if (this.kupujeNekretninu.isPrethodnoKupovao()) {
            return 0.02;
        }
        return 0.03;
    }
    public double zaradaAgencije () {
        return 1000 + this.cenaProdajeNekretnine * procenatZarade();
    }
    public void stampaj () {
        System.out.print("Dana " + this.datumSklapanjaUgovora + "god sklopljen je ugovor izmedju ");
        this.prodajeNekretninu.stampaj();
        System.out.print(" i ");
        this.kupujeNekretninu.stampaj();
        System.out.println();
        System.out.print("o kupovini nekretnine " + this.adresaNekretnine + ", po ceni od " +
        this.cenaProdajeNekretnine + ", pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
        + this.zaradaAgencije());
    }
}
