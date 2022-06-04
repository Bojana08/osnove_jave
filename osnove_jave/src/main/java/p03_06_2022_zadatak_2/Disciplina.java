package p03_06_2022_zadatak_2;

import java.util.ArrayList;

public class Disciplina {

    private String ime;
    private String tipDiscipline;
    private ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();

    public Disciplina(String ime, String tipDiscipline) {
        this.ime = ime;
        this.tipDiscipline = tipDiscipline;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public void dodajAtleticaraUDisciplinu(Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }

    public void diskvalifikujAtleticara(String imeIPrezime) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getImeIPrezime().equals(imeIPrezime)) {
                this.atleticari.remove(i);
            }
        }
    }

    public Atleticar najboljiRezultat() {
        Atleticar najbolji = this.atleticari.get(0);
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).daLiJeBoljiRezultat(najbolji)) {
                    najbolji = this.atleticari.get(i);
                }
            }
        return najbolji;
    }

    public void stampaPobednik() {
        najboljiRezultat().stampa();
    }
}
