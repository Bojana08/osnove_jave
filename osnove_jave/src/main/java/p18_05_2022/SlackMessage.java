package p18_05_2022;

public class SlackMessage {
    public String poruka;
    public String osoba;
    public String vreme;

    public static void main(String[] args) {
        SlackMessage prva = new SlackMessage();
        SlackMessage druga = new SlackMessage();

        prva.poruka = "Cao";
        prva.osoba = "Petar Petrovic";
        prva.vreme = "26.08.2021 18:55";
        System.out.println(prva.osoba + " - " + prva.vreme);
        System.out.println(prva.poruka);

        druga.poruka = "Pozdrav";
        druga.osoba = "Jovan Jovanovic";
        druga.vreme = "28.08.2021 16:55";
        System.out.println(druga.osoba + " - " + druga.vreme);
        System.out.println(druga.poruka);

    }
}
