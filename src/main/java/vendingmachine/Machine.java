package vendingmachine;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Machine {

    private long holdingAmount;
    final private List<Integer> coinAmounts = new ArrayList<>();

    Machine(long holdingAmount) {
        this.holdingAmount = holdingAmount;
    }

    void makeRandomCoins() {
        List<Coin> coinOrder = List.of(Coin.COIN_500, Coin.COIN_100, Coin.COIN_50, Coin.COIN_10);
        coinOrder.forEach(coin -> {
            coinAmounts.add(getRandomAmount(coin));
        });
    }

    int getRandomAmount(Coin coin) {
        if (coin == Coin.COIN_10) {
            return (int) holdingAmount / coin.getAmount();
        }
        int amount = Randoms.pickNumberInRange(0, (int) holdingAmount / coin.getAmount());
        holdingAmount -= coin.getAmount() * amount;
        return amount;
    }
}
