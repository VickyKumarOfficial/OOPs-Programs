public class LoginValidation {
    static void validateLogin(String username, String pass) {
        if(!username.equals("admin") || !pass.equals("2410030111")) {
            throw new SecurityException("Invalid username or password!");
        } else System.out.println("Login Successful");
    }    
    public static void main(String[] args) {
        try {
            validateLogin("admin", "2410030111");
        } catch(RuntimeException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
        try {
            validateLogin("admin", "1234");
        } catch(RuntimeException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
