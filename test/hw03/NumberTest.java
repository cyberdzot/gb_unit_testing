package hw03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    Number libNumber;

    @BeforeEach
    void initForTest() {
        libNumber = new Number();
    }

    //Задание 2.
    //Разработайте и протестируйте метод numberInInterval, который проверяет,
    //попадает ли переданное число в интервал (25;100)
    //покрыть тестами метод на 100%
    @Test
    void isNumberInInterval() {
        assertTrue(libNumber.numberInInterval(55));
    }

    @Test
    void isNumberNotInInterval() {
        assertFalse(libNumber.numberInInterval(15));
    }

    //Задание 1.
    //Напишите тесты, покрывающие на 100% метод evenOddNumber,
    //который проверяет, является ли переданное число четным или нечетным:
    @Test
    void isNumberEven() {
        assertTrue(libNumber.evenOddNumber(2));
    }

    @Test
    void isNumberOdd() {
        assertFalse(libNumber.evenOddNumber(1));
    }
}
