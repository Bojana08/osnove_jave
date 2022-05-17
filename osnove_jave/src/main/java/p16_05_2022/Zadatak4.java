package p16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {

//    4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//     Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa
//     razlicitim prosledjenim vrednostima.

       operacije(10, 2);

    }
    static void operacije (int a, int b) {
        System.out.println("Ovo je zbir: " + (a + b));
        System.out.println("Ovo je razlika: " + (a - b));
        System.out.println("Ovo je proizvod: " + (a * b));
        System.out.println("Ovo je kolicnik: " + (a / b));
    }
}
