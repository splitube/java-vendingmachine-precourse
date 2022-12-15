package view;

import Validate.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    static public void print(ViewMessages message) {
        System.out.println(message);
    }

    public long insertHoldingAmount() {
        print(ViewMessages.INSERT_CHANGES);
        String holdingAmountInput = Console.readLine();
        return getHoldingAmount(holdingAmountInput);
    }

    public long getHoldingAmount(String holdingAmountInput) {
        Validator.isNumber(holdingAmountInput);
        Validator.noInput(holdingAmountInput);
        return Long.parseLong(holdingAmountInput);
    }

    public void printInsertProducts() {
        print(ViewMessages.INSERT_PRODUCTS);
    }

    public void printInsertMoney() {
        print(ViewMessages.INSERT_MONEY);
    }

    public void printInsertPurchase() {
        print(ViewMessages.INSERT_PURCHASE);
    }
}
