package ec.fmia.tdd.kata;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ec.fmia.junit.Calculator;

public class CalculatorJUnit {

    // Requirement 1: The method can take 0, 1 or 2 numbers separated by comma (,).

    @Test(expected = RuntimeException.class)
    @Ignore
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        Calculator.add("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Calculator.add("1,X");
    }

    // Requirement 2: For an empty string the method will return 0

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, Calculator.add(""));
    }

    // Requirement 3: Method will return their sum of numbers

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(3, Calculator.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(3 + 6, Calculator.add("3,6"));
    }

    // Requirement 4: Allow the Add method to handle an unknown amount of numbers

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, Calculator.add("3,6,15,18,46,33"));
    }

}
