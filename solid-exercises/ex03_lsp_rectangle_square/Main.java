public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6,12);

        System.out.println("Area do retangulo: " + rectangle.area());

        rectangle.setAltura(8);
        rectangle.setLargura(4);
        System.out.println("Area do retangulo nova: " + rectangle.area());

        Square square = new Square(9);
        System.out.println("Area do quadrado: " + square.area());

        square.setSide(18);
        System.out.println("Area do quadrado nova: " + square.area());
    }
}








