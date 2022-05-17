package d16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {

//        5. (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//        Napomena: Resiti bez koriscenja petlji.

        int rezultat = izbroji(5, 10);
        System.out.println("Rezultat je: " + rezultat);
        rezultat = izbroji(-5, 1);
        System.out.println("Rezultat je: " + rezultat);
        rezultat = izbroji(5, -10);
        System.out.println("Rezultat je: " + rezultat);
        rezultat = izbroji(-7, -10);
        System.out.println("Rezultat je: " + rezultat);
        rezultat = izbroji(5, 5);
        System.out.println("Rezultat je: " + rezultat);
    }
    static int izbroji(int m, int n) {
        if (n > m) {
            return (n - m) - 1;
        } else if (m > n) {
            return (m - n) - 1;
        } else {
            return 0;
        }
    }
}
