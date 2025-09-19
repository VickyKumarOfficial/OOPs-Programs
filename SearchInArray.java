import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no[] = {6, 4, 2, 8, 4, 9, 0, 1};
        int find = 6;
        /*
        for (int i : no) {
            if (find == no[i]) {
                System.out.printf("Element %d found at index: %d", find, i);
                break;
            } else System.out.printf("Elemnt %d not found in the given array!", find);
        }
        */
        for(int i = 0; i < no.length; i++) {
            if (find == no[i]) {
            System.out.printf("Element %d found at index: %d", find, i);
            break;
            } else System.out.printf("Elemnt %d not found in the given array!\n", find);
        }
        
        // For finding in a string:
        String fruit[] = {"Mango", "Apple", "Orange", "Banana"};
        System.out.print("\nEnter the Fruit need to be serached: ");
        String Tofind = sc.nextLine();
        for(int i = 0; i < fruit.length; i++) {
            if(fruit[i].equals(Tofind)) {
                System.out.printf("Element found at index %d", i+1);
                break;
            } else System.out.printf("Element not found at index %d\n", i + 1);
        }
        
        sc.close();
    }
}
