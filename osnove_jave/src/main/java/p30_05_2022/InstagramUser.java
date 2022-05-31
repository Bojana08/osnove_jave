package p30_05_2022;

public class InstagramUser {
//    Kreirati klasu InstagramUser koja ima:
//●	username
//●	Ime i prezime
//●	email
//●	Sve sto vam dalje zatreba dopunite klasu.


    private String userName;
    private String punoIme;
    private String email;

    public InstagramUser(){}

    public InstagramUser(String userName, String punoIme, String email) {
        this.userName = userName;
        this.punoIme = punoIme;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getEmail() {
        return email;
    }
}
