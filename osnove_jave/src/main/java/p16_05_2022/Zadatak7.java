package p16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {

//        7.Zadatak
//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//         Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11

        int x = suprotanBroj(-15);
        System.out.println("Broj je: " + x);

    }
    static int suprotanBroj (int a) {
            return a * -1;
        }
    }


