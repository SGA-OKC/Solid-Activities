public interface TaxPolicy {
    String countryCode();
    double calculate(double base);
}
