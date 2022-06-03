package p02_06_2022_zadatak_1;

public class StudentOsnovnih extends Student {

    public StudentOsnovnih(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean budzet() {
        if (godStudija < 5) {
            return true;
        }
        return false;
    }




}
