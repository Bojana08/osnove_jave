package d24_05_2022;

public class ZeleniKarton {

//1.	Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//    (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime

    private String punoImeStudenta;
    private String brIndeksa;
    private String predmet;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(String punoImeStudenta, String brIndeksa, String predmet, String punoImeProfesora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.predmet = predmet;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean ispitPolozen() {
        return this.ocena > 5;
    }

    public void stampaj() {
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.punoImeProfesora);
    }
}
