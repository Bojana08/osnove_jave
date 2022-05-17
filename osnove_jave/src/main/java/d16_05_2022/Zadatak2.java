package d16_05_2022;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//        vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        stampajNovuVrednost(6, 2);
    }
    static void stampajNovuVrednost(int a, int b) {
        System.out.println("Nova vrednost je " + a + b);
    }
}
