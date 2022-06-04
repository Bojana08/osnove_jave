package p02_06_2022_zadatak_5;

public class Pica extends Proizvod {

    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public int getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena() {
        return this.cenaPodloge + cenaDodataka();
    }

    @Override
    public void stampa() {
        System.out.println("Pica: ");
        System.out.print("Dodaci: ");
        for (int i = 0; i < nizDodataka.size(); i++) {
            System.out.print(nizDodataka.get(i).getNazivDodatka() + " ");
        }
        System.out.println();
        System.out.println("Cena: " + ukupnaCena());
    }
}
