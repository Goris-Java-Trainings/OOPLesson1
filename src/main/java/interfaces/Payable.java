package interfaces;

import enums.Currency;

public interface Payable {
    // v1
    double payDaily(Currency currency);  // method definition

    // v2
    default double print(Currency currency, int a) {
        // default implementation
        // a == 4
        if(currency.equals(Currency.AED)) {
            return 9.0;
        }
        return 10.0;
    }

    // v2
    static double copy(Currency currency, int a) {
        // default implementation
        // a == 4
        if(currency.equals(Currency.AED)) {
            return 9.0;
        }
        return 10.0;
    }

    // v1
    void payMonthly();

    //v1
    void payYearly();

    // changes in existing implementations
    // Backward compatibility
    // TODO static class

    // TODO equals and hashcode methods of Object.java class
    // TODO pointer, reference

    // primitives | reference

    public class B {

    }
}
