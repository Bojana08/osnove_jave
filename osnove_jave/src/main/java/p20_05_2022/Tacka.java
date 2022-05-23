package p20_05_2022;

public class Tacka {
    public int x;
    public int y;

    public Tacka (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tacka () {

    }

    public void stampaj () {
        System.out.println("Koordinate x i y su: " + this.x + ", " + this.y);
    }

}
