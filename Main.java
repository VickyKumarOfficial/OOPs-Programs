public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Model: " + car.model);
        System.out.println("Price: " + car.price);
        System.out.println("Company: " + car.company);
        System.out.println("Production: " + car.inProduction);

        car.stop();
        car.start();
    }
}
