package d03_06_2022;

public class Tetrapak extends Ambalaza{

//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//-	atribut koji kaze da li se moze reciklirati
//-	osnovna cena
//-	gettere i setter za atribute
//-	konstuktori koji su vam potrebni
//-	racuna cenu tako da ispunjava uslova:
//-	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//-	ako nije u cenu ulazi samo osnovna cena
//-	metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean reciklaza;
    private int osnovnaCena;

    public Tetrapak() {}

    public Tetrapak(String barkod,
                    String nazivArtikla,
                    int netoTezina,
                    int brutoTezina,
                    boolean reciklaza,
                    int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public double cenaArtikla() {
        if (reciklaza) {
            return tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    public void stampa() {
        System.out.println("Naziv artikla: " + this.nazivArtikla + " - " + this.tezinaPakovanja() +
                " - " + this.barkod);
        System.out.println("Cena: " + this.cenaArtikla());
        if (reciklaza) {
            System.out.println("Reciklira se.");
        } else {
            System.out.println("Ne reciklira se.");
        }
    }

}
