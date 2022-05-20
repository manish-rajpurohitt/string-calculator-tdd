import java.util.regex.*;

public class StringCalculator {
    public int Add(String numbers){
        if(!numbers.isEmpty()){
            String[] splitNumbers = getSplitNumbersFromString(numbers);
            return getSumOfNumbersFromStringArray(splitNumbers);
        }else return 0;
    }
    private int getSumOfNumbersFromStringArray(String[] stringsArray) throws NumberFormatException{
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();

        for(String number : stringsArray){
            int intValue = Integer.parseInt(number);
            if(intValue < 0) {
                negativeNumbers.append(intValue).append(" ");
            }
            else sum += intValue;
        }
        if(negativeNumbers.length() == 0) return sum;
        else throw new RuntimeException("negatives not allowed " + negativeNumbers);
    }
    private String[] getSplitNumbersFromString(String input){
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        String delimiter = matcher.matches() ? matcher.group(1) : "[,\n]";
        String numbers = matcher.matches() ? matcher.group(2) : input;
        return numbers.split(delimiter);
    }
}

