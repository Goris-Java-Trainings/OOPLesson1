package interfaces;

import enums.Currency;
import human.Human;

public interface Singable {
    void sing(long duration);

    default double print(Currency currency, int a) {
        // default implementation
        // a == 4
        if(currency.equals(Currency.EGP)) {
            return 19.0;
        }
        return 3340.0;
    }

    default double println(Currency currency, int a) {
        // default implementation
        // a == 4
        if(currency.equals(Currency.EGP)) {
            return 19.0;
        }
        return 3340.0;
    }

    static double copy(Currency currency, int a) {
        // default implementation
        // a == 4
        if(currency.equals(Currency.HKD)) {
            return 56.0;
        }
        return 14.0;
    }
}
