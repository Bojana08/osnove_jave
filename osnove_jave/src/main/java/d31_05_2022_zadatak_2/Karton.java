package d31_05_2022_zadatak_2;

public class Karton {

//    (Za vezbanje)
//   2. Zadatak
//   Kreirati klasu Karton koja ima:
//-	tip kartona (crveni, zuti)
//-	konstuktore za koje mislite da ce vam trebati
//-	gettere i settere za karton

    private String tipKartona;

    public Karton(String tipKartona) {
        this.tipKartona = tipKartona;
    }

    public String getTipKartona() {
        return tipKartona;
    }

    public void setTipKartona(String tipKartona) {
        this.tipKartona = tipKartona;
    }
}
