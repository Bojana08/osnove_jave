package d30_05_2022_zadatak_2;

import java.util.ArrayList;

public class Listic {

//    Kreirati klasu Listic koja ima:
//●	niz kombinacija - maksimalno 7 kombinacija
//●	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//●	metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
//    Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//    Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//○	Zaglavlje metode
//■	public boolean dobitna(Kombinacija dobitnaKombinacija)
//●	metodu koja stampa listic u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//
//     …… i tako za sve kombinacije


    private ArrayList<Kombinacija> listic = new ArrayList<Kombinacija>();

    public void dodajKombinaciju(Kombinacija kombinacija) {
        this.listic.add(kombinacija);
    }

    public boolean daLiJeKombinacijaDobitna(Kombinacija dobitnaKombinacija) {
        System.out.println("ID: " + dobitnaKombinacija.getIdKombinacije());
        System.out.print("Izvucena kombinacija je: ");
        for (int i = 0; i < dobitnaKombinacija.getNizBrojeva().size(); i++){
            System.out.print(dobitnaKombinacija.getNizBrojeva().get(i) + " ");}
        System.out.println();
        for (int i = 0; i < this.listic.size(); i++) {
            if (this.listic.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
                System.out.println("Listic ima dobitnu kombinaciju.");
                System.out.println();
                return true;
            }
        }
        System.out.println("Listic nema dobitnu kombinaciju.");
        System.out.println();
       return false;
    }


    public void stampa() {
        System.out.println("Kombinacije na listicu su: ");
        for (int i = 0; i < this.listic.size(); i++) {
            this.listic.get(i).stampa();
            System.out.println(this.listic.get(i).getNizBrojeva());
        }
    }
}
