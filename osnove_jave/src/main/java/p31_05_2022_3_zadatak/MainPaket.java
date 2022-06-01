package p31_05_2022_3_zadatak;

public class MainPaket {
    public static void main(String[] args) {

        EONPaket e = new EONPaket("Jovan Jovanovic", 3200, 24);
        DUOPaket d = new DUOPaket("Petar Petrovic", 4500, 36, "tablet");

        e.stampa();
        System.out.println();

        d.uvecanjeBrzine(50);
        d.stampa();
    }
}
