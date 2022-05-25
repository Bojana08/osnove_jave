package p23_05_2022;

public class MainFilmReziser {
    public static void main(String[] args) {

// 1.Zadatak
// Kreirati klasu Film koja ima:
//●	naziv filma
//●	iz koje godine je film
//●	konstruktore, gettere i settere koji su potrebni
//●	metodu print koja stampa podatke u formatu
//        naziv filma, godina
//
//Kreirati klasu Reziser koja ima:
//●	ime i prezime rezisera
//●	startost
//●	konstruktore, gettere i settere koji su potrebni
//●	metodu print koja stampa podatke u formatu
//●	ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda


        Film film = new Film();
        film.setNaziv("Dune");
        film.setGodina(2021);
        film.print();

        Reziser reziser = new Reziser();
        reziser.setImeIPrezime("Denis Villeneuve");
        reziser.setStarost(55);
        reziser.print();

    }
}
