package d20_05_2022;

public class MainFacebookPost {

    public static void main(String[] args) {

        d20_05_2022.FacebookPost postJedan = new d20_05_2022.FacebookPost("Petar Petrovic",
                "Ana Milosevic", "Zdravo");
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
        postDva.dislike();
        postDva.like();
        postDva.dislike();

        System.out.println();
        postDva.print();
    }

}
