package p30_05_2022;

public class InstagramTag {
//    Kreiarti klasu InstagramTag koja ima:
//●	x koordinatu na slici
//●	y koordinatu na slici
//●	usera koji je tagovan

    private int x;
    private int y;
    private InstagramUser userKojiJeTagovan;

    public InstagramTag() {}

    public InstagramTag(int x, int y, InstagramUser userKojiJeTagovan) {
        this.x = x;
        this.y = y;
        this.userKojiJeTagovan = userKojiJeTagovan;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public InstagramUser getUserKojiJeTagovan() {
        return userKojiJeTagovan;
    }

    public void setUserKojiJeTagovan(InstagramUser userKojiJeTagovan) {
        this.userKojiJeTagovan = userKojiJeTagovan;
    }
}
