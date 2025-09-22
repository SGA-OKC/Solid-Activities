import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaxPolicyResolver resolver = new TaxPolicyResolver(Arrays.asList(
            new BRTax(),
            new USTax(),
            new DEXTax()
        ));

        TaxCalculator calculator = new TaxCalculator(resolver);

        double baseAmount = 1000.0;

        System.out.println("BR tax: " + calculator.calculate("BR", baseAmount));
        System.out.println("US tax: " + calculator.calculate("US", baseAmount));
        System.out.println("DE tax: " + calculator.calculate("DE", baseAmount));
        System.out.println("ZZ tax: " + calculator.calculate("ZZ", baseAmount));
    }
}
