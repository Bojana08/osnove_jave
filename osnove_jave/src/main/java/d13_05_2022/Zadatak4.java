package d13_05_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//    4.	Napisati program koji uci korisnika da kaze “Molim te”. Program od korisnika
//    ucitava zahteve koje treba da izvrsi ali jedino reaguje ukoliko korisnik lepo zamoli
//    ( u zahtevu unese “Molim te”). Ukoliko korisnik unese zahtev u vidu naredjivanja,
//    program ne reaguje na takve zahteve tj. nista ne ispisuje, a ukoliko korisnik zamoli
//    tada program ispisuje “Dogovoreno!”. Program radi dok korisnik ne unese “Hvala!”.
//    Na kraju programa ispisati “Cao”
//    Commitujte zadatak i push-ujte na github, sa porukom “Domaci 13.05.2022 Zadatak 4”.
//    Za ovaj zadatak trebace vam nextLine metoda sa scannerom.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite zahtev: ");
        String zahtev = s.nextLine();

        while (!zahtev.equals("Hvala!")) {
            if (!zahtev.startsWith("Molim te")) {
                System.out.print("Unesite zahtev: ");
                zahtev = s.nextLine();
            } else {
                System.out.println("Dogovoreno! ");
                System.out.print("Unesite zahtev: ");
                zahtev = s.nextLine();
            }
        }
        System.out.println("Cao");
    }
}
