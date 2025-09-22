public class USTax implements TaxPolicy {
    public String countryCode() { 
        return "US";
    }

    public double calculate(double base) {
        return base * 0.07;
    }
}
