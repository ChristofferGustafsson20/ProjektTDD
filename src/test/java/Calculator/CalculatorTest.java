package Calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturnZero() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    void shouldReturnOne() {
        assertEquals(calculator.add("1"), 1);
    }

    @Test
    void shouldReturnNumbersSeperated() {
        assertEquals(calculator.add("1,2"), 3);
    }
    @Test
    void shouldReturnNumbersSeperatedWithNewLine() {
        assertEquals(calculator.add("1\n2,3"), 6);
    }

}
