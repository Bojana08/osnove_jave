package d02_06_2022;

public class Sektor {

//    Kreirati klasu Sektor koja ima:
//●	 naziv sektora
//●	 platu koja je za taj sektor

    private String nazivSektora;
    private int plataUSektoru;

    public Sektor(String nazivSektora, int plataUSektoru) {
        this.nazivSektora = nazivSektora;
        this.plataUSektoru = plataUSektoru;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public int getPlataUSektoru() {
        return plataUSektoru;
    }

    public void setPlataUSektoru(int plataUSektoru) {
        this.plataUSektoru = plataUSektoru;
    }
}
