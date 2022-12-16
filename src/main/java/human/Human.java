package human;

import org.example.Main;

public class Human {

    // behavior
    // OOP principles
    // 1. Encapsulation -> capsula       code + behavior

    private String firstName; // null

    private String lastName;

    private Integer age = 76;

    private String gender = "UNKNOWN";

    private String passportNumber;

    /*// default constructor
    public Human() {
        // constructor
        System.out.println("Created a new human!");
    }*/

    public Human(int ageParameter, String passportNumber) {
        this.passportNumber = passportNumber;
        if (ageParameter >= 0) {
            this.age = ageParameter;
        }
//        Main.main(new String[7]);
    }

    public Human(String gender, int ageParameter, String firstName, String lastName, String passportNumber) {
        this.age = ageParameter + 6;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.passportNumber = passportNumber;
    }

    public void printAge() {
        System.out.println(age);
    }

    public void walk(int distance, boolean b) {
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


    private String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    // accessor methods: getter, setter

    public String getFirstName() {
        return "[NAME]: " + this.firstName;
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
