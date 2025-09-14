public class InvoiceNotifier {
    public void notify(Invoice invoice) {
        System.out.println("Cliente esta sendo notificado da fatura: " + invoice.getId());
    }
}
