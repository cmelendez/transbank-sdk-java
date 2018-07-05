package cl.transbank.onepay.model;

import cl.transbank.onepay.Onepay;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public abstract class BaseRequest {
    private String apiKey;
    private String appKey;
}
