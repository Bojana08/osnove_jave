package d30_05_2022_zadatak_1;

public class MainIspitStudent {
    public static void main(String[] args) {

        Ispit matematika = new Ispit("Matematika", 7, "Petar Petrovic");
        Ispit engleski = new Ispit("Engleski", 10, "Ana Jovanovic");
        Ispit sociologija = new Ispit("Sociologija", 9, "Jovan Jovanovic");
        Ispit hemija = new Ispit("Hemija", 9, "Dragan Kostic");
        Ispit fizika = new Ispit("Fizika", 5, "Darko Nikolic");

        Student s11145 = new Student("11145", "Ivan Ivanovic", "osnovne studije");
        s11145.dodajIspit(matematika);
        s11145.dodajIspit(engleski);
        s11145.dodajIspit(sociologija);
        s11145.dodajIspit(hemija);
        s11145.dodajIspit(fizika);

        s11145.stampa();

    }
}
