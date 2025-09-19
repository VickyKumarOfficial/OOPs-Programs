public class Main {
    static void checkAge(int age) {
        if(age < 18) throw new ArithmeticException("Access denied - You must be 18 or more!");
        else System.out.println("Access Granted");
    }
    public static void main(String[] args) {
        try {
            checkAge(18);
        } catch(ArithmeticException e) {
            System.out.println("Exception caught: ");
        }
    }
}
