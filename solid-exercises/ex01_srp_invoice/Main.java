

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("FATURA-001", 100.0);

        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculate(invoice);

        System.out.println("Total calculado: " + total);

        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);

        InvoiceNotifier notifier = new InvoiceNotifier();
        notifier.notify(invoice);
    }
}
