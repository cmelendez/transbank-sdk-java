package cl.transbank.transaccioncompleta.model;

import cl.transbank.model.WebpayApiRequest;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FullTransactionCommitResponse extends WebpayApiRequest {
    private String vci;
    private double amount;
    private String status;
    private String buyOrder;
    private String sessionId;
    private String cardNumber;
    private String accountingDate;
    private String transactionDate;
    private String authorizationCode;
    private String paymentTypeCode;
    private byte responseCode;
    private byte installmentsNumber;
    private String balance;
}
