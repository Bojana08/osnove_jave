package p23_05_2022;

public class MainKorisnikFacebookPost {
    public static void main(String[] args) {

//2.Zadatak
//Kreirati klasu Korisnik koja ima
//●	ime
//●	prezime
//●	gettere i settere za ime i prezime
//●	konstuktore koje mislite da su vam potrebni
//●	metoda koja stampa u formatu:
//        (ime) (prezime)
//
//Kreirati klasu FacebookPost
//●	opis
//●	korisnik (referenca na korisnika koji je kreirao post)
//●	konstrukore koje mislite da su vam potrebni
//●	metoda print, stampa u formatu:
//        (ime) (prezime)
//        (opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda


        Korisnik k = new Korisnik();
        k.setIme("Petar ");
        k.setPrezime("Petrovic");

        FacebookPost post = new FacebookPost();
        post.setOpis("Zdravo");
        post.setKorisnik(k);
        post.print();

        System.out.println();

        FacebookPost postNovi = new FacebookPost("Cao", k);
        postNovi.print();
    }
}
