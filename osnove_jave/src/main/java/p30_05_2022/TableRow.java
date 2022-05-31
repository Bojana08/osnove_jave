package p30_05_2022;

import java.util.ArrayList;

public class TableRow {

//    Kreirati klasu TableRow koja ima:
//●	niz celija u telu tabele. Niz je niz stringova
//●	metodu addRowCell, koja dodaje polje u niz
//●	metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//●	metodu printHTML, koja sluzi da stampa red u HTML formatu.
//    red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
//    primer:
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//
//    U klasi TableRow dodajte metodu koja proverava da li se neki prosledjeni tekst sadrzi u nekoj celiji tog reda.
//    Metoda vraca true ako postoji

    private ArrayList<String> celijeBody = new ArrayList<String>();

    public void addRowCell(String polje) {
        this.celijeBody.add(polje);
    }

    public boolean daLiPostojiTekst(String tekst) {
        for (int i = 0; i < celijeBody.size(); i++) {
            if (this.celijeBody.get(i).equals(tekst)) {
                return true;
            }
        }
        return false;
    }

    public void stampa() {
        for (int i = 0; i < this.celijeBody.size(); i++) {
            System.out.print(this.celijeBody.get(i) + "\t\t|\t\t");
        }
        System.out.println();
    }
    public void printHTML() {
        System.out.print("<tr>");
        for (int i = 0; i < this.celijeBody.size(); i++) {
            System.out.print("<td>" + this.celijeBody.get(i) + "</td>");
        }
        System.out.println("</tr>");
    }
}
