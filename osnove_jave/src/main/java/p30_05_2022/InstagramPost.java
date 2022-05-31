package p30_05_2022;

import java.util.ArrayList;

public class InstagramPost {
//    Kreirati klasu InstagramPost koja ima
//●	niz slika
//●	Opis koji moze da se postavi za post
//●	metodu dodajSliku

    private ArrayList<InstagramImage> slike = new ArrayList<InstagramImage>();
    private String opisSlike;

    public InstagramPost() {}

    public InstagramPost(String opisSlike) {

        this.opisSlike = opisSlike;
    }

    public ArrayList<InstagramImage> getSlike() {
        return slike;
    }

    public String getOpisSlike() {
        return opisSlike;
    }

    public void setOpisSlike(String opisSlike) {
        this.opisSlike = opisSlike;
    }

    public void dodajSliku (InstagramImage slika) {
        this.slike.add(slika);
    }
}
