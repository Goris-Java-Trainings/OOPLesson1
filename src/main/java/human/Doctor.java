package human;

import human.Worker;
import org.example.Mobile;
//import org.example.Mobile;

public class Doctor extends Worker { // IS-A   (Inheritance)
    //    private String firstName;
//    private String lastName;
//    private String passportNumber;
//    private Integer age;
    private Mobile mobile;  // HAS-A   (Composition)
    private int degree;

    public Doctor(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber, workAddress);
        System.out.println("Create a new Doctor: " + getFullName());
        Mobile mobile1 = new Mobile();
    }
}
