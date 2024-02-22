import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        Assert.assertEquals(calculator.calculateFactorial(5), 120);
    }
}