package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{

//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//-	kaucija za flasu
//-	atribut koji kaze da li se za flasu placa kaucija
//-	osnovna cena
//-	gettere i setter za atribute
//-	konstuktori koji su vam potrebni
//-	racuna cenu
//-	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//-	ako se ne placa, (osnovna cena) * 1.2
//-	metoda stampaj stampa sve podatke iz klase staklena flasa.

    private int kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {}

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina,
                            int kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double cenaArtikla() {
        if (daLiSePlacaKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        }
        return this.osnovnaCena * 1.2;
    }

    public void stampa() {
        System.out.println("Naziv artikla: " + this.nazivArtikla + " - " + this.tezinaPakovanja() +
                " - " + this.barkod);
        System.out.println("Cena: " + this.cenaArtikla());
        if (daLiSePlacaKaucija) {
            System.out.println("Placa se kaucija.");
        } else {
            System.out.println("Ne placa se kaucija.");
        }
    }

}
