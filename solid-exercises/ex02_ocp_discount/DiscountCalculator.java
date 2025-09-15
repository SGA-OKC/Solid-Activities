
class DiscountCalculator {
    double calcular(String type, double amount) {
        DiscountPolicy policy = DiscountPolicyFactory.getPolicy(type);
        return policy.applyDiscount(amount);
    }
}