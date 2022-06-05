package d03_06_2022;

public class SuperKartica {

//    Kreirati klasu SuperKartica koja ima:
//-	broj kartice
//-	ime i prezime vlasnika
//-	popust (200, 500, … )
//-	konstuktore (default-ni i sa parametrima)
//-	gettere i settere
//-	metodu stampaj koja stampa karticu u formatu:
//    (broj kartice), (ime i prezime)

    private int brojKartice;
    private String punoImeVlasnika;
    private int popust;

    public SuperKartica() {}

    public SuperKartica(int brojKartice, String punoImeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public int getPopust() {
        return popust;
    }

    public void stampa() {
        System.out.println(this.brojKartice + ", " + this.punoImeVlasnika);
    }

}
