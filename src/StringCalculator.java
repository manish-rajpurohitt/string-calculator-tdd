import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int Add(String numbers){
        if(!numbers.isEmpty()){
            String delimiter = "";
            if(numbers.startsWith("//")){
                delimiter = String.valueOf(numbers.split("\n")[0].charAt(2));
                numbers = numbers.split("\n")[1];
            }
            List<Integer> integersList = new ArrayList<>();

            String[] stringsArrayOfNumbers = delimiter.equals("") ? numbers.split("[,\n]"): numbers.split(delimiter);
            int sum = 0;
            for (String stringsArrayOfNumber : stringsArrayOfNumbers) {
                sum += Integer.parseInt(stringsArrayOfNumber);
            }
            return sum;
        }else return 0;
    }
}

