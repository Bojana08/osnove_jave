package p02_06_2022_zadatak_4;

public abstract class Figura {

    public abstract double povrsina();
    public abstract double obim();

    public void stampa() {
        System.out.println("Povrsina je: " + povrsina());
        System.out.println("Obim je: " + obim());
    }
}
