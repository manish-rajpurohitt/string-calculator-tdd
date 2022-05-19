import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int Add(String numbers){
        if(!numbers.isEmpty()){
            List<Integer> integersList = new ArrayList<>();
            String[] stringsArrayOfNumbers = numbers.split(",");
            int sum = 0;
            for (String stringsArrayOfNumber : stringsArrayOfNumbers) {
                sum += Integer.parseInt(stringsArrayOfNumber);
            }
            return sum;
        }else return 0;
    }
}

