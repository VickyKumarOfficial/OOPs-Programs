public class StudentClass {
    public static class Student {   // This class can also be made in the psvm by removing 'public static' keyword.
        String Name;
        long RollNo;
        double percentage;
    }
    
    public static void dislpay(String name, long rn, double p) {    //This is how taking values in functions
        System.out.println(name);
        System.out.println("Roll no: " + rn);
        System.out.println("He got " + p + "%");
    }

    public static void output(Student s3) { //Whole class will be passed in this function by only 1 variable.
        System.out.println("\n" + s3.Name);
        System.out.println("Roll number: " + s3.RollNo);
        System.out.println("He got only: " + s3.percentage + "%. LOL! XD");
    } 

    public static void main(String[] args) {
        
        Student s1 = new Student();  // Decalaration for the memory.
        
        s1.Name = "Nicky ";  // These 's1.<entity name> is for initializing the values in that memory.'
        s1.RollNo = 2410030111l;
        s1.percentage = 93.5;
        
        System.out.println(s1.Name + "Kumar");
        System.out.println("Roll number: " + s1.RollNo);
        System.out.println("He Got " + s1.percentage + "%\n");
        
        //similarly more student can be created by assigning with new variable:
        
        Student s2 = new Student();  // Decalaration for the memory.
        
        s2.Name = "Dick Dubey ";  // These 's1.<entity name> is for initializing the values in that memory.'
        s2.RollNo = 2410030021l;
        s2.percentage = 89;
        
        // Displaying details by calling the functions.
        /* 
            display(s2.Name);
            display(s2.RollNo);
            display(s2.percentage);
        */
        // These above calling requires 3 independent functions to be made as only 1 value is passed.
        
        dislpay(s2.Name, s2.RollNo, s2.percentage);        
        
        // Passing class (Student) to function
        Student s3 = new Student();
        s3.Name = "Beeee Shivaa Sai Patro";
        s3.RollNo = 2410030023l;
        s3.percentage = 87;
        output(s3);    // All the values stored in the entities will be passed at once to the output.
    }
}
