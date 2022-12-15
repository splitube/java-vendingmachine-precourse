package view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InputViewTest {

    @DisplayName("보유 금액 입력 기능")
    @ParameterizedTest
    @CsvSource({"1000, 1000", "500, 500"})
    void getHoldingAmount(String input, long expect) {
        InputView inputView = new InputView();
        long result = inputView.getHoldingAmount(input);
        Assertions.assertThat(result).isEqualTo(expect);
    }
}