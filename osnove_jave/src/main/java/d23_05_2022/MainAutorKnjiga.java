package d23_05_2022;

public class MainAutorKnjiga {
    public static void main(String[] args) {

//    U glavnom programu napraviti vise autora sa vise knjiga.

        Autor den = new Autor("Den", "Braun");
        Knjiga inferno = new Knjiga("978-86-3450-743-2", "Inferno", 2013, den);
        inferno.print();
        System.out.println();
        Knjiga poreklo = new Knjiga("978-86-7560-143-2", "Poreklo", 2017, den);
        poreklo.print();
        System.out.println();

        Autor lav = new Autor("Lav", "Tolstoj");
        Knjiga anaKarenjina = new Knjiga("978-86-521-3555-4", "Ana Karenjina", 2020, lav);
        anaKarenjina.print();


    }
}
