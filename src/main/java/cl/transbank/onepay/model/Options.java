package cl.transbank.onepay.model;

import cl.transbank.onepay.Onepay;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class Options {
    private String apiKey;
    private String appKey;
    private String sharedSecret;

    public Options setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public Options setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    public Options setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
        return this;
    }

    public static Options getDefaults() {
        return new Options(Onepay.getApiKey(), Onepay.getAppKey(), Onepay.getSharedSecret());
    }
}