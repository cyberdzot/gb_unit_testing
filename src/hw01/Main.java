package hw01;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Main {
    public static void main(String[] args) {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-1, 50))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 101))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");

        assertThat(Calculator.calculateDiscount(5200, 10)).isEqualTo(4680);
    }
}