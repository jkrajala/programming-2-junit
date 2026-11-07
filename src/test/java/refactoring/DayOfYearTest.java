package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DayOfYearTest {

    @Test
    void correctDayIfNotLeapYear() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2025));
        assertEquals(31, DayOfYear.dayOfYear(1, 31, 2025));
        assertEquals(59, DayOfYear.dayOfYear(2, 28, 2025));
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 2025));
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2025));

    }

    @Test
    void correctDayIfLeapYear() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2020));
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2020));
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2020));
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2020));

    }
}
