package p30_05_2022;

import java.util.ArrayList;

public class TableHeader {

//    Kreirati klasu TableHeader koja ima:
//●	niz celija u headeru tabele. Niz je niz stringova
//●	metodu addHeaderCell, koja dodaje polje u niz
//●	metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//(Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
//●	metodu printHTML, koja sluzi da stampa header u HTML formatu.
//    header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
//    primer:
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>

    private ArrayList<String> celijeHeader = new ArrayList<String>();

    public void addHeaderCell(String poljeHeader){
        this.celijeHeader.add(poljeHeader);
    }

    public void stampa() {
        for (int i = 0; i < this.celijeHeader.size(); i++) {
            System.out.print(this.celijeHeader.get(i) + "\t\t|\t\t");
        }
        System.out.println();
    }

    public void printHTML () {
        System.out.print("<tr>");
        for (int i = 0; i < this.celijeHeader.size(); i++) {
            System.out.print("<td>" + this.celijeHeader.get(i) + "</td>");
        }
        System.out.println("</tr>");
    }


}
