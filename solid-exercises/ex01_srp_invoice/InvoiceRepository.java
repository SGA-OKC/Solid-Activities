public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Salvando fatura no banco: " + invoice.getId());
    }
}
