package p16_05_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

//        10. Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju
//        (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.2113 RSD
//        1 EUR = 1.1821 USD

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u eurima: ");
        int vrednost = s.nextInt();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();

        double x = konverzija(vrednost, valuta);
        System.out.println("Konverzija eura u " + valuta + " iznosi: " + x);
    }
    static double konverzija(int vrednost, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednost * 117.2113;
        } else if (valuta.equals("USD")) {
            return vrednost * 1.1821;
        } else {
        return vrednost * 67.31;}
    }
}
