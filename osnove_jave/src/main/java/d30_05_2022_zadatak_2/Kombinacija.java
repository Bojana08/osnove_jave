package d30_05_2022_zadatak_2;

import java.util.ArrayList;

public class Kombinacija {

//    Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama.
//    Znaci nije vam potrebna provera za opseg brojeva.
//
//    Za potrebe Lotto igre na srecu potrebno je
//    Kreirati klasu Kombinacija koja ima:
//●	id kombinacije (String)
//●	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//●	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//●	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//●	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//○	Zaglavlje metode je:
//■	public boolean daLiJeIstaKombinacija( Kombinacija k)
//○	metoda vraca true ako su svi elementi na istim pozicija isti
//■	npr: this [0] == k [0], this [1] == k [1] ….
//●	metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    private String idKombinacije;
    private int jedan;
    private int dva;
    private int tri;
    private int cetiri;
    private int pet;
    private int sest;
    private int sedam;
    private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

    public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.idKombinacije = idKombinacije;
        nizBrojeva.add(jedan);
        nizBrojeva.add(dva);
        nizBrojeva.add(tri);
        nizBrojeva.add(cetiri);
        nizBrojeva.add(pet);
        nizBrojeva.add(sest);
        nizBrojeva.add(sedam);
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public ArrayList<Integer> getNizBrojeva() {
        return nizBrojeva;
    }

    public int getJedan() {
        return jedan;
    }

    public int getDva() {
        return dva;
    }

    public int getTri() {
        return tri;
    }

    public int getCetiri() {
        return cetiri;
    }

    public int getPet() {
        return pet;
    }

    public int getSest() {
        return sest;
    }

    public int getSedam() {
        return sedam;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int suma = 0;
        for (int i = 0; i < nizBrojeva.size(); i++) {
           if (this.nizBrojeva.get(i) == k.nizBrojeva.get(i)) {
               suma++;
           }
        }
        if (suma == 7) {
            return true;
        }
        return false;
    }

    public void stampa() {
        System.out.println("ID: " + this.idKombinacije);
    }
}
