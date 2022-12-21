package interfaces;

import enums.Currency;

public interface Payable {
    double payDaily(Currency currency);  // method definition

    void payMonthly();

    void payYearly();

    // TODO there are also 'default' and 'static' methods
    // TODO which we will cover in next Lesson
}
