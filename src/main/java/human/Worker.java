package human;

public class Worker extends Human {
    private String workAddress;
    private long salary;

    private static final boolean IS_AVAILABLE_FOR_WORK = true; // constant
    private static final Integer MAX_AGE_ELIGIBLE_FOR = 64;

    public static final Human FIRST_HUMAN_EVER = new Human("MALE", 223, "ADAM", "SMITH", "jdfrewndj");

    public Worker() {

    }
    public Worker(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber);
//        super();
        System.out.println("Complex Worker constructor");
        this.workAddress = workAddress;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
