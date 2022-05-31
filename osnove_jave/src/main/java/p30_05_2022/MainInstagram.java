package p30_05_2022;

import java.util.ArrayList;

public class MainInstagram {
    public static void main(String[] args) {

    InstagramUser user1 = new InstagramUser("perap", "Petar Petrovic", "pera@gmail.com");
    InstagramTag tag1 = new InstagramTag(50, 50, user1);
    InstagramTag tag2 = new InstagramTag(80, 80, user1);


    InstagramImage slika1 = new InstagramImage(

            "1080x720",
            "instagram.com/korsnik-pera/profilna.jpg");

    InstagramImage slika2 = new InstagramImage(

            "1080x720",
            "instagram.com/korsnik-pera/profilna.jpg"
    );


    InstagramPost post1 = new InstagramPost();
    post1.dodajSliku(slika2);

    }
}
