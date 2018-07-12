package cl.transbank.onepay.net;

import cl.transbank.onepay.model.BaseRequest;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class GetTransactionNumberRequest extends BaseRequest {
    @NonNull private String occ;
    @NonNull private String externalUniqueNumber;
    @NonNull private long issuedAt;
    private String signature;
}