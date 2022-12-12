package exceptions;

public class LessThanZeroException extends IllegalArgumentException {
    public LessThanZeroException(String errorMessage) {
        super(errorMessage);
    }
}
