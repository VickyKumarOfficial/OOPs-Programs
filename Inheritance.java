class Animal {
    boolean isAlive;

    Animal() {
        isAlive = true;
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}
//To access the attributes from parent use 'extends'
class Dog extends Animal{
    /*
        @Override
        void eat() {
            System.out.println("Dog is eating");
        }
    */
    // With overriding this it will be printing this void eat statement.
}

// Even both the child classes are empty but they can inherit the attributes from parent class.

class Cat extends Animal{
    
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println(a.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        cat.eat();
        dog.eat();
    }
}
