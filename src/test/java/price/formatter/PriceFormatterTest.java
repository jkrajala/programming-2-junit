package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    @Test
    void spaceBetweenThousands() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123 456 €", formatter.formatPrice(123456));
        assertEquals("123 456 789 €", formatter.formatPrice(123456789));
    }

    @Test
    void commaAsSeparator() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123,45 €", formatter.formatPrice(123.45));
    }

    @Test
    void decimalPartIsTwoDigits() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123,12 €", formatter.formatPrice(123.1211111));
    }

    @Test
    void decimalPartIsOmitted() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123 €", formatter.formatPrice(123.00));
    }

    @Test
    void decimalPartIsRounded() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123,46 €", formatter.formatPrice(123.456));
        assertEquals("123,45 €", formatter.formatPrice(123.454));
    }

    @Test
    void hasEuroSymbol() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("123 €", formatter.formatPrice(123));
    }
}
