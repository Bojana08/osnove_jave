package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning prvaKlima = new SmartAirConditioning();
        prvaKlima.marka = "Samsung";
        prvaKlima.temperatura = 17;
        prvaKlima.mod = "hladi";
        prvaKlima.stampaj();

        SmartAirConditioning drugaKlima = new SmartAirConditioning();
        drugaKlima.marka = "LG";
        drugaKlima.temperatura = 25;
        drugaKlima.mod = "greje";
        drugaKlima.stampaj();

    }
}
