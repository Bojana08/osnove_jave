package p02_06_2022_zadatak_5;

import java.util.ArrayList;

public abstract class Proizvod {

    protected ArrayList<Dodatak> nizDodataka = new ArrayList<Dodatak>();

    public Proizvod() {
    }

    public void ubaciDodatak(Dodatak dodatak) {
        nizDodataka.add(dodatak);
    }

    public int cenaDodataka() {
        int suma = 0;
        for (int i = 0; i < nizDodataka.size(); i++) {
            suma = suma + nizDodataka.get(i).getCenaDodatka();
        }
        return suma;
    }

    public abstract int ukupnaCena();

    public abstract void stampa();


}
