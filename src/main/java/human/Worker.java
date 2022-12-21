package human;

public class Worker extends Human {
    private String workAddress;
    private long salary;

    public Worker() {

    }

    public Worker(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber);
//        super();
//        System.out.println("Complex Worker constructor");
        this.workAddress = workAddress;
    }

//    public Worker() {
//        System.out.println("Create a new Worker");
////        super();
//    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
