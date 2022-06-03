package p02_06_2022_zadatak_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Kreirati abstraktnu klasu Figura koja ima
//●	abstraktnu metodu povrsina
//●	abstraktnu metodu obim
//●	metodu koja stampa podatke u formatu:
//        Povrsina je (povrsina)
//                Obim je (obim)
//
//        Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//●	stranicu a
//●	gettere/settere/konstruktore
//●	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//●	implementira metodu obim
//
//        Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//●	stranice a i b
//●	gettere/settere/konstruktore
//●	implementira metodu povrsina
//●	implementira metodu obim
//
//        U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati
//        sve povrsine i obime i za svaku figuru ispisati ponaosob


        Figura t1 = new JednakostranicniTrougao(3);
        Figura t2 = new JednakostranicniTrougao(5);

        Figura p1 = new Pravougaonik(2, 3);
        Figura p2 = new Pravougaonik(4, 4);
        Figura p3 = new Pravougaonik(1, 6);

        ArrayList<Figura> figure = new ArrayList<Figura>();
        figure.add(t1);
        figure.add(t2);
        figure.add(p1);
        figure.add(p2);
        figure.add(p3);

        t1.obim();
        t2.obim();
        t1.povrsina();
        t2.povrsina();
        p1.obim();
        p2.obim();
        p3.obim();
        p1.povrsina();
        p2.povrsina();
        p3.povrsina();

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampa();
        }

        double sumaO = 0;
        for (int i = 0; i < figure.size(); i++) {
            sumaO = sumaO + figure.get(i).obim();
        }

        System.out.println("Obim svih figura je: " + sumaO);

        double sumaP = 0;
        for (int i = 0; i < figure.size(); i++) {
            sumaP = sumaP + figure.get(i).povrsina();
        }

        System.out.println("Povrsina svih figura je: " + sumaP);

    }
}
