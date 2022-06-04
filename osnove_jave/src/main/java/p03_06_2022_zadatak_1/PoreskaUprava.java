package p03_06_2022_zadatak_1;

import java.util.ArrayList;

public class PoreskaUprava {

    private String grad;
    private ArrayList<Objekat> objekti = new ArrayList<Objekat>();

    public void dodajObjekat(Objekat objekat) {
        this.objekti.add(objekat);
    }

    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).porezObjekta();
        }
        return suma;
    }

    public Objekat najveciPorez() {
        Objekat najveci = this.objekti.get(0);
        for (int i = 1; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porezObjekta() > najveci.porezObjekta()) {
                najveci = this.objekti.get(i);
            }
        }
        return najveci;
    }

    public Objekat najmanjiPorez() {
        Objekat najmanji = this.objekti.get(0);
        for (int i = 1; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porezObjekta() < najmanji.porezObjekta()) {
                najmanji = this.objekti.get(i);
            }
        }
        return najmanji;
    }

    public void stampa() {
        System.out.println("Objekti: ");
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampa();
            System.out.println();
        }
        System.out.println();
        System.out.println("Ukupan porez svih objekata: " + ukupanPorez());
        System.out.println("Najveci porez: ");
        najveciPorez().stampa();
        System.out.println("Najmanji porez: ");
        najmanjiPorez().stampa();
    }

}
