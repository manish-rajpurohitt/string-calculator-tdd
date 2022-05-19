public class StringCalculator {
    public int Add(String numbers){
        if(!numbers.isEmpty()){
            if(numbers.contains("-")) throw new NumberFormatException("negatives no allowed");
            String delimiter = numbers.startsWith("//") ? getDelimiterFromString(numbers) : "[,\n]";
            numbers = numbers.startsWith("//") ? numbers.split("\n")[1] : numbers;
            String[] stringsArrayOfNumbers = numbers.split(delimiter);
            return getSumOfNumbersFromStringArray(stringsArrayOfNumbers);
        }else return 0;
    }

    private int getSumOfNumbersFromStringArray(String[] stringsArray){
        int sum = 0;
        for(String number : stringsArray){
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    private String getDelimiterFromString(String input){
        return String.valueOf(input.split("\n")[0].charAt(2));
    }
}

