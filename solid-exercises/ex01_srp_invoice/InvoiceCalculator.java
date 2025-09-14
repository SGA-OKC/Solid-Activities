public class InvoiceCalculator {
    public double calculate(Invoice invoice) {
        return invoice.getAmount() + (invoice.getAmount() * 0.1); 
    }
}
