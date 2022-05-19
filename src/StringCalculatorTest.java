import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();
    @Test
    public void TestCalculator(){
        assertEquals(calculator.Add(""),0);
        assertEquals(calculator.Add("1"),1);
        assertEquals(calculator.Add("1,2"),3);
        assertEquals(calculator.Add("1,2,3,4,5,6,7,8,9,10,100,200"),355);
    }
}
