package br.com.mrb;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTestS4 {

    SimpleMath math ;


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

    @ParameterizedTest
    @DisplayName("Test 6.2 / 2 = 3.1")
    //@MethodSource("testDivisionInputParameters")
    @MethodSource()
    void testDivision(double firstNumber, double secondNumber,double expected) {
        Double actual = this.math.division(firstNumber, secondNumber);

        assertEquals(expected, actual,2D,
                () -> firstNumber + "/" + secondNumber +
                        " did not produce " + expected + "!");
    }

    public static Stream<Arguments> testDivision(){
        return Stream.of(
                Arguments.of(6.2D,2D,3.1D),
                Arguments.of(71D,14D,5.07D),
                Arguments.of(18.3D,3.1D,5.90D)
        );
    }

}
