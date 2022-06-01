package p31_05_2022_1_zadatak;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Petar Petrovic", "31424424", "111143", 10000);
        Student s2 = new Student("Jovan Jovanovic", "32424", "3132", 15000);

        Profesor p = new Profesor("Dragan Dragovic", "332323", "Matematika", 70000);
        Profesor p1 = new Profesor("Nikola Nikolic", "2424", "Engleski", 70000);

        s.stampa();
        s.uplatiSkolarinu(2000);
        s.stampa();
        System.out.println();

        p.stampa();
        p.povecajPlatu(10);
        p.stampa();

    }
}
