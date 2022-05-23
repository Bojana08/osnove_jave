package d19_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning samsung = new SmartAirConditioning();

        samsung.marka = "Samsung";
        samsung.potrosnjaTokomHladjenja = 1.2;
        samsung.potrosnjaTokomGrejanja = 2.3;
        samsung.mod = "hladi";
        samsung.temperatura = 17;
        samsung.stampa();
        samsung.mesecnaPotrosnjaUkWh();
        double potrosnja = samsung.mesecnaPotrosnjaUDin();
        System.out.println("Potrosnja na mesecnom nivou iznosi: " + potrosnja);
        System.out.println();

        SmartAirConditioning lg = new SmartAirConditioning();
        lg.marka = "LG";
        lg.potrosnjaTokomHladjenja = 1.2;
        lg.potrosnjaTokomGrejanja = 2.3;
        lg.mod = "greje";
        lg.temperatura = 25;
        lg.stampa();
        lg.mesecnaPotrosnjaUkWh();
        potrosnja = lg.mesecnaPotrosnjaUDin();
        System.out.println("Potrosnja na mesecnom nivou iznosi: " + potrosnja);

    }
}
