package hw03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    Number lib_number;

    @BeforeEach
    void initForTest() {
        lib_number = new Number();
    }

    //Задание 2.
    //Разработайте и протестируйте метод numberInInterval, который проверяет,
    //попадает ли переданное число в интервал (25;100)
    //покрыть тестами метод на 100%
    @ParameterizedTest
    @ValueSource(ints = {55})
    void isNumberInInterval(int input_number) {
        assertTrue(lib_number.numberInInterval(input_number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    void isNumberNotInInterval(int input_number) {
        assertFalse(lib_number.numberInInterval(input_number));
    }

    //Задание 1.
    //Напишите тесты, покрывающие на 100% метод evenOddNumber,
    //который проверяет, является ли переданное число четным или нечетным:
    @ParameterizedTest
    @ValueSource(ints = {2})
    void isNumberEven(int input_number) {
        assertTrue(lib_number.evenOddNumber(input_number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    void isNumberOdd(int input_number) {
        assertFalse(lib_number.evenOddNumber(input_number));
    }
}
