package Validate;

public class Validator {

    public static void isNumber(String input) {
        input.chars().forEach(c -> {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ErrorMessages.ERROR.toString() + ErrorMessages.NOT_A_NUMBER);
            }
        });
    }

    public static void noInput(String input) {
        if (input.equals("")) {
            throw new IllegalArgumentException(ErrorMessages.ERROR.toString() + ErrorMessages.NO_INPUT);
        }
    }
}
