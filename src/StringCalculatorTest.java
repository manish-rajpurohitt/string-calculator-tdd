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
        assertEquals(calculator.Add("1\n2,3"),6);
        assertEquals(calculator.Add("1\n2,3\n4\n5\n6\n1,4,5,6,7,8\n8"),60);
        assertEquals(calculator.Add("//;\n1;2;3;1;4;5;6;7;8;8"),45);
        assertEquals(calculator.Add("//;\n1;2;3;14;4;8"),32);
        assertEquals(calculator.Add("//'\n4'5'6'7'8'8"),38);
        assertEquals(calculator.Add("//@\n4@5@6@7@8@8"),38);

    }
}
