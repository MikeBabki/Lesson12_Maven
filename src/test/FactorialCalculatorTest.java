import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(120, calculator.calculateFactorial(5));
    }
}