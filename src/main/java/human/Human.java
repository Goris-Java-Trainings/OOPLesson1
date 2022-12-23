package human;

public class Human {

    // OOP principles
    // 1. Encapsulation -> capsula       code + behavior
    // 2. Inheritance
    // 3. Polymorphism   (Having Inheritance)
    // 4. Abstraction

    // static variable
    public static Integer age = 76;

    static {
        System.out.println("This is a static block!");
    }

    private String firstName; // null

    private String lastName;

    private String gender = "UNKNOWN";

    private String passportNumber;

    void sing(long duration) {

    }

    // default constructor
    public Human() {
        // constructor
        System.out.println("Created a new human!");
    }

    /*public Human() {
        System.out.println("Create a new Human");
    }*/

    /*public Human(int ageParameter, String passportNumber) {
        this.passportNumber = passportNumber;
        if (ageParameter >= 0) {
            this.age = ageParameter;
        }
//        Main.main(new String[7]);
    }*/

    public Human(String gender, int ageParameter, String firstName, String lastName, String passportNumber) {
        this.age = ageParameter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.passportNumber = passportNumber;

        System.out.println("Create a new Human");
    }

    public static void printAge() {
        System.out.println(age);
    }

    public void walk(int distance, boolean b) {
        System.out.println(age);
        Human human = new Human();
        if (b) {
            System.out.println(getFullName() + " just walked " + distance + " km");
        } else {
            System.out.println(getFullName() + " just walked " + distance + " cm");
        }
    }

    // method overloading
    public void walk(int distanceWithCm) {
        System.out.println(getFullName() + " just walked " + distanceWithCm + " km");
    }

    public String getFullName() {
//        walk(3,true);
        return this.firstName + ", " + this.lastName;
    }

    // accessor methods: getter, setter

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.contains("$")) {
            System.out.println("$ symbol is not allowed");
            return;
        }

        if (firstName.length() <= 9) {
            this.firstName = firstName;
        } else {
            System.out.println("Provided '" + firstName + "' length is too long!");
        }
    }
}
