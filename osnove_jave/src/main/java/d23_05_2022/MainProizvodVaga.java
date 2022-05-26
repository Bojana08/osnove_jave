package d23_05_2022;

public class MainProizvodVaga {
    public static void main(String[] args) {

        Proizvod b = new Proizvod("212314", "brasno", 65);

        Vaga vagaB = new Vaga();
        vagaB.setMernaJedinica("kg");
        vagaB.setProizvod(b);
        vagaB.sracunajCenu(2);
        vagaB.stampa(2);
        System.out.println();

        Proizvod s = new Proizvod("58962k", "secer", 74);

        Vaga vagaS = new Vaga();
        vagaS.setMernaJedinica("lb");
        vagaS.setProizvod(s);
        vagaS.sracunajCenu(3);
        vagaS.stampa(3);

    }
}
