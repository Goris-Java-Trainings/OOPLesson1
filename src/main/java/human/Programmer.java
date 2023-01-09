package human;

import car.Car;
import enums.Currency;
import interfaces.Payable;

// Outer class
public class Programmer extends Worker implements Payable {
//    private String firstName;
//    private String lastName;
//    private String passportNumber;
//    private Integer age;
    private int seniorityLevel;
    private String programmingLanguage;

    public static Human human;

    public Car abc() {
        // anonymous class example
        // InheritedDetails
        Details details = new Details() {
            @Override
            public void printName() {
                System.out.println("[" + getFirstName() + "] : [" + getLastName() + "]");
            }
        };

//        Details details = new InheritedDetails();
        details.printName();

        Details details1 = new Details() {
            @Override
            public void printName() {
                System.out.println("{" + getFirstName() + "}:{" + getLastName() + "}");
            }
        };

        return new Car() {
            @Override
            public void drive() {
                System.out.println("I am driving Volga");
            }

            @Override
            public void work() {
                System.out.println("I am working from home");
            }
        };
    }

    // Inner class
    class Details {

        public String fullName;

        private /*static*/ int workingHours = 40; // static instance variables are actual from Java 16+

        public Details() {
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void printName() {
            System.out.println(getFirstName() + "   :    " + getLastName());
        }
    }

    /*class InheritedDetails extends Details {
        @Override
        public void printName() {
            System.out.println("[" + getFirstName() + "] : [" + getLastName() + "]");
        }
    }*/

    public Programmer() {

    }
    public Programmer(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber, workAddress);
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
