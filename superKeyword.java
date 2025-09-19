class A {
    public A() {
        super();
        System.out.println("It's A");
    }
    public A(int n) {
        super();
        System.out.println("It's an int A: ");
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("It's B");
    }
    public B(double a, int n) {
        super();
        System.out.println("It's double B");

    }
    public B(int n) {
        // this(); // If used this keyword. It will call all the constructor in the class based upon the param passing.
                   // In this case we are not passing any param so 'public B()' will execute.
        super();   //The moment we pass a param in 'super' it will look for param method in parent class.
        // So it will first print the main class param constructor and then comes here.
        System.out.println("It's an int B: ");
    }
}
// So, as we know be default every class extends to Object that is multi-lvl Inheritance.
public class superKeyword {
    public static void main(String[] args) {
        B a = new B(5);
    }
}
