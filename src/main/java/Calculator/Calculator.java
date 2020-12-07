package Calculator;

public class Calculator {


    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }else if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }

        numbers = numbers.replaceAll("\\n", ",");
        String[] numberArray = numbers.split(",");

        int ret = 0;
        for (String num : numberArray){
            ret += Integer.parseInt(num);
        }
        return ret;
    }
}
