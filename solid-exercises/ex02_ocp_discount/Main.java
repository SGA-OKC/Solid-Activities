public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double amount = 500.0;

        double blackFridayDiscount = calculator.calcular("BLACK_FRIDAY", amount);
        double coupon10Discount = calculator.calcular("COUPON10", amount);
        double vipDiscount = calculator.calcular("VIP", amount);

        System.out.println("Descontos Black Friday: " + blackFridayDiscount);
        System.out.println("Descontos COUPON10: " + coupon10Discount);
        System.out.println("Descontos VIP: " + vipDiscount);
    }
}