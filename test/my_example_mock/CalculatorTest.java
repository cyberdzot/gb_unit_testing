package my_example_mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    @Mock
    private Calculator calculator;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAdd() {
        when(calculator.add(3, 4)).thenReturn(7); // устанавливаем мок-ответ
        int result = calculator.add(3, 4); // вызов метода add
        assertEquals(7, result); // проверяем, что результат равен ожидаемому
    }
}
