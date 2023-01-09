package human;

import enums.Currency;
import interfaces.Payable;
import interfaces.Singable;
import org.example.Mobile;
//import org.example.Mobile;

public class Doctor extends Worker implements Payable, Singable { // IS-A   (Inheritance)
    private Mobile mobile;  // HAS-A   (Composition)
    private int degree;

    public Doctor(String gender, int ageParameter, String firstName, String lastName, String passportNumber, String workAddress) {
        super(gender, ageParameter, firstName, lastName, passportNumber, workAddress);
        Mobile mobile1 = new Mobile();
    }

    @Override
    public double payDaily(Currency currency) {
        return 0.0;
    }

    @Override
    public double print(Currency currency, int a) {
        return Singable.super.println(currency, a);
    }

    @Override
    public void payMonthly() {

    }

    @Override
    public void payYearly() {

    }
}
