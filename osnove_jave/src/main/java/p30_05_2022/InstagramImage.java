package p30_05_2022;

import java.util.ArrayList;

public class InstagramImage {
//    Kreirati klasu InstagramImage koja ima:
//●	niz tagova
//●	dimenziju slike
//●	putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//●	metodu dodajTag

    private ArrayList<InstagramTag> tagovi = new ArrayList<InstagramTag>();
    private String dimenzijaSlike;
    private String putanjaDOSlike;

    public InstagramImage(){}

    public InstagramImage(String dimenzijaSlike, String putanjaDOSlike) {

        this.dimenzijaSlike = dimenzijaSlike;
        this.putanjaDOSlike = putanjaDOSlike;
    }

    public ArrayList<InstagramTag> getTagovi() {
        return tagovi;
    }


    public String getDimenzijaSlike() {
        return dimenzijaSlike;
    }

    public String getPutanjaDOSlike() {
        return putanjaDOSlike;
    }

    public void dodajTag(InstagramTag tag) {
        this.tagovi.add(tag);
    }
}
