package ec.fmia.tdd.kata;

public class Calculator {

    public static int add(String numbers) {

        int sum = 0;
        String[] numbersArray = numbers.split(",|n");

        for (String number : numbersArray) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }

}
