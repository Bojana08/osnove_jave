package p24_05_2022;

public class FizickoLice {
    private String punoIme;
    private int brLK;
    private String jmbg;
    private boolean prethodnoKupovao;

    public FizickoLice (String jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String punoIme, int brLK, String jmbg, boolean prethodnoKupovao) {
        this.punoIme = punoIme;
        this.brLK = brLK;
        this.jmbg = jmbg;
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrLK() {
        return brLK;
    }

    public void setBrLK(int brLK) {
        this.brLK = brLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isPrethodnoKupovao() {
        return prethodnoKupovao;
    }

    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public void stampaj () {
        System.out.print(this.punoIme + ", broj LK: " + this.brLK);
    }
}
