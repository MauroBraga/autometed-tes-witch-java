package br.com.mrb.math;

import br.com.mrb.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTestS3 {

    SimpleMath math ;
    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll Method");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Running @AfterAll Method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Running @AfterEach Method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Running @BeforeEach Method");
        this.math= new SimpleMath();
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        //AAA Arrange ACt Assert
        //GIVEN ARRANGE

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //WHEN ACT
        Double actual = this.math.sum(firstNumber, secondNumber);

        //THEN ASSERT
        assertEquals(expected, actual,
                () -> firstNumber + "+" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = this.math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 * 2 =12.4")
    void testMultiplication() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = this.math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual,
                () -> firstNumber + "*" + secondNumber +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = this.math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber +
                        " did not produce " + expected + "!");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test Division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        //given
        double firstNumber = 6.2D;
        double secondNumber = 0;

        var expectedMessage = "Impossible to divide by zero!";

        //when e then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () ->{
           this.math.division(firstNumber,secondNumber);
        },() -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage,actual.getMessage(), () -> "Unexpected exception mensage");
    }

    @Test
    @DisplayName("Test (6.2 + 2)/2 = 8.2")
    void testMean() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = this.math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual,
                () -> "(" + firstNumber + "+" + secondNumber + ")/2" +
                        " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test  SquareRoot 81 = 9")
    void testSquareRoot() {

        double number = 81D;
        double expected = 9D;

        Double actual = this.math.squareRoot(number);

        assertEquals(expected, actual,
                () -> "Square Root of " + number +
                        " did not produce " + expected + "!");
    }
}
