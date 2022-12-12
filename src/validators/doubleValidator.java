package validators;

import exceptions.LessThanZeroException;

public class doubleValidator {
    private final static doubleValidator instance = new doubleValidator();

    public static doubleValidator getInstance() {
        return instance;
    }

    public static boolean validate(double value) {
        try {
            lessThanZero(value);
        } catch (LessThanZeroException e) {
            throw e;
        }
        return true;
    }

    public static boolean lessThanZero(double value) {
        if(value < 0) {
            throw new LessThanZeroException("Wymiar bryly musi byc wiekszy lub rowny zero. Podano wartosc " + value);
        } else {
            return true;
        }
    }
}
