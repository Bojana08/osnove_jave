package p03_06_2022_zadatak_1;

public class Kuca extends Objekat{

    private int brojClanovaObjekta;

    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanovaObjekta) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanovaObjekta = brojClanovaObjekta;
    }

    public int getBrojClanovaObjekta() {
        return brojClanovaObjekta;
    }

    public void setBrojClanovaObjekta(int brojClanovaObjekta) {
        this.brojClanovaObjekta = brojClanovaObjekta;
    }

    @Override
    public double porezObjekta() {
        return koeficijent() * povrsinaObjekta;
    }

    @Override
    public void stampa() {
        System.out.println("Kuca: ");
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina objekta: " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
        System.out.println("Porez: " + porezObjekta());
    }

}
