package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {



    @Test
    void shouldReturnZero(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.stringcalculator(""),0);
    }
}
