package p02_06_2022_zadatak_1;

public class StudentMaster extends Student {

    public StudentMaster(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean budzet() {
        if (godStudija < 2) {
            return true;
        }
        return false;
    }

}
