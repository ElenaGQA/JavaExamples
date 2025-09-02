import lesson8homework.Weekdays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeekdaysTest {

    private static final Logger logger = LogManager.getLogger(WeekdaysTest.class);


    @ParameterizedTest
    @CsvSource({"1,Sunday","2,Monday","3, Tuesday","4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday"})
    public void validInputCasesWeekdaysTest(Integer dayNumber, String expectedResult) {
        String actualResult = Weekdays.getDay(dayNumber);
        logger.info("Valid input [{}] → expected [{}], got [{}]", dayNumber, expectedResult, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -100})
    public void invalidLowInputCasesWeekdaysTest(Integer a) {
        String expectedResult = "The number should be equal or larger than 1";
        String actualResult = Weekdays.getDay(a);
        logger.warn("Invalid low input [{}] → expected [{}], got [{}]", a, expectedResult, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 100})
    public void invalidHighInputCasesWeekdaysTest(Integer a) {
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = Weekdays.getDay(a);
        logger.warn("Invalid high input [{}] → expected [{}], got [{}]", a, expectedResult, actualResult);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("NullPointerException test")
    public void NullPointerExceptionTest() {
        logger.error("Testing with null input → expecting NullPointerException");
        Integer a = null;
        assertThrows(NullPointerException.class, () -> {
            Weekdays.getDay(a);
        });
    }
}
