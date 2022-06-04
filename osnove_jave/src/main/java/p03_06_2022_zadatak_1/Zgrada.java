package p03_06_2022_zadatak_1;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porezObjekta() {
        return koeficijent() * povrsinaObjekta * brojStanova;
    }

    @Override
    public void stampa() {
        System.out.println("Zgrada: ");
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina objekta: " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
        System.out.println("Porez: " + porezObjekta());
    }

}
