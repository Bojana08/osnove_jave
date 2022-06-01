package p31_05_2022_1_zadatak;

public class Student extends Osoba{
    private String brojIndeksa;
    private int dugZaSkolarinu;

    public Student(String punoIme, String jmbg, String brojIndeksa, int dugZaSkolarinu) {
        super(punoIme, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void uplatiSkolarinu(int vrednost) {
        if (this.dugZaSkolarinu >= vrednost) {
            this.dugZaSkolarinu = this.dugZaSkolarinu - vrednost;
        }
    }

    @Override
    public void stampa(){
        super.stampa();
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);
    }
}
