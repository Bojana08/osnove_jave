package v01_06_2022;

public class Main {
    public static void main(String[] args) {

//        Kreirati klasu KeyValuePair koja ima:
//        key - string
//        value - string
//        Konstuktor sa parametrima
//        Defaultni konstuktor
//        Metodu generateParamString koja generise i vraca String u formatu (OVA METODA NE STAMPA)
//        key=value
//        Kreirati klasu UrlBuilder koja ima:
//        baseUrl
//        niz key value parova
//        Konstuktor koji setuje baseUrl
//        getter za baseUrl
//        metodu za dodavanje key value para
//        metodu za brisanje key value para, metoda kao parametar key vrednost po kojoj se izvrsi pretraga u nizu i izbaci par koji ima prosledjen key
//        metodu za generianje linka. Metoda generise String i vraca ga u formatu:
//        baseUrl?key1=value1&key2=value2
//        Ukoliko UrlBuilder nema nijedan par, metoda vraca samo baseUrl (bez ?)
//        U mainu kreirati url
//        http://www.example.com/somepage/index.html?fullName=Milan&lastName=Jovanovic&age=27
//        Naravno probajte i brisanje

        KeyValuePair k = new KeyValuePair("firstName", "Bojana");
        KeyValuePair k1 = new KeyValuePair("lastName", "Raojkovic");
        KeyValuePair k2 = new KeyValuePair("age", "29");
        UrlBuilder u = new UrlBuilder("http://www.example.com/somepage/index.html");

        u.addKeyValuePair(k);
        u.addKeyValuePair(k1);
        u.addKeyValuePair(k2);
        u.urlBuilder();

        System.out.println(u.urlBuilder());

    }
}
