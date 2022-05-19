import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();
    @Test
    public void TestCalculator(){
        assertEquals(calculator.Add(""),0);
    }
}
