class fedf {
    static int numoffriends = 0;
    // With static keyword this keyword is used commonly used by every constructors
    // rather than accessing it independently.
    String name;
    
    fedf(String name) {
        this.name = name;
        numoffriends++;
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        // fedf f1 = new fedf("Dwarkesh");
        // fedf f2 = new fedf("Smruti");
        // fedf f3 = new fedf("Harshitha");
        // fedf f4 = new fedf("Jahnavi");
        // fedf f5 = new fedf("Patro chemicals");
        // fedf f6 = new fedf("Me");
        System.out.println(fedf.numoffriends);
        System.out.println(fedf.numoffriends);
        System.out.println(fedf.numoffriends);
        System.out.println(fedf.numoffriends);
        System.out.println(fedf.numoffriends);
    }
}
