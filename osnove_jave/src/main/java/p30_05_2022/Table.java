package p30_05_2022;

import java.util.ArrayList;

public class Table {

//    Kreirati klasu Table koja ima:
//●	header tabele
//●	niz redova. Niz je niz TableRow elementa
//●	setter za header
//●	metodu za dodvanje novog reda u tablu
//●	metodu za stampu koja stampa header i redove tabele
//●	metodu za stampu HTML-a tabele.Primer
//<table>
//<thead>
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
//</thead>
//<tbody>
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
//<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
//</tbody>
//</table>

//    U klasi Table dodajte metodu filter, koja sluzi da filtrira redove tabele u odnosu na prosledjeni tekst.
//    Metoda stampa tabelu, ali samo redove koji sadrze trazeni tekst.

//    U klasi Table dodajte atribut broj redova po strani (najcesce se koristi 5, 10, 25 ili 100 cisto da
//    navedem neki primer). Dodati metodu koja stampa paginator (Sta je paginator?).
//    Paginator stampa koliko strana imamo za redove u tabeli.
//    Npr: ako imamo u tabeli 50 redova i broj redova po strani je 10 paginator se stampa
//| 1 | 2 | 3 | 4 | 5
//    Zatim izmenite metodu za stampu tako da prima parametar redni broj strane na osnovu koje tabela prikazuje samo
//    elemente te strane. Naravno maksimalno broj elemenata po strani. Primer ako se pozove metoda stampaj za stranu
//    3 i broj redova po strani je 5, treba da se stampaju redovi od indeksa 10 do 14.
//    Ispod redova tabele odstampajte paginator.

    private TableHeader header;
    private ArrayList<TableRow> body = new ArrayList<TableRow>();
    private int numberOfRowsPerPage;

    public Table(TableHeader header, int numberOfRowsPerPage) {
        this.header = header;
        this.numberOfRowsPerPage = numberOfRowsPerPage;
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public int getNumberOfRowsPerPage() {
        return numberOfRowsPerPage;
    }

    public void setNumberOfRowsPerPage(int numberOfRowsPerPage) {
        this.numberOfRowsPerPage = numberOfRowsPerPage;
    }

    public void addNewRow(TableRow row) {
        this.body.add(row);
    }

    public void filter(String tekst) {
        this.header.stampa();
        for (int i = 0; i < this.body.size(); i++) {
            if (this.body.get(i).daLiPostojiTekst(tekst)) {
                this.body.get(i).stampa();
            }
        }
    }

    public void paginator() {
        for (int i = 1; i <= this.body.size() / numberOfRowsPerPage; i++) {
            System.out.print("| " + i + " ");
        }
    }

    public void stampa(int pageNumber) {
        this.header.stampa();
        for (int i = pageNumber * this.numberOfRowsPerPage - numberOfRowsPerPage;
             i < pageNumber * this.numberOfRowsPerPage; i++) {
            this.body.get(i).stampa();
        }
    }

    public void printHTML() {
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.body.size(); i++) {
            this.body.get(i).printHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");
    }
}
