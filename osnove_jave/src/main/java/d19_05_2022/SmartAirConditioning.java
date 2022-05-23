package d19_05_2022;

public class SmartAirConditioning {

    public String marka;
    public double potrosnjaTokomHladjenja;
    public double potrosnjaTokomGrejanja;
    public int temperatura;
    public String mod;

    public void stampa() {
        System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + "C");
    }

    public double mesecnaPotrosnjaUkWh() {
        if (this.mod.equals("hladi")) {
            return 30 * 15 * this.potrosnjaTokomHladjenja;
        }
        return 30 * 15 * this.potrosnjaTokomGrejanja;
    }
    public double mesecnaPotrosnjaUDin () {
        if (this.mesecnaPotrosnjaUkWh() < 350) {
           return this.mesecnaPotrosnjaUkWh() * 6;
        }
        return ((350 * 6) + ((this.mesecnaPotrosnjaUkWh()-350) * 9));
        }

}
