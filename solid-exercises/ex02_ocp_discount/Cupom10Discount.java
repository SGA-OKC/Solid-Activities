public class Cupom10Discount implements DiscountPolicy {
    
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}