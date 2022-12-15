package vendingmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MachineTest {

    private Machine machine;

    @BeforeEach
    void before() {
        machine = new Machine(1000);
    }

    @Test
    void makeRandomCoins() {

    }

    @Test
    void getRandomAmount() {
    }
}