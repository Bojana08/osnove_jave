package v01_06_2022;

import java.util.ArrayList;
import java.util.HashMap;

public class UrlBuilder {

    private String baseUrl;
    private ArrayList<KeyValuePair> keyValuePairs = new ArrayList<KeyValuePair>();

    public UrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void addKeyValuePair(KeyValuePair keyValuePair) {
        this.keyValuePairs.add(keyValuePair);
    }

    public void deleteKeyValuePair(String key) {
        this.keyValuePairs.remove(key);
    }

    public String urlBuilder() {
        String url = this.baseUrl;
        String keyValuePair = "";
        if (this.keyValuePairs.size() > 0) {
            for (int i = 0; i < keyValuePairs.size(); i++) {
                if (i == keyValuePairs.size() - 1) {
                    keyValuePair = keyValuePair.concat(keyValuePairs.get(i).generateParamString());
                } else {
                    keyValuePair = keyValuePair.concat(keyValuePairs.get(i).generateParamString().concat("&"));
                }
            }
        }
        if (this.keyValuePairs.size() == 0) {
            return url;
        }
        return url.concat("?").concat(keyValuePair);
    }
}
