package d18_05_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;
    public void stampaj() {
        System.out.println(this.marka + " klima - mod: " + this.mod + ", temperatura: " + this.temperatura + "C");
    }
}
