package d03_06_2022;

import java.util.ArrayList;

public class Korpa {

//    Kreirati klasu Korpa koja ima:
//-	niz ambalaza
//-	metodu dodaj ambalazu
//-	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//-	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//-	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar
//    funkcije se prima Super karticu iz koje se cita popust.


    private ArrayList<Ambalaza>  proizvodi = new ArrayList<Ambalaza>();

    public Korpa() {}

    public void dodajAmbalazu(Ambalaza ambalaza) {
        this.proizvodi.add(ambalaza);
    }

   public void izbaciAmbalazu(String ambalaza) {
        for (int i = 0; i < this.proizvodi.size(); i++) {
            if (this.proizvodi.get(i).getNazivArtikla().equals(ambalaza)) {
                this.proizvodi.remove(i);
            }
        }
    }

    private double cenaAmbalazaSaPopustom(int popust) {
        double suma = 0;
        for (int i = 0; i < this.proizvodi.size(); i++) {
            suma = suma + this.proizvodi.get(i).cenaArtikla();
        }
        return suma - popust;
    }

    public double ukupnaCenaKorpe(SuperKartica superKartica) {
        return cenaAmbalazaSaPopustom(superKartica.getPopust());
    }

}
