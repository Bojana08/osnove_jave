package p03_06_2022_zadatak_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//   Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//●	ime i prezime privatni
//●	i rezultat ostvaren na takmičenju koji je zasticen
//   Javne metode klase su:
//●	apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara
//    (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//●	metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//    Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat,
//    a kod skakača veći.
//    Kreirati i klasu Disciplina čiji su privatni atributi:
//●	ime discipline
//●	tip discipline (Trkacka ili Skakacka)
//●	niz atletičara koji učestvuju u toj disciplini.
//    U javnom delu klase definisati:
//●	konstuktore, gettere i settere
//●	konstruktor koji postavlja ime discipline i tip
//●	metodu dodaj atleticara u disciplinu
//●	metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//●	(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//●	(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//     U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//        (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Disciplina skokUDalj = new Disciplina("Skok u dalj", "Skakacka");
        Disciplina trka = new Disciplina("110m s preponama", "Trkacka");

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj skakaca: ");
        int brojSkakaca = s.nextInt();
        for (int i = 0; i < brojSkakaca; i++) {
            System.out.print("Unesite ime i prezime: ");
            String imeIPrezime = s.next();
            System.out.print("Rezultat: ");
            double rezultat = s.nextDouble();
            Skakac jedan = new Skakac(imeIPrezime, rezultat);
            skokUDalj.dodajAtleticaraUDisciplinu(jedan);
        }

        System.out.print("Unesite broj trkaca: ");
        int brojTrkaca = s.nextInt();
        for (int i = 0; i < brojSkakaca; i++) {
            System.out.print("Unesite ime i prezime: ");
            String imeIPrezime = s.next();
            System.out.print("Rezultat: ");
            double rezultat = s.nextDouble();
            Trkac jedan = new Trkac(imeIPrezime, rezultat);
            trka.dodajAtleticaraUDisciplinu(jedan);
        }

        skokUDalj.najboljiRezultat();
        skokUDalj.stampaPobednik();

        trka.najboljiRezultat();
        trka.stampaPobednik();


    }

}
