import java.util.Scanner;

public class EnhancedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String food[];
        System.out.print("Enter the no. of food items: ");
        int size = sc.nextInt();
        food = new String[size];
        sc.nextLine();
        System.out.println("Enter all the no. of food items: ");
        for (int i = 0; i < food.length; i++) {
            food[i] = sc.nextLine();
        }
        System.out.println("\n--------------------\nYour Food items were:\n--------------------\n");
        // Enhanced for loop:
        for (String foods : food) { // This loop doesn't need counters to iterate.
        // The new string 'foods' will iterate on the basis of storing the no. of elements present in the 'food' String and iterates for that no. of time specifically.
            System.out.println(foods);
        }

        sc.close();
    }
}
