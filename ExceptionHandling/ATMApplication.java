public class ATMApplication {
    private int correctPin = 1234;
    private double balance = 5000.0;

    class InsufficientBalance extends Exception {
        public InsufficientBalance(String message) {
            super(message);
        }
    }

    public void withdraw(int enteredPin, double amount) throws InsufficientBalance {
        if (enteredPin != correctPin) {
            throw new SecurityException("Incorrect PIN entered.");
        }
        if (amount > balance) {
            throw new InsufficientBalance("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        ATMApplication atm = new ATMApplication();
        int pin = 1234; // You can change this to test wrong PIN
        double amount = 6000.0; // You can change this to test insufficient balance

        try {
            atm.withdraw(pin, amount);
        } catch (SecurityException se) {
            System.out.println("Security Error: " + se.getMessage());
        } catch (InsufficientBalance ib) {
            System.out.println("Transaction Error: " + ib.getMessage());
        } finally {
            System.out.println("Thank you for using the ATM.");
        }
    }
}
