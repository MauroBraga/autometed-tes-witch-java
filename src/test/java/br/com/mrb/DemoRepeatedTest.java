package br.com.mrb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

public class DemoRepeatedTest {

    SimpleMath math ;
    @BeforeEach
    void beforeEach(){
        System.out.println("Running @BeforeEach Method");
        this.math= new SimpleMath();
    }
    @RepeatedTest(value = 3, name = "{displayName}. Repetition "+" {currentRepetition} of {totalRepetitions}!" )
    @DisplayName("Test Division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo
    ) {

        System.out.println("Repetition N "+repetitionInfo.getCurrentRepetition()
            +" Of "+ repetitionInfo.getTotalRepetitions()
        );



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
}
