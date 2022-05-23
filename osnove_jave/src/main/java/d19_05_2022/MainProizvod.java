package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod knjiga = new Proizvod();
        knjiga.naziv = "Knjiga";
        knjiga.cena = 1599.00;
        knjiga.tezina = 587;
        knjiga.stampaj();
        knjiga.povecajCenu(100);
        System.out.println("Cena proizvoda nakon povecanja iznosi: " + knjiga.cena + " RSD");
        double cenaSaPopustom = knjiga.vratiCenuSaPopustom(15);
        System.out.println("Cena proizvoda nakon uracunatog popusta iznosi: " + cenaSaPopustom + " RSD");
        int postarina = knjiga.racunajPostarinu();
        System.out.println("Postarina za ovaj proizvod iznosi: " + postarina + " RSD");

        System.out.println();

        Proizvod ranac = new Proizvod();
        ranac.naziv = "Ranac";
        ranac.cena = 6599.00;
        ranac.tezina = 965;
        ranac.stampaj();
        ranac.povecajCenu(400);
        ranac.povecajCenu(500);
        System.out.println("Cena proizvoda nakon povecanja iznosi: " + ranac.cena + " RSD");
        cenaSaPopustom = ranac.vratiCenuSaPopustom(50);
        System.out.println("Cena proizvoda nakon uracunatog popusta iznosi: " + cenaSaPopustom + " RSD");
        postarina = ranac.racunajPostarinu();
        System.out.println("Postarina za ovaj proizvod iznosi: " + postarina + " RSD");

    }
}
