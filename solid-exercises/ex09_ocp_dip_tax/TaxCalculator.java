public class TaxCalculator {
    private final TaxPolicyResolver resolver;

    public TaxCalculator(TaxPolicyResolver resolver) {
        this.resolver = resolver;
    }

    public double calculate(String countryCode, double base) {
        TaxPolicy policy = resolver.resolve(countryCode);
        return policy.calculate(base);
    }
}
