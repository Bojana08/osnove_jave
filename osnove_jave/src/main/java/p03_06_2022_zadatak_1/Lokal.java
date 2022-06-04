package p03_06_2022_zadatak_1;

public class Lokal extends Objekat{

    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta() {
        return koeficijent() * povrsinaObjekta * 1.3;
    }

    @Override
    public void stampa() {
        System.out.println("Lokal: ");
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina objekta: " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
        System.out.println("Porez: " + porezObjekta());
    }

}
