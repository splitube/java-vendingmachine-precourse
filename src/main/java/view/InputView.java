package view;

public class InputView {

    static public void print(ViewMessages messages) {
        System.out.println(messages);
    }

    public void insertChanges() {
        print(ViewMessages.INSERT_CHANGES);
    }

    public void insertProducts() {
        print(ViewMessages.INSERT_PRODUCTS);
    }

    public void insertMoney() {
        print(ViewMessages.INSERT_MONEY);
    }

    public void insertPurchase() {
        print(ViewMessages.INSERT_PURCHASE);
    }
}
