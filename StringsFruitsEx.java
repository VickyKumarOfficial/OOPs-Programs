public class StringsFruitsEx {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Custard Apple", "Banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%d. " + fruits[i] + "\n", i+1);
        }
    }
}
