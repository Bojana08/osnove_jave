package p16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {

//  3.Napisati metodu koja stampa zvezdicu sa razmakom. U glavnom programu je potrebno odstampati sledecu sliku:
//  *  *  *
//  *  *
//  *
//    Primer 2:
//    * * * * * *
//    * * * * *
//	* * * *
//	* * *
//	* *
//	*

        for (int i = 0; i < 6; i++) {
            Star();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            Star();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            Star();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            Star();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            Star();
        }
        System.out.println();
        Star();
    }
    static void Star() {
        System.out.print("* ");
    }
}
