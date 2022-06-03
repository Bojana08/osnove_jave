package p02_06_2022_zadatak_4;

public class JednakostranicniTrougao extends Figura{
    private int a;

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return (a * a) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3*a;
    }
}
