package p03_06_2022_zadatak_2;

public class Skakac extends Atleticar{

        public Skakac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiRezultat(Atleticar atleticar) {
        if (atleticar.rezultat < this.rezultat) {
            return true;
        }
        return false;
    }
}
