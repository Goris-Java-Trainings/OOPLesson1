package human;

import enums.Currency;
import interfaces.Payable;

public class Programmer extends Worker implements Payable {
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
        return getFirstName() + "]]]]]]]]] " + getLastName();
    }

    @Override
    public double payDaily(Currency currency) {
        double value;
        switch (currency) {
            case AED:
                value = getSalary() * 1.54;
                break;
            case EUR:
                value = getSalary() * 1.06;
                break;
            case USD:
            default:
                value = getSalary();
        }
        System.out.println("I am not receiving my salary daily!");
        return value;
    }

    @Override
    public void payMonthly() {
        System.out.println("My salary is :" + getSalary());
    }

    @Override
    public void payYearly() {
        System.out.println("I am not receiving my salary yearly!");
    }
}
