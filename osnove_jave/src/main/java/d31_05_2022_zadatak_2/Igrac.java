package d31_05_2022_zadatak_2;

import java.util.ArrayList;

public class Igrac extends Osoba {

//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//-	broj (broj koji igrac nosi)
//-	poziciju koju igra (odbrambeni, napadac, … )
//-	niz kartona
//-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere za broj, kapiten i poziciju
//-	metodu dodaj karton, gde se dodaje karton u niz
//-	metodu koja vraca broj zutih kartona
//-	metodu koja vraca broj crvenih kartona
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int broj;
    private String pozicija;
    private ArrayList<Karton> nizKartona = new ArrayList<Karton>();
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton) {
        this.nizKartona.add(karton);
    }

    public int brojZutihKartona() {
        int brojZutihKartona = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("Zuti")) {
                brojZutihKartona++;
            }
        }
        return brojZutihKartona;
    }

    public int brojCrvenihKartona() {
        int brojCrvenihKartona = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("Crveni")) {
                brojCrvenihKartona++;
            }
        }
        return brojCrvenihKartona;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Broj koji igrac nosi: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if (this.kapiten) {
            System.out.println("Igrac je kapiten tima.");
        } else {
            System.out.println("Igrac nije kapiten tima.");
        }
        System.out.println("Broj zutih kartona: " + brojZutihKartona());
        System.out.println("Broj crvenih kartona: " + brojCrvenihKartona());
    }
}
