package d16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
//        / / / / /

        stampajKarakter(5, "/");
        System.out.println();
        stampajKarakter(8, "*");
    }
    static void stampajKarakter(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
    }
}
