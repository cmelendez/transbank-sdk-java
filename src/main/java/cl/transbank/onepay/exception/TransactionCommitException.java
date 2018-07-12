package cl.transbank.onepay.exception;

public class TransactionCommitException extends TransbankException {
    public TransactionCommitException() {
    }

    public TransactionCommitException(int code, String message) {
        super(code, message);
    }

    public TransactionCommitException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public TransactionCommitException(Throwable cause) {
        super(cause);
    }

    public TransactionCommitException(int code, Throwable cause) {
        super(code, cause);
    }

    public TransactionCommitException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}