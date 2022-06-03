package p02_06_2022_zadatak_5;

public class IcePoint extends Proizvod {

    private String tipSladoleda;
    private boolean maliSladoled;


    public IcePoint(String tipSladoleda, boolean maliSladoled) {
        this.tipSladoleda = tipSladoleda;
        this.maliSladoled = maliSladoled;
    }

    public String getTipSladoleda() {
        return tipSladoleda;
    }

    public void setTipSladoleda(String tipSladoleda) {
        this.tipSladoleda = tipSladoleda;
    }

    public boolean isMaliSladoled() {
        return maliSladoled;
    }

    public void setMaliSladoled(boolean maliSladoled) {
        this.maliSladoled = maliSladoled;
    }

    @Override
    public int ukupnaCena() {
        int ukupnaCena = 0;
        if (maliSladoled) {
            ukupnaCena = ukupnaCena + cenaDodataka() + 100;
        } else {
            ukupnaCena = ukupnaCena + cenaDodataka() + 130;
        }
        return ukupnaCena;
    }

    @Override
    public void stampa() {
        System.out.println("Sladoled: ");
        System.out.println("Ukus: " + this.tipSladoleda);
        if (this.maliSladoled) {
            System.out.println("Velicina: Mali IcePoint.");
        } else {
            System.out.println("Velicina: Veliki IcePoint.");
        }
        System.out.println("Dodaci: ");
        for (int i = 0; i < nizDodataka.size(); i++) {
            System.out.println(nizDodataka.get(i).getNazivDodatka() + " ");
        }
        System.out.println("Cena: " + ukupnaCena());
    }
}
