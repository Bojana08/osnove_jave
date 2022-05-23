package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod jedan = new Proizvod();
        jedan.naziv = "Cokolada";
        jedan.cena = 99.99;
        jedan.tezina = 100;
        jedan.stampaj();

        Proizvod dva = new Proizvod();
        dva.naziv = "Kafa";
        dva.cena = 189.99;
        dva.tezina = 200;
        dva.stampaj();

    }
}
