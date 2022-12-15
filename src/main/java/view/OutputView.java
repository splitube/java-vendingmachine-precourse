package view;

public class OutputView {

    static public void print(ViewMessages message) {
        System.out.println(message);
    }

    public void showChanges() {
        print(ViewMessages.SHOW_CHANGES);
    }

    public void changes() {
        print(ViewMessages.CHANGES);
    }
}
