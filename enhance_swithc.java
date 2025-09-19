import java.util.Scanner;
public class enhance_swithc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any week day: ");
        String day = sc.nextLine();
        String days = day.toLowerCase();

        // No need of break statements and default statement;
        // switch (days) {
        //     case "monday" -> System.out.println("It's a Week day ☹️");
        //     case "tuesday" -> System.out.println("It's a Week day ☹️");
        //     case "wednesday" -> System.out.println("It's a Week day ☹️");
        //     case "thrusday" -> System.out.println("It's a Week day ☹️");
        //     case "friday" -> System.out.println("It's a Week day ☹️");
        //     case "saturday" -> System.out.println("It's a Weekend 😁");
        //     case "sunday" -> System.out.println("It's a Weekend 😁");
        // }
        // Alternate in short
        switch (days) {
            case "monday", "tuesday", "wednesday", "thrusday", "friday" -> System.out.println("It's a Week day ☹️");
            case "saturday", "sunday" -> System.out.println("It's a Weekend 😁");
        }

        sc.close();
    }    
}
