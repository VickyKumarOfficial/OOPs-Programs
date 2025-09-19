package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            int c = a / b;
        } catch(ArithmeticException e) {
            System.out.println("Denominator can not be zero!");
        }
    }
}
