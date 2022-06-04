package p02_06_2022_zadatak_5;

import java.util.ArrayList;

public class Kasa {

//    (DOPUNA ZA VEZBANJE)
//    Kreirati klasu Kasa koja ima:
//●	niz svih dostupnih dodataka sa cenama.
//●	niz proizvoda
//●	metodu dodaj proizvod
//●	Difoltni konstuktor u kom se u niz dodaju 10 razlicitih sastojaka u niz
//○	Npr: luk, piletina, junetina, prsuta, jaja, cokolada, …
//●	metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka. Metoda vraca dodatak (objekat tipa Dodatak)
//●	metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
//●	metodu setampajRacun, metoda stampa sve proizvode i ukupan racun
//    U mainu kreirati jednu kasu i u nju dodajte 3-4 proizvoda sa nekoliko dodatak i stampajte racun.
//    U mainu ne kreirate dodatke!!!! Koristite samo one koje vec ima kasa.


    private ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
    private ArrayList<Proizvod> proizvodi = new ArrayList<Proizvod>();

    public Kasa() {
        dodaci.add(new Dodatak("luk", 50));
        dodaci.add(new Dodatak("piletina", 50));
        dodaci.add(new Dodatak("junetina", 50));
        dodaci.add(new Dodatak("prsuta", 50));
        dodaci.add(new Dodatak("jaja", 50));
        dodaci.add(new Dodatak("cokolada", 50));
    }

    public void dodajProizvod(Proizvod proizvod) {
        proizvodi.add(proizvod);
    }

    public Dodatak nadjidodatak(String dodatak) {
        Dodatak trazeniDodatak = new Dodatak("", 0);
        for (int i = 0; i < dodaci.size(); i++) {
            if (dodaci.get(i).getNazivDodatka().equals(dodatak)) {
                trazeniDodatak = dodaci.get(i);
            }
        }
        return trazeniDodatak;
    }

    public void sracunajCenuProizvoda() {
        int suma = 0;
        for (int i = 0; i < proizvodi.size(); i++) {
            suma = suma + proizvodi.get(i).ukupnaCena();
        }
    }

    public void stampajRacun() {
        System.out.println("Proizvodi: ");
        for (int i = 0; i < proizvodi.size(); i++) {
            proizvodi.get(i).stampa();
            System.out.println();
        }
        int ukupnaCena = 0;
        for (int i = 0; i < proizvodi.size(); i++) {
            ukupnaCena = ukupnaCena + proizvodi.get(i).ukupnaCena();
        }
        System.out.println("Racun iznosi: " + ukupnaCena);
        System.out.println();
    }


}
