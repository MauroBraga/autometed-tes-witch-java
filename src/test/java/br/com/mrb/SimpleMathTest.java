package br.com.mrb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        //AAA Arrange ACt Assert
        //GIVEN ARRANGE
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //WHEN ACT
        Double actual = math.sum(firstNumber, secondNumber);

        //THEN ASSERT
        assertEquals(expected, actual,
                () -> firstNumber + "+" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 * 2 =12.4")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual,
                () -> firstNumber + "*" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber +
                        " did not produce " + expected + "!");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @Disabled
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }

    @Test
    @DisplayName("Test (6.2 + 2)/2 = 8.2")
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual,
                () -> "(" + firstNumber + "+" + secondNumber + ")/2" +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test  SquareRoot 81 = 9")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 81D;
        double expected = 9D;

        Double actual = math.squareRoot(number);

        assertEquals(expected, actual,
                () -> "Square Root of " + number +
                        " did not produce " + expected + "!");
    }
}
