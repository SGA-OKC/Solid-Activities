class InvoiceService {
    double calculateTotal(java.util.List<Double> items, double tax) {
        double sum = 0;
        for (Double i : items) sum += i;
        return sum * (1 + tax);
    }
    void saveToDb(Invoice inv) {
        try (java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/app","user","pass")) {
            var ps = conn.prepareStatement("INSERT INTO invoice(id,total) VALUES (?,?)");
            ps.setString(1, inv.getId());
            ps.setDouble(2, inv.getTotal());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    void sendEmail(Invoice invoice) {
        System.out.println("Email sent to " + invoice.getCustomerEmail());
    }
}