package d23_05_2022;

public class Vaga {

//    Kreirati klasu Vaga koja ima:
//-	merna jedinica (kg ili lb)
//-	proizvod (proizvod koji se meri)
//-	TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
// -	default-ni konstuktor
//-	getteri i setteri za sve atribute
//-	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena.
// -	metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//     (sifra) - (naziv)
//    (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//    Ukupno: (ukupna cena)

    private String mernaJedinica;
    private Proizvod proizvod;

    public Vaga (){}

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu (double tezinaProizvoda) {
        if (this.mernaJedinica.equals("kg")) {
            return tezinaProizvoda * this.proizvod.getCenaKg();
        }
        return tezinaProizvoda * this.proizvod.getCenaLb();
    }

    public void stampa(double tezinaProizvoda) {
        this.proizvod.stampa();
        if (this.mernaJedinica.equals("kg")) {
        System.out.print(this.proizvod.getCenaKg() + " ");
        }
        if (this.mernaJedinica.equals("lb")) {
        System.out.print(this.proizvod.getCenaLb() + " ");
        }
        System.out.println(this.mernaJedinica + " * " + tezinaProizvoda);
        System.out.println("Ukupno: " + sracunajCenu(tezinaProizvoda));
    }
}
