public class DefaultTaxPolicy implements TaxPolicy {
    @Override
    public String countryCode() {
        return "DEFAULT";
    }

    @Override
    public double calculate(double base) {
        return 0.0;
    }
}
