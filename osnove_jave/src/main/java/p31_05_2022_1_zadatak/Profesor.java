package p31_05_2022_1_zadatak;

public class Profesor extends Osoba{

    private String nazivPredmeta;
    private int iznosPlate;

    public Profesor(String punoIme, String jmbg, String nazivPredmeta, int iznosPlate) {
        super(punoIme, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu(int procenatPovecanja) {
        this.iznosPlate = this.iznosPlate * procenatPovecanja / 100 + this.iznosPlate;
    }

    @Override
    public void stampa(){
        super.stampa();
        System.out.println("Predmet: " + this.nazivPredmeta);
        System.out.println("Plata: " + this.iznosPlate);
    }
}
