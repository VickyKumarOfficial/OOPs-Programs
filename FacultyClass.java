import Helloworld.Faculty;

public class FacultyClass {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.name = "Shahin Fatima";
        f1.Id = 24100;
        f1.dept = "CSE";
        System.out.println("Faculty name: " + f1.name + "\nI'd: "  + f1.Id + "\nDepartemnt: " + f1.dept + "\nSalary is Private.");
        System.out.println("Salary is " + f1.getsalary());
        f1.setmarry(1);
        System.out.println("Marital Status: " + f1.marry());
    }
}
