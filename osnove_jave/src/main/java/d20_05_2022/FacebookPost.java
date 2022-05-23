package d20_05_2022;

public class FacebookPost {

    public String korisnikKojiJeObjavioPost;
    public String korisnikKomeJeObjavljenPost;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public FacebookPost () {
    }

    public FacebookPost (String korisnikKojiJeObjavioPost, String korisnikKomeJeObjavljenPost, String tekstObjave) {
        this. korisnikKojiJeObjavioPost = korisnikKojiJeObjavioPost;
        this. korisnikKomeJeObjavljenPost = korisnikKomeJeObjavljenPost;
        this.tekstObjave = tekstObjave;
    }

    public void like() {
        this.brojLajkova = this.brojLajkova + 1;
    }

    public void dislike() {
        this.brojLajkova = this.brojLajkova - 1;
        if (brojLajkova < 0) {
            brojLajkova = 0;
        }
    }

    public void share() {
        this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println(this.korisnikKojiJeObjavioPost + " >>> " + this.korisnikKomeJeObjavljenPost);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
    }
}
