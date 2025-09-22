public class BRTax implements TaxPolicy {
    public String countryCode() { 
        return "BR"; 
    }

    public double calculate(double base) {
        return base * 0.18 + base * 0.09; 
    }
}
