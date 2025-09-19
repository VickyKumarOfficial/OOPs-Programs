class User {
    String name;
    String mail;
    int age;

    User(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }
    User(String name) {
        this.name = name;
    }
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OverloadConstruct {
    public static void main(String[] args) {
        User u1 = new User("Pavan", "pavan69@gmail.com", 35);
        System.out.println("Name: " + u1.name + ".\nMail: " + u1.mail + ".\nAge: " + u1.age);
        
        User u2 = new User("Rama Raaaoooooooo");
        System.out.println("Name: " + u2.name);
        
        User u3 = new User("Sasidar", 69);
        System.out.println("Name: " + u3.name + ".\nAge: " + u3.age);
    }
}
