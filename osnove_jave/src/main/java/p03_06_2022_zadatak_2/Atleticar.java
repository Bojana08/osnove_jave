package p03_06_2022_zadatak_2;

public abstract class Atleticar {

    private String imeIPrezime;
    protected double rezultat;

    public Atleticar(String imeIPrezime, double rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeBoljiRezultat(Atleticar atleticar);

    public void stampa() {
        System.out.println("Atelticar: " + this.imeIPrezime + ", " + this.rezultat);
    }
}
