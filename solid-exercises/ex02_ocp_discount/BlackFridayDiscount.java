public class BlackFridayDiscount implements DiscountPolicy {
    
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.3;
    }
}