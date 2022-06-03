package p02_06_2022_zadatak_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        5. Zadatak(ZA VEZBANJE)
//        Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
//        Npr: Ice point vanila sa dodacima: plazma, cokolada
//        Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
//
//        Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//●	 naziv dodatka
//●	 cenu dodatka
//●	 konstruktore, gettere i settere koji su vam potrebni
//●	 metodu stampaj koja stampa u formatu:
//        (dodatak)  (cena)
//
//                Kreirati abstraktnu klasu Proizvod koja ima:
//●	 niz dodataka
//●	 metodu ubaciDodatak koja dodaje dodatak u niz
//●	 metodu koja vraca cenu svih dodataka koje ima proizvod
//●	 abstraktnu metodu ukupnu racunaj cenu
//●	 abstraktnu metodu stampaj
//
//        Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//●	 tip sladoleda (vanila, cokolada)
//●	 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//●	 override uje metodu koja ukupnu cenu racuna:
//○	ako je mali ice point na cenu svih dodataka doda 100
//○	ako je veliki ice point cenu svih dodataka doda 130
//●	override uje metodu stampaj da stampa sve podatke
//
//        Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//●	 cena podloge
//●	 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//●	override uje metodu stampaj da stampa sve podatke
//
//        U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati
//        po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.


                Proizvod iP1 = new IcePoint("vanila", true);
        Proizvod iP2 = new IcePoint("vanila", false);
        Proizvod iP3 = new IcePoint("cokolada", true);

        Proizvod p1 = new Pica(100);
        Proizvod p2 = new Pica(150);

        Dodatak visnje = new Dodatak("Visnje", 35);
        Dodatak maline = new Dodatak("Maline", 35);
        Dodatak plazma = new Dodatak("Plazma", 50);
        Dodatak cokolada = new Dodatak("Cokolada", 40);

        Dodatak kecap = new Dodatak("Kecap", 15);
        Dodatak origano = new Dodatak("Origano", 5);

        iP1.ubaciDodatak(visnje);
        iP1.ubaciDodatak(maline);
        iP2.ubaciDodatak(plazma);
        iP2.ubaciDodatak(maline);
        iP2.ubaciDodatak(cokolada);
        iP3.ubaciDodatak(visnje);

        p1.ubaciDodatak(kecap);
        p2.ubaciDodatak(kecap);
        p2.ubaciDodatak(origano);

        iP1.stampa();
        System.out.println();
        iP2.stampa();
        System.out.println();
        iP3.stampa();
        System.out.println();
        p1.stampa();
        System.out.println();
        p2.stampa();

    }

}
