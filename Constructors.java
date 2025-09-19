class Student {
    String na;
    int age;
    double cgpa;
    boolean isEnrolled;

    Student(String name, int age, double cgpa) {    //Constructor to take these args.
        this.na = name;
        this.age = age;
        this.cgpa = cgpa;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Shiva", 18, 8.5);
        Student s2 = new Student("Dwarkesh", 17, 9.01);
        
        System.out.println("Name: " + s1.na + ".\nAge: " + s1.age+ ".\nCGPA:  " + s1.cgpa);
        System.out.println("Name: " + s2.na + ".\nAge: " + s2.age+ ".\nCGPA:  " + s2.cgpa);

    }
}
