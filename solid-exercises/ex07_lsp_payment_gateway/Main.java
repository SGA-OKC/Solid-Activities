public class Main {

    public static void main(String[] args) {
        
        PaymentGateway gateway = new RealPaymentGateway();
        PaymentResult result = gateway.cobranca(10.45);

        System.out.println("Pagamento finalizado? " + result.success);
        System.out.println("Auroizado: " + result.authCode);
        System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        FreeTrialGateway freeTrial = new FreeTrialGateway();
        freeTrial.testeGratuito("vitorlo.gmail.com");
    }
}