
class RealPaymentGateway implements PaymentGateway {

    @Override
    public PaymentResult cobranca(double amount) {
        String cod = "AUTORIZANDO " + System.currentTimeMillis();
        return new PaymentResult(true, cod);
    }
}