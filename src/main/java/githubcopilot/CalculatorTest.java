package githubcopilot;

import githubcopilot.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void additionReturnsCorrectSumForPositiveNumbers() {
        Assert.assertEquals(Calculator.add(10, 5), 15);
    }

    @Test
    public void additionReturnsCorrectSumForNegativeNumbers() {
        Assert.assertEquals(Calculator.add(-10, -5), -15);
    }

    @Test
    public void subtractionReturnsCorrectResultForPositiveNumbers() {
        Assert.assertEquals(Calculator.subtract(10, 5), 5);
    }

    @Test
    public void subtractionReturnsCorrectResultForNegativeNumbers() {
        Assert.assertEquals(Calculator.subtract(-10, -5), -5);
    }

    @Test
    public void multiplicationReturnsCorrectProductForPositiveNumbers() {
        Assert.assertEquals(Calculator.multiply(10, 5), 50);
    }

    @Test
    public void multiplicationReturnsZeroWhenOperandIsZero() {
        Assert.assertEquals(Calculator.multiply(10, 0), 0);
    }

    @Test
    public void divisionReturnsCorrectQuotientForPositiveNumbers() {
        Assert.assertEquals(Calculator.divide(10, 5), 2.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divisionThrowsExceptionWhenDividingByZero() {
        Calculator.divide(10, 0);
    }

    @Test
    public void divisionReturnsCorrectResultForNegativeNumbers() {
        Assert.assertEquals(Calculator.divide(-10, -5), 2.0);
    }
}