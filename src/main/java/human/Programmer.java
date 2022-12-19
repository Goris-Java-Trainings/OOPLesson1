package human;

public class Programmer extends Worker {
//    private String firstName;
//    private String lastName;
//    private String passportNumber;
//    private Integer age;
    private int seniorityLevel;
    private String programmingLanguage;

    public Programmer(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber, workAddress);
    }

    @Override
    public String getFullName() {
        return getFirstName() + " :: " + getLastName();
    }
}
