
public class DiscountPolicyFactory {

    public static DiscountPolicy getPolicy(String type) {
        switch (type) {
            case "BLACK_FRIDAY":
                return new BlackFridayDiscount();
            case "COUPON10":
                return new Cupom10Discount();
            case "VIP":
                return new VIPDiscount();
            default:
                throw new IllegalArgumentException("Desconto não encontrado");
        }
    }
}