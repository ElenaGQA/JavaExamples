import lesson7.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {


    @BeforeAll
    public static void classSetup() {
        System.out.println("Before all methods");
    }

    @AfterAll
    public static void classTeardown() {
        System.out.println("After all methods");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Before each method");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("After each method");
    }

    // example of putting all data in one place, Stream, instead of creating multiple tests
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, 4, 8, Calculator.Type.MULTIPLICATION),
                Arguments.of(2, 4, 6, Calculator.Type.SUMMARY),
                Arguments.of(6, 4, 2, Calculator.Type.SUBTRACTION),
                Arguments.of(12, 4, 3, Calculator.Type.DIVISION)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(int a, int b, double expectedResult, Calculator.Type type) {
        double actualResult = Calculator.calculate(a, b, type);
        assertEquals(expectedResult, actualResult);
    }

    // example of CsvSource data delivery. Can be put in Csv file (use ScvFileSource)
    @ParameterizedTest
    @CsvSource({"2,2,4,MULTIPLICATION","2,3,5,SUMMARY","6,4,2, SUBTRACTION","12,4,3,DIVISION"})
    public void csvSourceTest(int a, int b, double expectedResult, Calculator.Type type) {
        double actualResult = Calculator.calculate(a, b, type);
        assertEquals(expectedResult, actualResult);
    }


    // example of enum used in 1 test
    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypesTest(Calculator.Type type) {
        int a = 25;
        int b = 3;
        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult > 0);
    }

    // example of multiple values in 1 test
    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 23, 23264357, -32990753})
    public void summaryParamsTest(int a) {
        int b = 3;
        double expectedResult = b + a;
        double actualResult = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Summary result is correct");
    }

    // example of basic test
    @Test
    public void summaryTest() {
        int a = 5;
        int b = 3;
        double expectedResult = 8;
        double actualResult = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult, "Summary result is correct");
        assertTrue(actualResult > 0);
        assertFalse(actualResult == 0);
    }

    // example of basic test
    @Test
    public void divisionTest() {
        int a = 10;
        int b = 2;
        double expectedResult = 2;
        double actualResult = Calculator.calculate(a, b, Calculator.Type.DIVISION);
        assertEquals(expectedResult, actualResult, "Division result is incorrect");
    }

    // example of checking that errors are thrown
    @Test
    @DisplayName("Nullpointer Exception test")
    public void errorTest() {
        int a = 5;
        int b = 3;
        double expectedResult = 8;
        assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(a, b, null);
        });

    }

}

