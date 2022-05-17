package p16_05_2022;

public class Zadatak9 {
    public static void main(String[] args) {

//        9.Zadatak
//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        6 - VI
//        7 - VII
//        8 - VIII
//        9 - IX
//        10 - X
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//        Ako se unese VIII vraca se 8.
//        VIII => 8

        int broj = konverzija("IX");
        System.out.println("Arapski broj je: " + broj);
    }
    static int konverzija (String a) {
        if (a.equals("I")) {
            return 1;
        } else if (a.equals("II")) {
            return 2;
        } else if (a.equals("III")) {
            return 3;
        } else if (a.equals("IV")) {
            return 4;
        } else if (a.equals("V")) {
            return 5;
        } else if (a.equals("VI")) {
            return 6;
        } else if (a.equals("VII")) {
            return 7;
        } else if (a.equals("VIII")) {
            return 8;
        } else if (a.equals("IX")) {
            return 9;
        } else if (a.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
}
