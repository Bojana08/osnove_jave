package d30_05_2022_zadatak_1;

import java.util.ArrayList;

public class Student {

//    Napisati klasu Student koja ima
//●	broj indeksa
//●	ime i prezime
//●	tip studija (osnovne, master, doktorske)
//●	niz ispita
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za indeks, ime i prezime, tip studija
//●	getter za niz predmeta
//●	metodu dodaj ispit u niz ispita
//●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//●	metodu stampaj koja stampa u formatu:
//    (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private String brojIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

    public Student(String brojIndeksa, String punoIme, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    public double prosecnaOcena() {
        int brojIspita = 0;
        int sumaOcena = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                brojIspita++;
                sumaOcena = sumaOcena + this.ispiti.get(i).getOcena();
            }
        }
        return sumaOcena * 1.0 / brojIspita;
    }

    public void stampa() {
        System.out.println("Student: ");
        System.out.println(this.brojIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println();
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampa();
        }
        System.out.println();
        System.out.println("Prosecna osena: " + this.prosecnaOcena());

    }
}
