package d16_05_2022;

public class Zadatak1 {
    public static void main(String[] args) {

//        1. Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(5);
        stampajVrednostZa10Vecu(9);
        stampajVrednostZa10Vecu(18);
    }
    static void stampajVrednostZa10Vecu (int a) {
        System.out.println(a * 10);
    }
}
