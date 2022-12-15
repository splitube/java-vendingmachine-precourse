package Validate;

public enum ErrorMessages {
    ERROR("[ERROR]"),
    NOT_A_NUMBER("입력값이 숫자가 아닙니다."),
    NO_INPUT("입력값이 없습니다.");

    final private String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
