package d02_06_2022;

public class Main {
    public static void main(String[] args) {

//        U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima
//        rade i ispisati platu za svakog


        Radnik menadzer = new Menadzer("Jovan Jovanovic");
        Radnik magacioner = new Magacioner("Nemanja Petrovic");

        Sektor finansije = new Sektor("Finansije", 110000);
        Sektor gotoviProizvodi = new Sektor("Gotovi Proizvodi", 50000);
        Sektor sirovine = new Sektor("Sirovine", 40000);
        Sektor oprema = new Sektor("Oprema", 40000);

        menadzer.zaposliUSektor(finansije);
        magacioner.zaposliUSektor(gotoviProizvodi);
        magacioner.zaposliUSektor(sirovine);
        magacioner.zaposliUSektor(oprema);

        menadzer.plataRadnika();
        magacioner.plataRadnika();

        System.out.println("Plata menadzera iznosi: " + menadzer.plataRadnika());
        System.out.println("Plata magacionera iznosi: " + magacioner.plataRadnika());

    }
}
