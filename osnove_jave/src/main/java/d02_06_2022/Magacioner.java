package d02_06_2022;

public class Magacioner extends Radnik{

//    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//            ●	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//            ●	 suma plata svih sektor / broj sektora * 0.5
//            ●	 override uje metodu za platu, tako da se plata racuna po formuli:
//            (prosecna plata za sve sektore u kojima radi) * (broj sektora).


    public Magacioner() {
    }

    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }

    private double avgPlata () {
        double sumaPlata = 0;
        for (int i =0; i < sektori.size(); i++) {
            sumaPlata = sumaPlata + sektori.get(i).getPlataUSektoru();
        }
        return sumaPlata / sektori.size() * 0.5;
    }

    @Override
    public double plataRadnika(){
        return avgPlata() * sektori.size();
    }
}
