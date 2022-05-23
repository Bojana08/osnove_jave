package d19_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost postJedan = new FacebookPost();

        postJedan.korisnikKojiJeObjavioPost = "Petar Petrovic";
        postJedan.korisnikKomeJeObjavljenPost = "Jovan Jovanovic";
        postJedan.tekstObjave = "Zdravo";
        postJedan.brojLajkova = 3;
        postJedan.brojDeljenja = 0;
        postJedan.print();

        postJedan.like();
        postJedan.like();
        postJedan.like();
        postJedan.share();
        postJedan.share();
        postJedan.dislike();

        System.out.println();
        postJedan.print();
        System.out.println();

        FacebookPost postDva = new FacebookPost();

        postDva.korisnikKojiJeObjavioPost = "Milos Petrovic";
        postDva.korisnikKomeJeObjavljenPost = "Nikola Nikolic";
        postDva.tekstObjave = "Zdravo";
        postDva.brojLajkova = 0;
        postDva.brojDeljenja = 0;
        postDva.print();

        postDva.share();
        postDva.share();
        postDva.dislike();
        postDva.like();
        postDva.like();
        postDva.like();
        postDva.dislike();

        System.out.println();
        postDva.print();

    }
}
