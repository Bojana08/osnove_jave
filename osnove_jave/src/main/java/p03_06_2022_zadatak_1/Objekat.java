package p03_06_2022_zadatak_1;

public abstract class Objekat {

    protected String adresa;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekat(String adresa, double povrsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent() {
        double koef = 0;
        if (this.zona == 1) {
            koef = 1.4;
        } else if (this.zona == 2) {
            koef = 1.1;
        } else {
            koef = 1.05;
        }
        return koef;
    }

    public abstract double porezObjekta();

    public abstract void stampa();

}
