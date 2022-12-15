package view;

public enum ViewMessages {
    INSERT_CHANGES("자판기가 보유하고 있는 금액을 입력해 주세요."),
    SHOW_CHANGES("자판기가 보유한 동전"),
    INSERT_PRODUCTS("상품명과 가격, 수량을 입력해 주세요."),
    INSERT_MONEY("투입 금액을 입력해 주세요."),
    INSERT_PURCHASE("구매할 상품명을 입력해 주세요."),
    CHANGES("잔돈");

    final private String message;

    ViewMessages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
