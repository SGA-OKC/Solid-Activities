public class DEXTax implements TaxPolicy {
    public String countryCode() { 
        return "DE"; 
    }

    public double calculate(double base) {
        return base * 0.19; 
    }
}
