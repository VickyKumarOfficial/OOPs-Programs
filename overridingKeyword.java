class Animal {
    void sound() {
        System.out.println("Animal make sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Doggy barks");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Pussy Meows");
    }
}

public class overridingKeyword {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.sound();
        dog.sound();
        cat.sound();

        // With the help of 'overriding' we don't need to create a new method instead we just call the 'sound()'.
    }
}
