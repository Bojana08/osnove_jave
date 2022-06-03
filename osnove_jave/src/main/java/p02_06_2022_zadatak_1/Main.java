package p02_06_2022_zadatak_1;

public class Main {
    public static void main(String[] args) {

//        1.Zadatak
//
//  Kreirati apstraktnu klasu Student koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	godinu studija
//●	gettere, settere i konstruktore
//●	apstraktnu metodu koja vraca cenu skolarine.
//●	apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//●	metodu koja stampa podatke u formatu:
//        ime i prezime, broj indeksa, godina studija
//        Finansiranje: budzet/samofinansirajuci
//        Cena skolarine: cena
//
//        Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//●	koja za cenu skolarine vraca 90000
//●	za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//        Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//●	koja za cenu skolarine vraca 100000
//●	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//        U glavnoj klasi kreirati studente i testirati funkciolanosti


        StudentOsnovnih s1 = new StudentOsnovnih("Petar Petrovic", "11113", 3);
        StudentMaster m1 = new StudentMaster("Jovan Nikolic", "M1123", 3);

        s1.stampa();
        System.out.println();
        m1.stampa();

    }
}
