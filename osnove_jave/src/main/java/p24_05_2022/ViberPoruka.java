package p24_05_2022;

public class ViberPoruka {

    private String tekstPoruke;
    private String vremePoslatePoruke;
    private ViberKorisnik posiljalac;
    private ViberKorisnik primalac;
    private ViberReakcija reakcija;

    public ViberPoruka(String tekstPoruke, String vremePoslatePoruke, ViberKorisnik posiljalac, ViberKorisnik primalac,
                       ViberReakcija reakcija) {
        this.tekstPoruke = tekstPoruke;
        this.vremePoslatePoruke = vremePoslatePoruke;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija = reakcija;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVremePoslatePoruke() {
        return vremePoslatePoruke;
    }

    public void setVremePoslatePoruke(String vremePoslatePoruke) {
        this.vremePoslatePoruke = vremePoslatePoruke;
    }

    public ViberKorisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(ViberKorisnik posiljalac) {
        this.posiljalac = posiljalac;
    }

    public ViberKorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik primalac) {
        this.primalac = primalac;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }

    public void stampa() {
        System.out.print("From: " + this.posiljalac.getPunoIme() + " * ");
        if (this.posiljalac.isKorisnikJeAktivan()) {
            System.out.print("Active Now");
        } else {
            System.out.print("Not Active");
        }
        System.out.println(" - at " + this.vremePoslatePoruke);
        System.out.println("To: " + this.primalac.getPunoIme());
        System.out.print(this.tekstPoruke + " :");
        if (this.reakcija != null) {
            System.out.println(this.reakcija.getEmoji());
        }
    }
}
