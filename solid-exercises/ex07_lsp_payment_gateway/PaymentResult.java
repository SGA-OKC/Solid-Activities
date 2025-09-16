class PaymentResult {
    boolean success;
    String authCode;

    public PaymentResult(boolean success,String authCode) {
        this.success = success;
        this.authCode = authCode;
    }
}