import java.util.Scanner;

public class Email_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mail = "vickykofficial890@gmail.com";
        // System.out.print("Enter the mail I'd: ");
        // String mail = sc.nextLine();

        if (mail.contains("@")) {
            String username = mail.substring(0, mail.indexOf('@'));
            System.out.println("Username: " + username);
    
            String domain = mail.substring(18);
            System.out.println("domain: " + domain);
        } else {
            System.out.println("The given mail is invalid!");
        }

        sc.close();
    }    
}
