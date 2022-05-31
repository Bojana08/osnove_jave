package p30_05_2022;

public class MainTable {
    public static void main(String[] args) {

//U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda) i odstampajte je obicno i u html-u.

        TableHeader Header = new TableHeader();
        Header.addHeaderCell("First Name");
        Header.addHeaderCell("Last Name");
        Header.addHeaderCell("Age");

        TableRow firstRow = new TableRow();
        firstRow.addRowCell("Bojana");
        firstRow.addRowCell("Radojkovic");
        firstRow.addRowCell("29");

        TableRow secondRow = new TableRow();
        secondRow.addRowCell("Petar");
        secondRow.addRowCell("Petrovic");
        secondRow.addRowCell("32");

        TableRow thirdRow = new TableRow();
        thirdRow.addRowCell("Jovan");
        thirdRow.addRowCell("Milosevic");
        thirdRow.addRowCell("45");

        TableRow fourthRow = new TableRow();
        fourthRow.addRowCell("Marija");
        fourthRow.addRowCell("Jovanovic");
        fourthRow.addRowCell("30");

        TableRow fifthRow = new TableRow();
        fifthRow.addRowCell("Milena");
        fifthRow.addRowCell("Veljkovic");
        fifthRow.addRowCell("40");

        TableRow sixthRow = new TableRow();
        sixthRow.addRowCell("Petar");
        sixthRow.addRowCell("Jovanovic");
        sixthRow.addRowCell("16");

        TableRow seventhRow = new TableRow();
        seventhRow.addRowCell("Jovan");
        seventhRow.addRowCell("Petrovic");
        seventhRow.addRowCell("24");

        TableRow eighthRow = new TableRow();
        eighthRow.addRowCell("Jovana");
        eighthRow.addRowCell("Petrovic");
        eighthRow.addRowCell("33");

        TableRow ninthdRow = new TableRow();
        ninthdRow.addRowCell("Verica");
        ninthdRow.addRowCell("Milenkovic");
        ninthdRow.addRowCell("40");

        TableRow tenthRow = new TableRow();
        tenthRow.addRowCell("Milos");
        tenthRow.addRowCell("Jovanovic");
        tenthRow.addRowCell("26");


        Table table = new Table(Header, 5);
        table.addNewRow(firstRow);
        table.addNewRow(secondRow);
        table.addNewRow(thirdRow);
        table.addNewRow(fourthRow);
        table.addNewRow(fifthRow);
        table.addNewRow(sixthRow);
        table.addNewRow(seventhRow);
        table.addNewRow(eighthRow);
        table.addNewRow(ninthdRow);
        table.addNewRow(tenthRow);
        table.addNewRow(fourthRow);
        table.addNewRow(fifthRow);
        table.addNewRow(sixthRow);
        table.addNewRow(seventhRow);
        table.addNewRow(eighthRow);
        table.addNewRow(firstRow);
        table.addNewRow(secondRow);
        table.addNewRow(thirdRow);
        table.addNewRow(fourthRow);
        table.addNewRow(fifthRow);
        table.addNewRow(firstRow);
        table.addNewRow(secondRow);
        table.addNewRow(thirdRow);
        table.addNewRow(fourthRow);
        table.addNewRow(fifthRow);


        table.filter("Bojana");
        System.out.println();
        System.out.println();
        table.stampa(3);
        table.paginator();
        System.out.println();

        System.out.println();
        table.printHTML();
    }
}
