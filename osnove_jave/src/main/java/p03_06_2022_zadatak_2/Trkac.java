package p03_06_2022_zadatak_2;

public class Trkac extends Atleticar{


    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiRezultat(Atleticar atleticar) {
        if (atleticar.rezultat > this.rezultat) {
            return true;
        }
        return false;
    }
}
