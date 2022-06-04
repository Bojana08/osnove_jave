package v01_06_2022;

public class KeyValuePair {

    private String key;
    private String value;

    public KeyValuePair() {}

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String generateParamString(){
        return this.key.concat("=".concat(this.value));
    }

}
