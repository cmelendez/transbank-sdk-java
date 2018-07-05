package cl.transbank.onepay.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class TransactionCreateResponse extends BaseResponse {
    private Result result;

    @Getter
    @Setter
    @ToString
    public class Result {
        private String occ;
        private long ott;
        private String externalUniqueNumber;
        private String qrCodeAsBase64;
    }
}
