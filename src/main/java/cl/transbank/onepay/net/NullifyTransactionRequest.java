package cl.transbank.onepay.net;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class NullifyTransactionRequest extends BaseRequest {
    @NonNull private long nullifyAmount;
    @NonNull private String occ;
    @NonNull private String externalUniqueNumber;
    @NonNull private String authorizationCode;
    @NonNull private long issuedAt;
    private String signature;
}